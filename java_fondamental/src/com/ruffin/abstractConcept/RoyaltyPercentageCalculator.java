package com.ruffin.abstractConcept;

public class RoyaltyPercentageCalculator extends RevenueCalculator {

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
