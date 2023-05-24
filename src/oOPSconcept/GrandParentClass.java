package oOPSconcept;

public abstract class GrandParentClass {
	
	public void grandParentMethod1() {
		System.out.println("Grand Parent method");
	}
	
	public static void grandParentMethod2() {
		System.out.println("Grand Parent method");
	}
	
	public void overriddenMethod() {
		System.out.println("Method overriding - Grand Parent class");
	}
	
//	public void signIn() { // -> create abstract method instead
//		// not implemented
//	}
	
	public abstract void signIn();

}
