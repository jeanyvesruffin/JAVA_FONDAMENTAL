package com.ruffin.abstractAndInterface.interface_need;

public class Query {

	private String client;
	private int atLeastHoursWorked;

	public Query clientName(String clientName) {
		this.client = clientName;
		return this;
	}

	public Query atLeastHoursWorked(int atLeastHoursWorked) {
		this.atLeastHoursWorked = atLeastHoursWorked;
		return this;
	}

	public int getAtLeastHoursWorked() {
		return atLeastHoursWorked;
	}

	public String getClientName() {
		return client;
	}

}
