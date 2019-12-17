package xxx;

import java.util.Arrays;

public class Practice4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x [] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(x);
		int sum = 0;
		for (int i = 0; i<x.length; i++) {
			sum += x[i];
			
		}
		System.out.print("The average of this array is " + (sum/x.length)+ ".");
		System.out.println();
		System.out.print("Index greater than average: ");
		for (int i = 0; i<x.length; i++) {
			if (x[i]>(sum/x.length)) {
				System.out.print(x[i] + " ");
				continue;
			}
		}
	
	}

}
