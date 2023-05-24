package practice;

public class Assignment_1_prac {

	public static void main(String[] args) {
//		Mathematical operation: Temperature conversion/currency conversion
		
		// Temperature conversion -> C -> F | F -> C
		int tempC, tempF;
//		double tempC, tempF;
		tempF = 77;
		tempC = (tempF-32)*5/9;

		System.out.println(tempF+"F to Temperature in C: "+tempC);
		
		tempC = 45;
		tempF = (tempC*9/5)+32;
		
		System.out.println(tempC+"C to Temperature in F: "+tempF);
		
		// currency conversion
		double USD, Euro;
		USD = 150;
		Euro = USD*0.9;
		
		System.out.println(USD+"$ into Euro: "+Euro);
		
		Euro = 5999;
		USD = Euro/0.9;
		System.out.println(Euro+" Euro into USD: "+USD);
	}

}
