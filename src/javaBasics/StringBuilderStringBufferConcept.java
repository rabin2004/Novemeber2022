package javaBasics;

public class StringBuilderStringBufferConcept {
	
	// String helper classes -> StringBuilder & StringBuffer class

	public static void main(String[] args) {
		String cusName = "Jonathan";
//		String reverseCusNam = "";
		
//		for(int i=cusName.length()-1; i>=0; i--) {
////			System.out.print(cusName.charAt(i));
//			reverseCusNam = reverseCusNam.concat(String.valueOf(cusName.charAt(i))); // converting char to String
//		}
//		System.out.println(reverseCusNam.toUpperCase());
		
//		StringBuilder sb = new StringBuilder(cusName);
//		reverseCusNam = sb.reverse().toString();
//		System.out.println(reverseCusNam);
		
//		System.out.println(sb.replace(2, 4, "NA"));
		
//		System.out.println(sb.insert(4, " "));
		
//		System.out.println(sb.delete(3, 7));
		
		
		
		StringBuffer sbu = new StringBuffer(cusName);
//		reverseCusNam = sbu.reverse().toString();
//		System.out.println(reverseCusNam);
		
//		System.out.println(sbu.replace(2, 4, "NA"));
		
//		System.out.println(sbu.insert(4, " "));
		
		System.out.println(sbu.delete(3, 7));
		
		
	}

}
