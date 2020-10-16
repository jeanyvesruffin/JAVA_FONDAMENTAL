package com.ruffin.interfaceEtAbstract;
import static com.ruffin.interfaceEtAbstract.HourlyRateCalculator.HOURLY_RATE;
import static com.ruffin.interfaceEtAbstract.FixedFeeCalculator.STANDARD_FEE;
import static com.ruffin.interfaceEtAbstract.RoyaltyPercentageCalculator.ROYALTY_PERCENTAGE;;

public class RevenueCalculatorRunner {

	public static void main(String[] args) {
		final ClientEngagement clientEngagement = new ClientEngagement("ruffin", 100, 15000);
		final double hourlyPrice = new HourlyRateCalculator(HOURLY_RATE).calculate(clientEngagement);
		System.out.println("Prix horaire" + hourlyPrice);
		
		final double fixedFeePrice = new FixedFeeCalculator(STANDARD_FEE).calculate(clientEngagement);
		System.out.println("Prix forfaitaire : " + fixedFeePrice);
		
		final double royaltyPercentagePrice = new RoyaltyPercentageCalculator(ROYALTY_PERCENTAGE).calculate(clientEngagement);
		System.out.println("Prix royalty : " + royaltyPercentagePrice);
		
	}
}
