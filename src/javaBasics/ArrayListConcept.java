package javaBasics;

import java.util.*;

public class ArrayListConcept {
	// ArrayList -> is class, data table, 1 dimensional

	public static void main(String[] args) {
		// creating ArrayList
//		ArrayList array1 = new ArrayList(); // raw type/non-parameterized - not preferred way to create
		
		// inserting data
//		array1.add("Kate");
//		array1.add(true);
//		array1.add(300);
		
		ArrayList<String> customerNames = new ArrayList<String>(); // parameterized - preferred way to create
		customerNames.add("Kate");
		customerNames.add("Mike");
		customerNames.add("John");
		customerNames.add("Derick");
//		customerNames.add(1000); // not allowed
		
		// extract data
		System.out.println("Customer on 2nd row: "+customerNames.get(1));
		System.out.println(customerNames);
		
		// inserting data in specific row
		customerNames.add(1, "Jack");
		System.out.println("Customer on 2nd row: "+customerNames.get(1));
		System.out.println(customerNames);
		
		// delete value
		System.out.println(customerNames.remove(2));
		System.out.println(customerNames);
		System.out.println("Customer on 3rd row: "+customerNames.get(2));
		
		// count number rows
		System.out.println("Number of rows: "+customerNames.size());
		
		// to check if data present or not
		System.out.println("Is Mike a valid customer? "+customerNames.contains("Mike"));
		System.out.println("Is Jack a valid customer? "+customerNames.contains("Jack"));
		
//		System.out.println("Is arraylist empty? "+customerNames.isEmpty());
//		customerNames.clear();
//		System.out.println("Is arraylist empty? "+customerNames.isEmpty());
		
		Object cloneList = customerNames.clone();
		
		System.out.println("Clone or not? "+customerNames.equals(cloneList));
		System.out.println(cloneList);
		System.out.println(customerNames);
		
		customerNames.add("Lacy");
		System.out.println("Clone or not? "+customerNames.equals(cloneList));
		System.out.println(cloneList);
		System.out.println(customerNames);
		
		// index of a data 
		System.out.println("Index of row Mike is present at: "+customerNames.indexOf("Mike")); // -1 -> means not present
		System.out.println("Index of row Lacy is present at: "+customerNames.indexOf("Lacy"));

		
		// Traversing through ArrayList
		// 1. for
		for(int i=0; i<customerNames.size(); i++) {
			System.out.print(customerNames.get(i)+ " ");
		}
		
		System.out.println();
		
		// 2. while
		int i = customerNames.size()-1;
		while(i>=0) {
			System.out.print(customerNames.get(i)+ " ");
			i--;
		}
		
		System.out.println();
		
		// 3. for each loop
		for(String customer: customerNames) {
			System.out.print(customer+ " ");
		}
		
		System.out.println();
		
		// 4. Iterator concept
		Iterator<String> it = customerNames.iterator();
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("Customer in 1st row: " +it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("Customer in 2nd row: " +it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("Customer in 3rd row: " +it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("Customer in 4th row: " +it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("Customer in 5th row: " +it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("Customer in 6th row: " +it.next()); // NoSuchElementException
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}
	
	// Assignment: 	1. Login logic - 2D Array
				//	2. Library app - using ArrayList
				//	3. Registration feature - using ArrayList
	
}
