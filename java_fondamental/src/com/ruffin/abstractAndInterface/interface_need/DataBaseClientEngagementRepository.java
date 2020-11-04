package com.ruffin.abstractAndInterface.interface_need;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class DataBaseClientEngagementRepository implements ClientEngagementRepository {

	private Connection connection;
	private PreparedStatement addStatement;
	private PreparedStatement removeStatement;

	public DataBaseClientEngagementRepository(final Connection connection) {
		this.connection = connection;
		try {
			// initialisation connection base de donnee
			connection.createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS " + "client_engagements ("
					+ "id INT IDENTITY," + "client VARCHAR(15) NOT NULL," + "hoursWorked INT NOT NULL" + ")");
			addStatement = connection.prepareStatement(
					"INSERT INTO client_engagements (client, hoursWorked) VALUES (?,?)", RETURN_GENERATED_KEYS);
			removeStatement = connection.prepareStatement("DELETE FROM client_engagement where id = ?");
		} catch (SQLException e) {
			throw new RepositoryException("Le repository ne peut pas etre initialise : ", e);
		}
	}

	@Override
	public void close() throws RepositoryException {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RepositoryException("La fermeture de la base de ddonnee a echoue", e);
		}

	}

	@Override
	public void add(ClientEngagement engagement) throws RepositoryException {
		try {
			addStatement.setString(1, engagement.getClient());
			addStatement.setInt(2, engagement.getHoursWorked());
			addStatement.executeUpdate();
			final ResultSet keys = addStatement.getGeneratedKeys();
			if (keys.next()) {
				final int id = keys.getInt("id");
				engagement.setId(id);
			}
		} catch (SQLException e) {
			throw new RepositoryException("L'ajout a echoue : " + engagement, e);
		}

	}

	@Override
	public void remove(ClientEngagement engagement) throws RepositoryException {
		try {
			removeStatement.setInt(1, engagement.getId());
			if (removeStatement.executeUpdate() > 0) {
				engagement.setId(NO_ID);
			}
		} catch (SQLException e) {
			throw new RepositoryException("La suppression a echoue : " + engagement, e);
		}

	}

	@Override
	public Iterable<ClientEngagement> find(Query query) throws RepositoryException {
		try {
			final Statement statement = connection.createStatement();
			final ResultSet resultSet = statement
					.executeQuery("SELECT * FROM client_engagements WHERE " + generateWhere(query));
			return new DatabaseIterable(resultSet);
		} catch (SQLException e) {
			throw new RepositoryException("La demande a echoue : " + query, e);
		}
	}

	private String generateWhere(Query query) {
		final StringBuilder builder = new StringBuilder();
		final boolean hasClientClause = query.getClientName() != null;
		if (hasClientClause) {
			builder.append("client ='").append(query.getClientName()).append("'");
		}
		final boolean hasHoursWorkedClause = query.getAtLeastHoursWorked() > 0;
		if (hasHoursWorkedClause) {
			if (hasClientClause) {
				builder.append(" and ");
			}
			builder.append(" hoursWorked >  ").append(query.getAtLeastHoursWorked());
		}
		if (!hasClientClause && !hasHoursWorkedClause) {
			return "true";
		}
		return builder.toString();
	}

}
