//package xxx;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
		System.out.println("Please enter three intergers respectively to test if it is a triangle");
		int x[] = new int [3];
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first one");
		int side1 = input.nextInt();
		
		System.out.println("Input the second one");
		int side2 = input.nextInt();
		
		System.out.println("Input the third one");
		int side3 = input.nextInt();
		
		if(side1 == 0 || side2 == 0 || side3 == 0) { 
			System.out.println("It is not a triangle.");
		}
		else if(side1*side1 + side2*side2 == side3*side3) {
			System.out.println("It is a right triangle.");  
		}
		else if(side1 == side2 && side2 == side3) {   
			System.out.println("It is a regular triangle.");        
		}
		else if(side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2 ) {
			System.out.println("This is not a triangle.");
		}
		else if(side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("It is a isosceles triangle.");
		}
		else {
			System.out.println("It is a normal triangle");
		}
	}
}

