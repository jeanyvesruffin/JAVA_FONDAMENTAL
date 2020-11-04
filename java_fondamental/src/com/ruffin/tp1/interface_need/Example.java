package com.ruffin.tp1.interface_need;

public class Example {

	public static void main(String[] args) {
		ClientEngagementRepository repository = null;
		final Iterable<ClientEngagement> engagements = repository
				.find(new Query().atLeastHoursWorked(3).clientName("RUFFIN"));

		engagements.iterator();

		for (ClientEngagement clientEngagement : engagements) {
			System.out.println(clientEngagement);
			
		}

	}

}
