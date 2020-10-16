package com.ruffin.interfaceAndAbstract;

public class RevenueCalculatorRunner {

	public static void main(String[] args) {
		
		final ClientEngagement clientEngagement = new ClientEngagement("ruffin", 100, 15000);

		
		// Prix horaire
		final double hourlyPrice = RevenueCalculator.price("Hourly", clientEngagement);
		System.out.println("Prix horaire : " + hourlyPrice);
		
		// Prix Tarification fixe fixedFee
		final double fixedFeePrice = RevenueCalculator.price("FixedFee", clientEngagement);
		System.out.println("Prix forfaitaire : " + fixedFeePrice);
		
		// Prix Royalty pourcentage
		final double royaltyPercentagePrice = RevenueCalculator.price("RoyaltyPercentage", clientEngagement);
		System.out.println("Prix des royalty : " + royaltyPercentagePrice);
		
	}
}
