package casestudy;

import java.util.Scanner;

public class BikeRentalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of custmers");
		int numCostmer = sc.nextInt();

		double totalIncome = 0;

		for (int i = 0; i < numCostmer; i++) {
			System.out.println("Custmer" + (i + 1) + ":");
			System.out.println("Enter the number of bikes rented");
			int numBikes = sc.nextInt();

			double custmerIncome = 0;

			for (int j = 0; j < numBikes; j++) {
				System.out.println("Enter the hours rented for bike" + (j + 1) + ":");
				double hoursRented = sc.nextDouble();

				double rentalCharge = calculateRentalCharge(hoursRented);
				custmerIncome += rentalCharge;
			}
			System.out.println("Total income for custmer" + (i + 1) + ":$" + custmerIncome);
			totalIncome += custmerIncome;
		}
		System.out.println("Total income for the day:$" + totalIncome);
	}

	private static double calculateRentalCharge(double hoursRented) {
		double ratePerHour = 30;
		double rentalCharge = hoursRented * ratePerHour;

		if (hoursRented > 5) {
			rentalCharge *= 0.9;
		}
		return rentalCharge;
	}

}
