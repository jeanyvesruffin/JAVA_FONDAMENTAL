package com.ruffin.abstractAndInterface.interface_need;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CsvClientEngagementRepository implements ClientEngagementRepository {

	private List<ClientEngagement> engagements;
	private final CsvPersistor persistor;
	private int nextInt = 1;

	public CsvClientEngagementRepository(final String path) {
		super();
		persistor = new CsvPersistor(path);
		engagements = persistor.load();

	}

	@Override
	public void close() throws Exception {
		persistor.save(engagements);

	}

	@Override
	public void add(ClientEngagement engagement) throws RepositoryException {
		if (engagement.getId() == NO_ID) {
			engagements.add(engagement);
			engagement.setId(nextInt++);
		}
	}

	@Override
	public void remove(ClientEngagement engagementToRemove) throws RepositoryException {
		if (engagements.removeIf(engagement -> engagement.getId() == engagementToRemove.getId())) {
			engagementToRemove.setId(NO_ID);
		}
	}

	@Override
	public Iterable<ClientEngagement> find(Query query) throws RepositoryException {

		return engagements.stream().filter(filterOf(query)).collect(Collectors.toList());
	}

	private Predicate<? super ClientEngagement> filterOf(final Query query) {
		final String client = query.getClientName();
		return engagement -> engagement.getHoursWorked() >= query.getAtLeastHoursWorked()
				&& (client == null || engagement.getClient().equals(client));
	}

}
