package javaAdvance;

public class MethodTypes {
	// Object - something that has properties (state and behavior) -> OBJECT OF A CLASS
		// Method - behavior
		// Variable - state
	
	// Method: 
		// Basic requirement to create method: -> 
					// 1. return type (void if returning nothing)
					// 2. method signature -> methodName()
					// 3. method body/block -> {code}
	
	void test() { // Method without parameter
		// code
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
//	void test() { // duplicate method
//		
//	}
	
	// method overloading -> same method name with different type/number of parameter
	void test(int a) {
		System.out.println(a);
	}
	
	void test(int a, int b) {
		System.out.println(a+b);
	}
	
	void test(int c, int d, String op) {
		if(op.equals("add")) {
			System.out.println(c+d);
		}else {
			System.out.println(c-d);
		}
	}
	
	// Parameter -> variable kind inside the method signature, will not be assigned
	
	void test1(int a) { // Method with single parameter
		System.out.println("Value given: "+a);
	}
	
	void test2(int a, int b) {
		System.out.println("Addition: "+(a+b));
		System.out.println("Substraction: "+(a-b));
	}
	
	// Method Types:
		// 1. Method without parameter
		// 2. Method with single parameter
		// 3. Method with multiple parameter

	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
//		mt.test();
		mt.test1(100);
		mt.test2(1500, 1000);
		mt.test(100, 150, "divide");
	}
}
