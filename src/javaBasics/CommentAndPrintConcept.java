package javaBasics; // package

public class CommentAndPrintConcept { //class | javaBasics.CommentAndPrintConcept -> pkgName.className
	
	// Error: 1. Syntax error | 2. Run time error

	public static void main(String[] args) { // main method -> required for java app execution
		  // Comment: note/make code dormant
			// 1. Line comment: -> // -> shorcut->ctrl+/
			// 2. Block comment: -> /* code */
		
//		System.out.println("Learning Automation - 1");
//		System.out.println("Learning Automation - 2");
//		System.out.println("Learning Automation - 3");
		/*System.out.println("Learning Automation - 4");
		System.out.println("Learning Automation - 5");
		System.out.println("Learning Automation - 6");*/
		
		// Print concept: println() & print()
			// println() -> print line -> cursor will be pushed to next line
			// print() -> print -> cursor will stay at the end after printing
		
		// System.out.println() -> shortcut->sysout+ctrl+spacebar
		
		System.out.println("Learning Automation - 1");
		System.out.println(); // println() -> can be empty
		System.out.println("Learning Java language");
		System.out.println(1248972314);
		
//		System.out.print(); // print() -> can't be left empty
		System.out.print("Learning printing concept");
		System.out.println("printing only");
		System.out.print("Learning something");
		
		// error printing
//		System.err.println("There is error somewhere. Try again!");
		
		System.out.println();
		System.out.println();
		
		// printing paragraph.
		System.out.println("Learning printing concept. Learning printing concept. Learning printing concept. "
				+ "Learning printing concept. Learning printing concept. Learning printing concept. "
				+ "Learning printing concept. Learning printing concept. Learning printing concept");

		System.out.println();
		
		// \n -> break print statement
		System.out.println("Learning printing concept. \nLearning printing concept. "
				+ "\nLearning printing concept. \nLearning printing concept. \nLearning printing concept. "
				+ "\nLearning printing concept. \nLearning printing concept. \nLearning printing concept. "
				+ "\nLearning printing concept");
		
		// \t -> tab space
		System.out.println("Name"+"Phone"+"Email"+"Address");
		System.out.println("Name"+"           "+"Phone"+"             "+"Email"+"              "+"Address");
		System.out.println("Derek"+"          "+"123456789"+"        "+"dr@gmail.com"+"            "+"NYC");
		System.out.println("Micheal"+"          "+"234567809"+"        "+"mh@gmail.com"+"            "+"LA");
		
		System.out.println("------------------------------------------");
		
		System.out.println("Name\t\tPhone\t\t\tEmail\t\t\t\tAddress");
		System.out.println("Derek\t\t123456789\t\tdr@gmail.com\t\t\tNYC");
		System.out.println("Micheal\t\t234567809\t\tmh@gmail.com\t\t\tLA");
		
		System.out.println("------------------------------------------");
		
		System.out.println("Name"+"\t\t"+"Phone"+"\t\t\t"+"Email"+"\t\t\t\t"+"Address");
		System.out.println("Derek"+"\t\t"+"123456789"+"\t\t"+"tdr@gmail.com"+"\t\t\t"+"NYC");
		System.out.println("Micheal"+"\t\t"+"234567809"+"\t\t"+"tmh@gmail.com"+"\t\t\t"+"LA");
	}

}
