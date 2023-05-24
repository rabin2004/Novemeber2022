package practice;

import java.util.*;

public class Assignment_3_prac {

	public static void main(String[] args) {
		// login logic
		String[][] loginCredentials = {	{"test12", "test@123"},
										{"test45", "test@456"}};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Credentials:");
		System.out.print("Username: ");
		String username = scan.nextLine();
		System.out.print("Password: ");
		String password = scan.nextLine();
		scan.close();
		
		for(int i=0; i<loginCredentials.length; i++) {
			if(username.isBlank() || password.isBlank()) {
				System.err.println("Either username or password is invalid. Please try again!");
				break;
			}else if(username.equalsIgnoreCase(loginCredentials[i][0]) && 
					password.equals(loginCredentials[i][1])) {
				System.out.println("Login is successful!");
				break;
			}else {
				System.err.println("Wrong username or password. Please try again!");
			}
		}
	}

}
