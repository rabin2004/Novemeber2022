package oOPSconcept;

public abstract class AbstractionConcept {
	// Abstraction: -> hiding functionalities and only showing that can be accessed/used
	
	// abstract method: - different than regular method -> method without implementation/code/method block - need abstract keyword also class needs to be abtract
	
	// abstract class: - different than regular class -> which can have abstract method as well
	
	// Implementation of abstract method: 
				// 1. inherit abstract class to implement abstract methods
				// 2. Either implement all abstract method or turn the class into abstract
				// 3. For abstract class - instance/object is not allowed to be created
	
	void test() {
		System.out.println("Regular method");
	}
	
	abstract void test2();
	
	abstract void test3();
	
	abstract void test4();
	
}
