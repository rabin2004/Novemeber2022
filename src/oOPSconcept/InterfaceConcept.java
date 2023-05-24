package oOPSconcept;

public interface InterfaceConcept {
	
	// Interface: -> different java file other than class -> all methods defined will be default abstract
			// - can be used as defining high level
	
	// class Vs interface -> 
			// 1. instance/object of class can be created but not for interface
			// 2. in interface all methods are default abstract
			// 3. implementation of methods from interface is going to happen through class
			// 4. create relation of inheritance between interface & class -> "implements" keyword -> either implement all or become abstract class
			// 5. Multiple inheritance - between interface and class
			// 6. Inheritance between interface - extends keyword
		
	
	void debitCard();
	void creditCard();
	void onlineAccount();
	void onlineRegistration();
	abstract void loginFeature();

}
