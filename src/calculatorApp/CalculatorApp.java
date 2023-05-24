package calculatorApp;

import java.util.*;

public class CalculatorApp {
	static Scanner scan = new Scanner(System.in);
	static AdditionOp ao = new AdditionOp();
	static SubstrationOp so = new SubstrationOp();
	static DivideOp dO = new DivideOp();
	
	int a,b;
	
	CalculatorApp(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
		static void calOp() {
		System.out.println("Enter first value:");
		int a = scan.nextInt();
		System.out.println("Enter second value:");
		int b = scan.nextInt();
		scan.close();
		CalculatorApp ca = new CalculatorApp(a,b);
		ao.a = a;
		ao.b = b;
//		ao.add();
//		ao.add(100);
		so.a = a;
		so.b = b;
//		so.substract();
//		dO.divide(a, b);
		
		ca.printingOp();
	}
	
		void printingOp() {
		System.out.println("Addition: "+ao.add());
		System.out.println("Substraction: "+so.substract());
		System.out.println("Divide: "+dO.divide(a, b));
	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first value:");
//		int a = scan.nextInt();
//		System.out.println("Enter second value:");
//		int b = scan.nextInt();
//		scan.close();
//		
//		AdditionOp ao = new AdditionOp(); // creating object
//		ao.a = a;
//		ao.b = b;
//		ao.add();
//		
//		SubstrationOp so = new SubstrationOp();
//		so.a = a;
//		so.b = b;
//		so.substract();
		
		calOp();

	}

}
