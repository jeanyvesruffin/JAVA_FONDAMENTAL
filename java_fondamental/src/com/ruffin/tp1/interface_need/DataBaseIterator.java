package com.ruffin.tp1.interface_need;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class DataBaseIterator implements Iterator<ClientEngagement> {

	private ResultSet resultSet;

	public DataBaseIterator(final ResultSet resultSet) {
		super();
		this.resultSet = resultSet;
	}

	@Override
	public boolean hasNext() {
		try {
			return resultSet.next();
		} catch (SQLException e) {
			throw new RepositoryException("Impossible d'eitere le resultat ", e);
		}
	}

	@Override
	public ClientEngagement next() {
		try {
			final int id = resultSet.getInt(1);
			final String client = resultSet.getString(2);
			final int hoursWorked = resultSet.getInt(3);
			final ClientEngagement engagement = new ClientEngagement(client, hoursWorked);
			engagement.setId(id);
		} catch (SQLException e) {
			throw new RepositoryException("Impossible de lire l'engagemùent client", e);
		}
		
		return null;
	}

}
