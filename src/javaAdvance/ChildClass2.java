package javaAdvance;

import oOPSconcept.ParentClass;

public class ChildClass2 extends ParentClass {

	public static void main(String[] args) {
		ChildClass2 cc2 = new ChildClass2();
//		cc2.parentMethod1();
//		cc2.grandParentMethod1();
		
		// default vs protected
//		cc2.defaultMethod(); // not accessible
		cc2.protectedMethod();

	}
	
	public void signIn() {}

}
