package javaAdvance;

public class ConstructorAndReturnType {
	
	// Constructor: 
				// 1. special method carry name of the class
				// 2. constructor don't need to be called directly
				// 3. constructor will be called every time object/instance of the class is created
				// 4. constructor creation is not mandatory
				// 5. if constructor isn't created, a default constructor will be assigned whenever object/instance created
				// 6. Constructor can be overloaded as well
				// 7. assigning value instance variables/some code that needs to be executed first
				// 8. no return type
		
		// creating object/instance of a class:
					// className refName = new className(); // className() -> constructor of a class
		
		// Creating method: Basic requirements: 
				// 1. return type (at least void - if returning nothing)
				// 2. method signature -> methodName()
				// 3. method block/code block -> {code}
	
	String customerName; //instance
	String employeeName;
	
	ConstructorAndReturnType(){ // constructor without parameter
		System.out.println("I am in constructor");
	}
	
	ConstructorAndReturnType(String name){ // constructor overloading - parameterized constructor
		customerName = name;
	}
	
	void test() {
		System.out.println("Test method");
		System.out.println(customerName);
		System.out.println("Is employee a customer as well? " + test3());
	}
	
	void test1() {
		System.out.println(customerName.toUpperCase());
		System.out.println("Is employee a customer as well? " + test3());
	}
	
	void test2() {
		System.out.println(employeeName);
		System.out.println("Is employee a customer as well? " + test3());
	}
	
	boolean test3() { // method returning value
		boolean result = customerName.equals(employeeName);
		return result;
	}
	
	public static void main(String[] args) {
//		ConstructorAndReturnType ca = new ConstructorAndReturnType();
//		ca.test();
		
		ConstructorAndReturnType ca1 = new ConstructorAndReturnType("David");
		ca1.test();
		ca1.test1();
		ca1.employeeName = "Mary";
		ca1.test2();
	}

}
