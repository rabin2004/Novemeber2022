package javaBasics;

public class DataOperationConcept {
	
	// Data operation:
		// 1. Mathematical/Arithmetic operation: -> +,-,*,/
		// 2. Comparative Operation: -> outcome is boolean | numerical dataTypes/primitive dataType
				// equals to -> "=="
				// not equal to -> "!="
				// more than -> ">"
				// less than -> "<"
				// more than or equal to -> ">="
				// less than or equal to -> "<="

	public static void main(String[] args) {
		// creating variable
		int a,b; // created 2 variable with same data type without value assigned
		a = 10; // assigned value
		b = 20; // assigned value
		System.out.println(a+b); // + -> add operator
//		System.out.println("Addition: "+a+b); // + -> place operator
		System.out.println("Addition: "+(a+b));
		
		int c = a+b;
		System.out.println("Addition: "+c);
		c = a-b;
		System.out.println("Substraction: "+c);
		c = a*b;
		System.out.println("Multiply: "+c);
		c = b/a;
		System.out.println("Division: "+c);
		
		// Area of a rectangle
		int length,breath;
		length = 500;
		breath = 350;
		int areaOfRectangle = 2*(length+breath);
		System.out.println("Area of rectangle: "+areaOfRectangle);
		
		// comparative operation
		length = 25;
		breath = 5;
		System.out.println("Is this a square? "+(length==breath));
		System.out.println("Is this a rectangle? "+(length!=breath));
		System.out.println("Is length is greater than breath? "+(length>breath));
		System.out.println("Is length is less than breath? "+(length<breath));
		System.out.println("Is length is greater or equal to breath? "+(length>=breath));
		System.out.println("Is length is less or equal to breath? "+(length<=breath));
		
		int x,y,z;
		x = 10;
		y = 2;
		z = 55;
		System.out.println("X is more than Y: "+ (x>y));
		System.out.println("Y is more than Z: "+ (y>z));
		System.out.println("X is equal to Y: "+ (x==y));
		System.out.println("Y is equal to Z: "+ (y==z));
		System.out.println("Z is less than or equal to X: "+ (z<=x));
		System.out.println("Z is more than or equal to X: "+ (z>=x));
	
	}
	
	// Assignment: 1. Creating variable | 2. Duplicate/assigning/reassigning variable | 3. Mathematical operation: Temperature conversion/currency conversion | 4. Use print concept

}
