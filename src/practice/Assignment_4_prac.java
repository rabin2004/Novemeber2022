package practice;

import java.util.*;

public class Assignment_4_prac {

	public static void main(String[] args) {
		// Booking appointment
		String name, reason, telephone, email;
		String[][] customerDetails = new String[2][4];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide following details:");
		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Reason: ");
		reason = scan.nextLine();
		System.out.print("Telephone: ");
		telephone = scan.nextLine();
		System.out.print("Email: ");
		email = scan.nextLine();
		scan.close();
		
		customerDetails[0][0] = name;
		customerDetails[0][1] = reason;
		customerDetails[0][2] = telephone;
		customerDetails[0][3] = email;
		
		System.out.println("Book confirmed. Email will be sent to - "+customerDetails[0][3]);
	}

}
