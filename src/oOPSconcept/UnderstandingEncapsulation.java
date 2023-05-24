package oOPSconcept;

import java.util.*;

public class UnderstandingEncapsulation {
	
	void printDetails(String ssn, String dob) {
		System.out.println("Validate following details: ");
		System.out.println("Last Four SSN: ******"+ssn.substring(5));
		System.out.println("Birth Year: "+dob.substring(6));
	}

	public static void main(String[] args) {
		EncapsulationConcept ec = new EncapsulationConcept();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter following details: ");
		System.out.println("SSN (XXXXXXXXX): ");
		ec.setSSN(scan.nextLine());
		System.out.println("DOB (MM/DD/YYYY): ");
		ec.setDOB(scan.nextLine());
		scan.close();
		
		UnderstandingEncapsulation ue = new UnderstandingEncapsulation();
		ue.printDetails(ec.getSSN(), ec.getDOB());
		
	}

}
