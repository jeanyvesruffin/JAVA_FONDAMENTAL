package com.ruffin.tp1.interfaceConcept;

public class HourlyRateCalculator implements RevenueCalculator {
	public static final double HOURLY_RATE = 50;
	private final double hourlyRate;

	public HourlyRateCalculator(final double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculate(ClientEngagement clientEngagement) {
		return hourlyRate * clientEngagement.getHoursWorked();
	}

}
