package javaBasics;

import java.util.Scanner;

public class ArrayConcept {
	
	// Array Concept - data table 
		// 1 Dimensional (1-D) Array -> 1 column + multiple rows
		// 2 Dimensional (2-D) Array -> multiple column + multiple rows
	
	// Creating Array: 1. Data type - along with [] | 2.reference name | 3.size of table (1D -> define rows | 2D -> define both rows & columns)

	public static void main(String[] args) {
		// #1 Create 1D Array
//		int[] table1 = new int[6];
		
		// inserting data
//		table1[0] = 10;
//		table1[1] = 11;
//		table1[2] = 12;
//		table1[3] = 13;
//		table1[4] = 15;
//		table1[5] = 16;
//		table1[6] = 17; // ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
		
		// #2 creating 1D Array
		int[] table1 = {10,11,12,13,14,15,16,17};
		
		// extracting data
//		System.out.println("Addition of Row 2 & Row 3 value: "+(table1[1]+table1[2]));
//		System.out.println("Value in 4th row: "+table1[3]);
		
		// traversing through 1D array
		for(int i=0; i<4; i++) {
			System.out.println(table1[i]);
		}
		
		int rowCount = table1.length;
		System.out.println("Number of rows: "+rowCount);
		
		for(int i=0; i<rowCount; i++) {
			System.out.print(table1[i]+ " ");
		}
		
		System.out.println();
		
		int j=0;
		while(j<rowCount) {
			System.out.print(table1[j]+" ");
			j++;
		}
		
		System.out.println();
		
		
		// Creating 2D Array:
//		int table2[][] = new int[3][4]; // int[3][4] -> 3 rows | 4 columns
		
		// inserting data
		// 1st row:
//		table2[0][0] = 1;
//		table2[0][1] = 2;
//		table2[0][2] = 3;
//		table2[0][3] = 4;
		// 2nd row:
//		table2[1][0] = 5;
//		table2[1][1] = 6;
//		table2[1][2] = 7;
//		table2[1][3] = 8;
		// 3rd row:
//		table2[2][0] = 9;
//		table2[2][1] = 10;
//		table2[2][2] = 11;
//		table2[2][3] = 12;
		
		// #2 creating 2D array
		int table2[][] = {	{1,2,3,4,1},
							{5,6,7,8,1},
							{9,10,11,12,1},
							{13,14,15,16,1}};
		
		// extracting data
		System.out.println("2nd row 2nd column: "+table2[1][1]);
		
		int rowCount2D = table2.length;
		System.out.println("Number of rows: "+rowCount2D);
		int columnCount2D = table2[1].length;
		System.out.println("Number of columns: "+columnCount2D);
		
		// Traversing through 2D array
		System.out.println("---------------------------");
		for(int a=0; a<rowCount2D; a++) { // traversing rows
			for(int b=0; b<columnCount2D; b++) { // traversing columns
				System.out.print(table2[a][b]+"\t");
			}
			System.out.println("");
			System.out.println("---------------------------");
		}
		
		
	
		// Employee entering building
		String[] employeeDB = {"david","mike","tina","michele"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name to enter the building: ");
		String employeeEntering = scan.nextLine();
		scan.close();
		for(int i=0; i<employeeDB.length; i++) {
			if(employeeEntering.equalsIgnoreCase(employeeDB[i])) {
				System.out.println("Access Granted!");
				break;
			}else {
				System.out.println("Access Denied!");
			}
		}
		
		// Assignment: 	1. Login logic - use 2D array
					//	2. Library app - use 1D or 2D array
					//	3. Registration feature - store data in 2D array
	}

}
