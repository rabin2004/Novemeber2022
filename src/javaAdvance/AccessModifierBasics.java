package javaAdvance;

import javaBasics.DifferentPkgClass;

public class AccessModifierBasics {
	
	// Access modifier: creating restriction around class access & properties of class
	
	// Types of access modifier: for class properties (variables/method)
		// 1. Public: available through out -> within the class|between classes of same package & also different package
		// 2. Private: only be available within the class
		// 3. Default: if no access modifier keyword -> within the class | from same package | not from different package even class is inherited/subclass
		// 4. Protected: within the class | from same package | not from different package until inheritance comes into play
	
	// default VS protected -> ??? -> Inheritance: super/sub class
	
	// Types of access modifier: for class
		// 1. public: calling class/creating instance or object of class -> from same package/different package
		// 2. final: -> from same package | can't access final class from different package
		// 3. abstract: -> OOPS concept: Abstraction - ?????
		// 4. default: -> from same package | can't access final class from different package
	
	// final Vs default class -> ????

	// final: for variables
		// -> can't be uninitialized/blank
		// -> can't be reassigned
	
	public String msg;
	
	final String finalMsg = "Final final variable";
	
	public String returnMsgFromSameClass() {
		return msg;
	}
	
	private String returnMsgFromSameClassPrivate() {
		return msg;
	}
	
	String returnMsgFromSameClassDefault() {
		return msg;
	}
	
	protected String returnMsgFromSameClassProtected() {
		return msg;
	}
	
	public static void main(String[] args) {
		AccessModifierBasics am = new AccessModifierBasics();
		SamePkgClass spc = new SamePkgClass();
		DifferentPkgClass dpc = new DifferentPkgClass(); // import class - as class belongs to different pkg
		String msg = "Access modifier concept";
		
		// Reassigning final variable
//		am.finalMsg = msg; // cannot be assigned
		
		System.out.println(am.finalMsg);
		
		// public
			// same class
		am.msg = msg;
		System.out.println(am.returnMsgFromSameClass());
			// same pkg
		spc.msg = msg;
		System.out.println(spc.returnMsgFromSamePkg());
			// different pkg
		dpc.msg = msg;
		System.out.println(dpc.returnMsgFromDifferentPkg());
		
		// private
			// same class
		System.out.println(am.returnMsgFromSameClassPrivate());
			// same pkg
//		System.out.println(spc.returnMsgFromSamePkgPrivate()); // is not visible
			// different pkg
//		System.out.println(dpc.returnMsgFromDifferentPkgPrivate());
		
		// default
			// same class
		System.out.println(am.returnMsgFromSameClassDefault());
			// same pkg
		System.out.println(spc.returnMsgFromSamePkgDefault());
		// different pkg
//		System.out.println(dpc.returnMsgFromDifferentPkgDefault()); // is not visible

		// protected
			// same class
		System.out.println(am.returnMsgFromSameClassProtected());
			// same pkg
		System.out.println(spc.returnMsgFromSamePkgProtected());
			// different pkg
//		System.out.println(dpc.returnMsgFromDifferentPkgProtected()); // is not visible
	}
	
	// Assignment: 	Library app - using object/method/variable concept
				// 1. Login logic feature
				// 2. Search/Order/Return book feature
				// 3. Registration feature
	
}
