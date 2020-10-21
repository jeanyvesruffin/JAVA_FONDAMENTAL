package com.ruffin.abstract_need;

public class RoyaltyPercentageCalculator implements RevenueCalculator {

	public static final double ROYALTY_PERCENTAGE = 0.15;
	private final double royaltyPercentage;

	public RoyaltyPercentageCalculator(final double royaltyPercentage) {
		this.royaltyPercentage = royaltyPercentage;
	}

	@Override
	public double calculate(ClientEngagement clientEngagement) {
		return royaltyPercentage * clientEngagement.getAnticipatedRevenue();
	}

}
