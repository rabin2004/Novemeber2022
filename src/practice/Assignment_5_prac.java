package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment_5_prac {

	public static void main(String[] args) {
		// Employee entering building - 1D Array
//		String[] employeeDB = { "david", "mike", "tina", "michele" };
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name to enter the building: ");
//		String employeeEntering = scan.nextLine();
//		scan.close();
//		for (int i = 0; i < employeeDB.length; i++) {
//			if (employeeEntering.equalsIgnoreCase(employeeDB[i])) {
//				System.out.println("Access Granted!");
//				break;
//			} else {
//				System.out.println("Access Denied!");
//			}
//		}
		
		
		// Employee entering building
		String[] employeeDB = { "david", "mike", "tina", "michele" };
		List<String> employeeList = Arrays.asList(employeeDB);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name to enter the building: ");
		String employeeEntering = scan.nextLine();
		scan.close();
		
//		for(String employee: employeeList) {
//			if (employeeEntering.equalsIgnoreCase(employee)) {
//				System.out.println("Access Granted!");
//				break;
//			} else {
//				System.out.println("Access Denied!");
//			}
//		}
		
		if (employeeList.contains(employeeEntering)) {
			System.out.println("Access Granted!");
		} else {
			System.out.println("Access Denied!");
		}

	}

}
