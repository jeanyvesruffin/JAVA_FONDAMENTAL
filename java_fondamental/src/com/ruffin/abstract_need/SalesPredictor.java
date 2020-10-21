package com.ruffin.abstract_need;

import java.util.Arrays;
import static com.ruffin.abstract_need.FixedFeeCalculator.STANDARD_FEE;
import static com.ruffin.abstract_need.HourlyRateCalculator.HOURLY_RATE;
import static com.ruffin.abstract_need.RoyaltyPercentageCalculator.ROYALTY_PERCENTAGE;
import java.util.List;

public class SalesPredictor {

	public static void main(String[] args) {
		final List<ClientEngagement> clientEngagements = Arrays.asList(
				new ClientEngagement("Catherine's Cookie", 40, 40000), new ClientEngagement("Bob's Burgers", 30, 4000),
				new ClientEngagement("Dave's Doughnuts", 25, 1000), new ClientEngagement("Susan's Sausages", 10, 2000));
		System.out.println("Fixed fee ");
		printTotalRevenue(clientEngagements,  new FixedFeeCalculator(STANDARD_FEE));
		
		System.out.println("Hourly Rate ");
		printTotalRevenue(clientEngagements, new HourlyRateCalculator(HOURLY_RATE));
		
		System.out.println("Royalty share");
		printTotalRevenue(clientEngagements,  new RoyaltyPercentageCalculator(ROYALTY_PERCENTAGE));

	}

	private static void printTotalRevenue(final List<ClientEngagement> clientEngagements, final RevenueCalculator calculator) {
		double result = 0;
		for (ClientEngagement clientEngagement : clientEngagements) {
			result += calculator.calculate(clientEngagement);
		}
		System.out.println("Total : " + result);
	}
}
