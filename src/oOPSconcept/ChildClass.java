package oOPSconcept;

import java.util.Scanner;

public class ChildClass extends ParentClass {
	
	public void childMethod1() {
		System.out.println("Child method");
	}
	
	public static void childMethod2() {
		System.out.println("Child method");
	}
	
	// Method overriding
	public void overriddenMethod() {
		super.overriddenMethod();
		System.out.println("Method overriding - child class");
	}
	
	public void signIn() {
		// login logic
		String[][] loginCredentials = { { "test12", "test@123" }, { "test45", "test@456" } };

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Credentials:");
		System.out.print("Username: ");
		String username = scan.nextLine();
		System.out.print("Password: ");
		String password = scan.nextLine();
		scan.close();

		for (int i = 0; i < loginCredentials.length; i++) {
			if (username.isBlank() || password.isBlank()) {
				System.err.println("Either username or password is invalid. Please try again!");
				break;
			} else if (username.equalsIgnoreCase(loginCredentials[i][0]) && password.equals(loginCredentials[i][1])) {
				System.out.println("Login is successful!");
				break;
			} else {
				System.err.println("Wrong username or password. Please try again!");
			}
		}
	}

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.childMethod1();
		childMethod2();
		
		cc.parentMethod1();
		parentMethod2();
		
		cc.grandParentMethod1();
		grandParentMethod2();
		
		cc.overriddenMethod();
		
		// Polymorphism
		ParentClass pc = new ChildClass();
		pc.parentMethod1();
		pc.grandParentMethod1();
		pc.overriddenMethod();
		
		GrandParentClass gpc = new ChildClass();
		gpc.grandParentMethod1();
		gpc.overriddenMethod();
		
		// default Vs protected
		cc.defualtMethod();
		cc.protectedMethod();

	}

}
