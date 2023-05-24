package javaBasics;

public class LoopConcept {
	
	// Loop -> any action/code that needs to be repeated multiple times
	
	// Requirement for loop: 
		// 1. counter variable - where to start
		// 2. condition - how many time to repeat the action/when to stop
		// 3. increment/decrement - pattern of execution
	
	// for loop:
		// for(1;2;3){action/code}
	
	// while loop:
		// 1; while(2){action/code 3;}

	public static void main(String[] args) {
		
		// print 1-100
//		int a = 1;
//		int b = 2; // .....
//		System.out.println(a);
//		System.out.println(b); // ....
		
		for(int i=1; i<=100; i=i+1) { // i=i+1 -> i++
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int i = 1;
		while(i<=100) {
			System.out.print(i+" ");
			i=i+1;
		}
		
		System.out.println();
		
		// 100-1
		for(int j=100; j>=1; j=j-1) { // j=j-1 -> j--
			System.out.print(j+" ");
		}
		
		System.out.println();
		
		int j = 100;
		while(j>=1) {
			System.out.print(j+" ");
			j=j-1;
		}
		
		System.out.println();
		
		// reversing String
		String errorMsg = "Something went wrong. Please try again later.";
		int indexOfLastCharacter = errorMsg.length()-1;
		for(int a=indexOfLastCharacter; a>=0; a--) {
			System.out.print(errorMsg.charAt(a));
		}
		
		System.out.println();
		while(indexOfLastCharacter>=0) {
			System.out.print(errorMsg.charAt(indexOfLastCharacter));
			indexOfLastCharacter--;
		}
		
	}
	
	// Assignment: 	1. Print all odd numbers between 1-100 - using both for & while loop
				//	2. Print all even numbers between 1-100 - using both for & while loop
				//	3. Reversing String

}
