import java.util.Scanner;

public class Practice3_2 {

	public static void main(String[] args) {
		int r = (int) (Math.random() * 10);// Generate a random number
		Scanner sc = new Scanner(System.in);// User input
		System.out.println("Let's guess a number between 0~9 !");
		System.out.println("Please enter a number:");

		while (true) {
			int input = sc.nextInt();

			if (input != r) {
				System.out.println("Wrong number, try again!");
			} else {
				System.out.println("Correct answer!");
				break;
			}
		}

	}

}
