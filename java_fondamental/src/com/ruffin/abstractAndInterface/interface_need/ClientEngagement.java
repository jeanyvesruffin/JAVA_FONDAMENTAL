package com.ruffin.abstractAndInterface.interface_need;

public class ClientEngagement {

	private final String client;
	private final int hoursWorked;
	private int id;
	
	public ClientEngagement(final String client, final int hoursWorked) {
		super();
		this.client = client;
		this.hoursWorked = hoursWorked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}


}
