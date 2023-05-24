package javaBasics;

import java.util.Scanner;

public class ScannerConcept {
	// Scanner Concept - be able accept data input
		// Scanner class -> create instance/object 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// nextLine() -> accept String data input, continue accepting input until Enter key is press
		// next() -> accept String data input, continue accepting input until Enter key is pressed as well as space-bar key
		
//		System.out.println("Enter your name: ");
//		String cusName = scan.nextLine();
//		String cusName = scan.next();
		
//		int age = scan.nextInt();
//		
//		scan.close();
//		
//		System.out.println("Welcome "+cusName.toUpperCase());
//		System.out.println("Age: "+age+"yrs old");
		
		// thermostat logic
//		int desiredTemp, currentRoomTemp;
//
//		System.out.print("Enter desired room temparature to set: ");
//		desiredTemp = scan.nextInt();
//		System.out.print("Current room temperature thermostat sensed: ");
//		currentRoomTemp = scan.nextInt();
//		scan.close();
//		
//		if(desiredTemp==currentRoomTemp) {
//			System.out.println("Do nothing. Maintain temperature.");
//		}else if(desiredTemp>currentRoomTemp) {
//			System.out.println("Turn on Heater.");
//		}else if(desiredTemp<currentRoomTemp) {
//			System.out.println("Turn on AC.");
//		}else {
//			System.err.println("Invalid input. Try again!");
//		}
		
		// login logic
		String username, password, usernameDB, passwordDB;
		usernameDB = "david12";
		passwordDB = "d@123";

		System.out.println("Provide following login credentials:");
		System.out.print("Username: ");
		username = scan.nextLine();
		System.out.print("Password: ");
		password = scan.nextLine();
		scan.close();

		if (username.isBlank() || password.isBlank()) {
			System.err.println("Either username or password is invalid. Please try again!");
		} else if (username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
			System.out.println("Login is successful!");
		} else {
			System.err.println("Wrong username or password. Please try again!");
		}

	}

}
