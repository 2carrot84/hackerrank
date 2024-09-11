package org.carrot84.tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

		int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

		int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

		Result.solve(meal_cost, tip_percent, tax_percent);

		bufferedReader.close();
	}

	static class Result {
		public static void solve(double meal_cost, int tip_percent, int tax_percent) {
			// System.out.printf("%f %d %d%n", mealCost, tipPercent, taxPercent);
			double tip = meal_cost * (tip_percent / 100.0);
			double tax = meal_cost * (tax_percent / 100.0);
			System.out.println(Math.round(meal_cost + tip + tax));
		}
	}
}
