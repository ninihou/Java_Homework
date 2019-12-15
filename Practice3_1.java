import java.util.Scanner;

public class Practice3_1 {

	public static void main(String[] args) {
		System.out.println("Start guessing a number between 1~100 !");
		int r = (int)(Math.random()*101);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int input = sc.nextInt();
			if(input<r) {
				System.out.println("Too small, please enter a larger one!");
			}
			else if (input>r) {
				System.out.println("Too large, please enter a smaller one!");
			}
			else {
		    System.out.println("Bingo!");
		    break;
			}
		}
	}

}
