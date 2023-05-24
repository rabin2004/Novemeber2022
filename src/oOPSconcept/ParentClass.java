package oOPSconcept;

public abstract class ParentClass extends GrandParentClass {
	
	public void parentMethod1() {
		System.out.println("Parent method");
	}
	
	public static void parentMethod2() {
		System.out.println("Parent method");
	}
	
	public void overriddenMethod() {
		super.overriddenMethod();
		System.out.println("Method overriding - Parent class");
	}
	
	void defualtMethod() {
		System.out.println("Default method");
	}
	
	protected void protectedMethod(){
		System.out.println("Protected method");
	}
	
//	public void signIn() {
//		// not implemented
//	}
	
	public static void main(String[] args) {
//		ParentClass pc = new ParentClass();
//		pc.parentMethod1();
//		parentMethod2();
//		
//		pc.grandParentMethod1();
//		grandParentMethod2();
//		
//		pc.overriddenMethod();
	}

}
