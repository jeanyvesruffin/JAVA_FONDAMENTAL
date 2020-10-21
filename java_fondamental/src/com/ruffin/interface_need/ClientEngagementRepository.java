package com.ruffin.interface_need;

public interface ClientEngagementRepository {

	int NO_ID = 0;

	void add(ClientEngagement engagement);

	void remove(ClientEngagement engagemen);
	
	Iterable<ClientEngagement> find(final Query query);

}
