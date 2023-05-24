package javaBasics;

public class StringManipulation {

	public static void main(String[] args) {
		// Creating String variable:
		// #1 creating in variable format
		String customerName1 = "Mike";
//		String customerName2 = "Mike";
//		String customerName3 = "Mary";
//
//		System.out.println("Customer with same first name: "+(customerName1==customerName2));
//		System.out.println("Customer with different first name: "+(customerName1!=customerName3));
		
		// # 2 creating in String object/instance
		String customerName4 = new String("Mike");
//		System.out.println("Customer with same first name: "+(customerName1==customerName4)); // false
//		System.out.println("Customer with different first name: "+(customerName1!=customerName4)); // true
		
	// comparing 2 String value
		// equals() -> boolean | case sensitive
		// equalsIgnoreCase() -> boolean | case insensitive
		boolean result = customerName1.equals(customerName4);
		System.out.println("Are these customers with same first name? "+result);
		System.out.println("Are these customers with different first name? "+
							(!customerName1.equals(customerName4)));
		
		customerName4 = "mike";
		System.out.println("Case sensitive");
		System.out.println("Are these customers with same first name? "+customerName1.equals(customerName4));
		System.out.println("Are these customers with different first name? "+
							(!customerName1.equals(customerName4)));
		
		System.out.println("Case insensitive");
		System.out.println("Are these customers with same first name? "+
							customerName1.equalsIgnoreCase(customerName4));
		System.out.println("Are these customers with different first name? "+
							(!customerName1.equalsIgnoreCase(customerName4)));
		
		// compareTo() -> integer out - zero=same, non-zero=different | case sensitive
		// compareToIgnoreCase() -> integer out - zero=same, non-zero=different | case insensitive
		System.out.println("Case sensitive");
		System.out.println("Are these customers with same first name? "+customerName1.compareTo(customerName4));
		
		System.out.println("Case insensitive");
		System.out.println("Are these customers with same first name? "+
							customerName1.compareToIgnoreCase(customerName4));
		
		// length() -> number characters in the String | starting count as 1 from first character
		String errorMsg = "Something went wrong. Please try again later after 14:00 EST. "
				+ "Please check google for more information!";
		System.out.println("Number of character in this error message: "+errorMsg.length());
		System.out.println("Wrong error message length: "+(errorMsg.length()==60));
		
		// indexOf() -> position of a character/character sequence | index counting starts from 0
				// position = index+1 | index = position-1
		// first occurrence
		System.out.println("Index of letter g: "+errorMsg.indexOf('g'));
		System.out.println("Position of letter g: "+(errorMsg.indexOf('g')+1));
		System.out.println("Index of Please: "+errorMsg.indexOf("Please"));
		System.out.println("Position of Please: "+(errorMsg.indexOf("Please")+1));
		
		// lastIndexOf() -> last occurrence
		System.out.println("Index of letter g: "+errorMsg.lastIndexOf('g'));
		
		// multiple occurrence
		System.out.println("Second occurrence of letter g: "+errorMsg.indexOf('g', 9));
		System.out.println("Second occurrence of letter g: "+errorMsg.indexOf('g', errorMsg.indexOf('g')+1));
		
		System.out.println("Third occurrence of letter g: "+errorMsg.indexOf('g', 20));
		System.out.println("Third occurrence of letter g: "+errorMsg.indexOf('g',
				errorMsg.indexOf('g', errorMsg.indexOf('g')+1)+1));
		
		System.out.println("Fourth occurrence of letter g: "+errorMsg.indexOf('g', 35));
		System.out.println("Fourth occurrence of letter g: "+errorMsg.indexOf('g',
				errorMsg.indexOf('g',errorMsg.indexOf('g', errorMsg.indexOf('g')+1)+1)+1));
		
		// charAt() -> character at specific location
		System.out.println("Character present at index 15: "+errorMsg.charAt(15));
		
		// toUpperCase()
		String username = "Mk1234";
		String usernameDB = "mk1234";
		System.out.println(username.equals(usernameDB));
		username = username.toUpperCase();
		usernameDB = usernameDB.toUpperCase();
		System.out.println(username.equals(usernameDB));
		
		// toLowerCase()
		username = username.toLowerCase();
		usernameDB = usernameDB.toLowerCase();
		System.out.println("Username validated: "+username.equals(usernameDB));
		
	// validation/verification -> isEmpty() | isBlank() -> boolean
		String a, b, c;
		a = "";
		b = "    ";
		c = "Micheal";
		System.out.println("length of a: "+a.length()+"\nlength of b: "+b.length()+
				"\nlength of c: "+c.length());
		
		System.out.println("Is a blank? "+a.isBlank()); // no character -> true
		System.out.println("Is b blank? "+b.isBlank()); // only white spaces -> true
		System.out.println("Is c blank? "+c.isBlank()); // any character other than white spaces only -> false
		
		System.out.println("Is a empty? "+a.isEmpty()); // no character -> true
		System.out.println("Is b empty? "+b.isEmpty()); // even just white spaces -> false
		System.out.println("Is c empty? "+c.isEmpty()); // any character -> false
		
		// contains() -> boolean, check if something present or not, case sensitive
		errorMsg = "Something went wrong. Please try again later after 14:00 EST. "
				+ "Please check google for more information!";
		System.out.println("If Please is present or not: "+errorMsg.contains("Please"));
		System.out.println("If please is present or not: "+errorMsg.contains("please"));
		System.out.println("If please is present or not: "+errorMsg.contains("g"));
		System.out.println("If please is present or not: "+errorMsg.contains(" "));
		
		// substring() -> provides section of a string
//		System.out.println(errorMsg.indexOf("Please"));
//		System.out.println(errorMsg.indexOf("Please", errorMsg.indexOf("Please")+1));
		String sectionOfErrorMsg = errorMsg.substring(62);
		System.out.println(sectionOfErrorMsg);
		
		String middleSectionErrorMsg = errorMsg.substring(22, 61);
		System.out.println(middleSectionErrorMsg);
		
		String firstName = "david";
		String lastName = "jones";
		System.out.println("Your initial: "+firstName.substring(0, 1).toUpperCase()+
				lastName.substring(0, 1).toUpperCase());
		
		// concat() -> to join string
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.concat(" ".concat(lastName)));
		String cusName = firstName.concat(" ".concat(lastName)).toUpperCase();
		System.out.println("Welcome back "+cusName);
		
		errorMsg = "Something went wrong. Please try again later after 14:00 EST. "
				+ "Please check google for more information!";
		
		// replace() - replaces old by new char/char seq
		System.out.println(errorMsg.replace('a', 'A'));
		System.out.println(errorMsg.replace("Please", "Not please"));
		System.out.println(errorMsg.replace("Please check google for more information!", "")); // removing
		
		// trim() -> remove white spaces present before and after string
		firstName = "   David    ";
		lastName = "   jones   ";
		firstName = firstName.trim();
		lastName = lastName.trim();
		cusName = firstName.concat(" ".concat(lastName)).toUpperCase();
		System.out.println("Welcome back "+cusName);
		System.out.println("Your initial: "+firstName.substring(0, 1).toUpperCase()+
				lastName.substring(0, 1).toUpperCase());
		
		// split() --- ?? after discussion Array/Loop concept
			
	}
	
	// Assignment: 1. Practice Data operation & String manipulation | 2. Temperature conversion/currency conversion - comparison to compare with expected value | 3. Customer name/Customer username or password/Library book validation
}
