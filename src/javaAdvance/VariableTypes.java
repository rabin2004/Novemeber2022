package javaAdvance;

public class VariableTypes {
	// Object - something that has properties (state and behavior) -> OBJECT OF A CLASS
		// Method - behavior
		// Variable - state
	
	// Types Variable - 
		// 1. Instance/Non-Static variable - defined inside the class but outside any method, non-static in nature (no static keyword)
		// 2. Class/Static variable - defined inside the class but outside any method, static in nature (static keyword)
		// 3. Local variable - defined inside a method
	
	// Parameter -> variable kind inside the method signature, will not be assigned
	
	int c,d; // Instance variable
	
	static int x,y; // Class variable
	
	void test() { // non-static method
//		int a = 10; // Local variable
//		int b = 20; // Local variable
//		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(x-y);
	}
	
	void test1() {
		// Accessing static properties
		System.out.println(x-y); // 1. Direct calling
		System.out.println(VariableTypes.x-VariableTypes.y); // 2. Class Name
		
//		VariableTypes vt = new VariableTypes();
//		System.out.println(vt.x-vt.y); // 3. Instance/Object referenceName -> should be accessed in a static way
	}

	public static void main(String[] args) {
//		System.out.println(a+b); // local variable from test() method is not accessible/visible
		
//		int a = 10; // Local variable
//		int b = 20; // Local variable
//		System.out.println(a+b);
		
		// Access non-static property:
		VariableTypes vt = new VariableTypes();
		vt.c = 10;
		vt.d = 20;
		vt.test();
	}

}
