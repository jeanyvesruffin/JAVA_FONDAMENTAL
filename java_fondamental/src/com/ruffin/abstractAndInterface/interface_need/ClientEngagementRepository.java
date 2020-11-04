package com.ruffin.abstractAndInterface.interface_need;

public interface ClientEngagementRepository extends AutoCloseable{

	int NO_ID = 0;

	void add(ClientEngagement engagement) throws RepositoryException;

	void remove(ClientEngagement engagement)throws RepositoryException;
	
	Iterable<ClientEngagement> find(final Query query)throws RepositoryException;

}
