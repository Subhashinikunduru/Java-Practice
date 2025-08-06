package com.javaintro;

import java.util.Scanner;

public class ServiceCentre {
	static Scanner sc = new Scanner(System.in);
	String result;

	void BatteryIssues() {
		System.out.println("your battery too charged");
		result = sc.next();

		if (result.equalsIgnoreCase("yes")) {
			System.out.println("buy a new mobile");
		} else {
			System.out.println("your battery over heated");
			result = sc.next();
			if (result.equalsIgnoreCase("yes")) {
				System.out.println("change the battery");

			}

		}
		System.out.println("Is your problem solved");
		result = sc.next();

		if (result.equalsIgnoreCase("yes")) {
			System.out.println("Thank u");
		} else {
			BatteryIssues();

		}

	}

	void NetworkIssues() {
		System.out.println("Are u facing network issues");
		result = sc.next();
		if (result.equalsIgnoreCase("Yes")) {
			System.out.println("on airoplane mode");
		} else {
			System.out.println("ur problem solved");
		}
	}

	void AppCrashes() {
		System.out.println("Is your mobile struck");
		result = sc.next();
		if (result.equalsIgnoreCase("yes")) {
			System.out.println("restart your mobile");
		}
	}

	void StorageIssues() {
		System.out.println("are u installed unknown apps or no of movies");
		result = sc.next();
		if (result.equalsIgnoreCase("Yes")) {
			System.out.println("delete unwanted photos and movies");
		}
	}

	public static void main(String[] args) {
		ServiceCentre s = new ServiceCentre();

		Boolean exit = false;
		System.out.println("Main menu");
		System.out.println("1.BatteryIssues");
		System.out.println("2.NetworkIssues");
		System.out.println("3.App Crashes");
		System.out.println("4.StorageIssues");

		System.out.println("Enter your choice:");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			s.BatteryIssues();
			break;
		case 2:
			s.NetworkIssues();
			break;
		case 3:
			s.AppCrashes();
			break;
		case 4:
			s.StorageIssues();
			break;

		default:
			System.out.println("invalid");

		}

	}

}
