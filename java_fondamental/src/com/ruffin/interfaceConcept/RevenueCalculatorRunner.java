package com.ruffin.interfaceConcept;

import static com.ruffin.abstractConcept.FixedFeeCalculator.STANDARD_FEE;
import static com.ruffin.abstractConcept.HourlyRateCalculator.HOURLY_RATE;
import static com.ruffin.abstractConcept.RoyaltyPercentageCalculator.ROYALTY_PERCENTAGE;;

public class RevenueCalculatorRunner {

	public static void main(String[] args) {
		final ClientEngagement clientEngagement = new ClientEngagement("ruffin", 100, 15000);
		final double hourlyPrice = new HourlyRateCalculator(HOURLY_RATE).calculate(clientEngagement);
		System.out.println("Prix horaire :" + hourlyPrice);

		final double fixedFeePrice = new FixedFeeCalculator(STANDARD_FEE).calculate(clientEngagement);
		System.out.println("Prix forfaitaire : " + fixedFeePrice);

		final double royaltyPercentagePrice = new RoyaltyPercentageCalculator(ROYALTY_PERCENTAGE)
				.calculate(clientEngagement);
		System.out.println("Prix royalty : " + royaltyPercentagePrice);

		// Exemple de polymorphisme
		RevenueCalculator revenueCalculator = new HourlyRateCalculator(50);
		final double price = revenueCalculator.calculate(clientEngagement);
		System.out.println("Prix avec le polymorphisme : " + price);

	}
}
