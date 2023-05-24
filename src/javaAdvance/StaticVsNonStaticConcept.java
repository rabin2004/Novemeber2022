package javaAdvance;

public class StaticVsNonStaticConcept {
	
	// Static & Non-static -> nature of properties
	
	// Static - close to class, with static keyword
		// Accessing of static property:
			// 1. Direct calling
			// 2. Class Name
			// 3. Instance/Object referenceName - not a preferred way
	
	// Non-static - close to instance of the class, with no static keyword
		// Accessing of non-static property:
			// 1. Instance/Object referenceName - only way to access
				//	-> but can be accessed directly in non-static method
	
	// Static Vs Non-Static mismatch
			// 1. Static properties can be accessed into non-static method following all 3 ways
			// 2. Non-static properties can be accessed into static method following only 1 way

}
