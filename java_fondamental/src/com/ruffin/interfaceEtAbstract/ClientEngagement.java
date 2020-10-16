package com.ruffin.interfaceEtAbstract;

public class ClientEngagement {

	private final String client;
	private final int hoursWorked;
	private final double anticipatedRevenue;

	public ClientEngagement(String client, int hoursWorked, double anticipatedRevenue) {
		super();
		this.client = client;
		this.hoursWorked = hoursWorked;
		this.anticipatedRevenue = anticipatedRevenue;
	}

	public String getClient() {
		return client;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getAnticipatedRevenue() {
		return anticipatedRevenue;
	}

	@Override
	public String toString() {
		return "Contenu de la classe com.ruffin.interfaceAndAbstract.ClientEngagement :" + "Client : '" + client + '\''
				+ ", hoursWorked : " + hoursWorked + ", anticipatedRevenu : " + anticipatedRevenue;
	}
}
