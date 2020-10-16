package com.ruffin.interfaceAndAbstract;

public class ClientEngagement {


	private String client;
	private int hoursWorked;
	private int anticipatedRevenue;
	
	public ClientEngagement(String client, int hoursWorked, int anticipatedRevenue) {
		super();
		this.client = client;
		this.hoursWorked = hoursWorked;
		this.anticipatedRevenue = anticipatedRevenue;
	}
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public int getAnticipatedRevenue() {
		return anticipatedRevenue;
	}
	
	public void setAnticipatedRevenue(int anticipatedRevenue) {
		this.anticipatedRevenue = anticipatedRevenue;
	}
	
	
	
}
