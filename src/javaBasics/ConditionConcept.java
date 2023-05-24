package javaBasics;

import java.util.Scanner;

public class ConditionConcept {
	// Condition: -> boolean output
		// input/action_1 -> if input/action_1 -> action_2 | else -> action_3
	
	// if-else condition:
		// if(condition_1){action-1}
		// else if(condition_2){action-2} -> multiple else if block can be created
		// else{default action-3}
	
	// switch concept: depends on input that came in -> switch | case | break | default

	public static void main(String[] args) {
//		String cusName = "johnny";
		
		// creating condition using if block
//		if(cusName.isBlank()) {
//			System.err.println("Customer name is blank. Enter again!");
//		}
		
		// creating condition using if-else block
//		if(cusName.isBlank()) {
//			System.err.println("Customer name is blank. Enter again!");
//		}else {
//			System.out.println("Welcome back "+cusName);
//		}
		
		// creating condition using if|else if|else block
//		if(cusName.isEmpty()) {
//			System.err.println("Customer name is empty. Enter again!");
//		}else if(cusName.isBlank()) {
//			System.err.println("Customer name is blank. Enter again!");
//		}else {
//			System.out.println("Welcome back "+cusName);
//		}
		
		// creating condition using if|else if block
//		if(cusName.isBlank()) {
//			System.err.println("Customer name is empty/blank. Enter again!");
//		}else if(!cusName.isBlank()) {
//			System.out.println("Welcome back "+cusName);
//		}
		
		// creating condition using multiple else if 
//		String cusDB = "Johnny";
//		if(cusName.isEmpty()) {
//			System.err.println("Customer name is empty. Enter again!");
//		}else if(cusName.isBlank()) {
//			System.err.println("Customer name is blank. Enter again!");
//		}else if(cusName.equalsIgnoreCase(cusDB)) {
//			System.out.println("Welcome back "+cusName.toUpperCase());
//		}else if(!cusName.equalsIgnoreCase(cusDB)) {
//			System.out.println(cusName+" please register first.");
//		}
		
		// multiple conditions in same block -> 1. And operator -> && | 2. Or operator -> ||
			// condition_1 && condition_2 -> both needs to fulfilled
			// condition_1 || condition_2 -> either one fulfillment is enough
		
		// login logic
//		String username, password, usernameDB, passwordDB;
//		usernameDB ="david12";
//		passwordDB = "d@123";
//		
//		username = "David12";
//		password = "d@123";
//		
//		if(username.isBlank() || password.isBlank()) {
//			System.err.println("Either username or password is invalid. Please try again!");
//		}else if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
//			System.out.println("Login is successful!");
//		}else {
//			System.err.println("Wrong username or password. Please try again!");
//		}
		
		
		// ATM logic - withdrawal|Deposit-cash/check|Transfer|Balance Inquiry
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to TD Bank");
		System.out.println("--------------------");
		System.out.println("Withdrawal"+"\nDeposit"+"\nTransfer"+"\nBalance Inquiry");
		
		System.out.println("Select one of the above feature: ");
		String cusSelection = scan.nextLine().toLowerCase();
		int currenBalanceDB = 15000;
		
		switch (cusSelection) {
		case "withdrawal":
			System.out.print("Enter the desired amount: ");
			int amount = scan.nextInt();
			System.out.println("Please collect: $"+amount);
			System.out.println("Current balance: "+(currenBalanceDB-amount));
			break;
		case "deposit":
			System.out.println("Select: \nCash \nCheck");
			String cusDepositSelection = scan.next();
			if(cusDepositSelection.equalsIgnoreCase("cash")) {
				System.out.print("Enter the desired amount: ");
				int amountDep = scan.nextInt();
				System.out.println("Cash Deposited: $"+amountDep);
				System.out.println("Current balance: "+(currenBalanceDB+amountDep));
			}else if(cusDepositSelection.equalsIgnoreCase("check")) {
				System.out.println("Insert check...");
				System.out.println("Check deposit complete.");
			}
			break;
		case "transfer":
			System.out.print("Enter the desired amount: ");
			int amountTransfer = scan.nextInt();
			scan.close();
			System.out.println("Transfer successful: $"+amountTransfer);
			System.out.println("Current balance: "+(currenBalanceDB-amountTransfer));
			break;
		case "balance inquiry":
			System.out.println("Current balance: "+currenBalanceDB);
			break;
		default:
			System.err.println("Invalid selection. Try again.");
		}
		
		// if-else 
//		if (cusSelection.equalsIgnoreCase("withdrawal")) {
//			System.out.print("Enter the desired amount: ");
//			int amount = scan.nextInt();
//			System.out.println("Please collect: $"+amount);
//			System.out.println("Current balance: "+(currenBalanceDB-amount));
//		}else if(cusSelection.equalsIgnoreCase("deposit")) {
//			System.out.println("Select: \nCash \nCheck");
//			String cusDepositSelection = scan.next();
//			if(cusDepositSelection.equalsIgnoreCase("cash")) {
//				System.out.print("Enter the desired amount: ");
//				int amountDep = scan.nextInt();
//				System.out.println("Cash Deposited: $"+amountDep);
//				System.out.println("Current balance: "+(currenBalanceDB+amountDep));
//			}else if(cusDepositSelection.equalsIgnoreCase("check")) {
//				System.out.println("Insert check...");
//				System.out.println("Check deposit complete.");
//			}
//		}else if(cusSelection.equalsIgnoreCase("transfer")) {
//			System.out.print("Enter the desired amount: ");
//			int amountTransfer = scan.nextInt();
//			scan.close();
//			System.out.println("Transfer successful: $"+amountTransfer);
//			System.out.println("Current balance: "+(currenBalanceDB-amountTransfer));
//		}else if(cusSelection.equalsIgnoreCase("balance inquiry")) {
//			System.out.println("Current balance: "+currenBalanceDB);
//		}else {
//			System.err.println("Invalid selection. Try again.");
//		}
		
		
		
	}
	
	// Assignment: 
		//	Library app -> Customer have options to select -> Return book | Search book | Order book
					// 	-> if return book -> accept the book and show confirmation message
					//	-> Searching book -> if-else condition for book search - show book details
					//	-> Order book 	-> login logic -> if successful -> select book to order -> show confirmation message for successful order

	
	
	
	
	
}
