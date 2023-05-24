package javaBasics;

public class DataTypes {
	
	// Data Types:
			// 1. Primitive Data Type: pre-defined data type
					// Numerical Data Type
						// Whole Numbers:
							// byte: smallest, +/-
							// short: bigger than byte, +/-
							// int (integer): bigger than short, +/-
							// long: biggest, +/-, "l" or "L"
		
						// Decimals:
							// float: small, +/-, "f" or "F"
							// double: big, +/-, "d" or "D"
		
					// Non Numerical Data Type
						// boolean: true or false -> condition
						// char (character): single alphabetic or numerical character, will be place inside single quote
			
			// 2. Class/Object reference Data Type: not pre-defined data type, separate class it is referring
					// String: anything inside double quotation, can be alphabetic or numerical or special character or blank spaces or combination

	// Creating Variables: 
		// Requirement to create variables: 1. Data types	2. Reference Name	3. Data/Value assigned
	
	public static void main(String[] args) {
		byte byteData = 10;
		System.out.println(byteData);
		short shortData = 100; // if not used -> The value of the local variable shortData is not used
		System.out.println(shortData);
		int integerData = -1000;
		System.out.println(integerData);
		long longData = 10000L;
		System.out.println(longData);
		
		float floatData = 8.999f;
		System.out.println(floatData);
		double doubleData = 1.999999D;
		System.out.println(doubleData);
		
		boolean result1 = true;
		boolean result2 = false;
		System.out.println("Sun rises in East! "+result1);
		System.out.println("Sun rises in West! "+result2);
		
		char sex = 'M';
		System.out.println("David is "+sex);
		char position = '7';
		System.out.println("David is "+position+"th in class.");
		
		// #1 way creating String - creating variable creation way
		String customerName = "David K.";
		String age = "45 years";
		String email = "dk@gmail.com";
		System.out.println(customerName+" is "+age+" old. "+"Email: "+email);
		
//		String customerName = "Maria L."; // duplicate variable
		
		// #2 way creating String - Object creation way
		String employeeName = new String("Micheal T.");
		age = "30 years"; // reassigning value
		email = "mt@gmail.com"; // reassigning value
		System.out.println(employeeName+" is "+age+" old. "+"Email: "+email);	
	}
	
	// Assignment: Printing/Comment/DataTypes/Creating Variable/Calling reference name/Assigning & Re-assigning

}
