import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice3_3 {

	public static void main(String[] args) {
		System.out.println("Hi, please enter a number you don't prefer.");

		Scanner sc = new Scanner(System.in);//User input hate number
		int hateN = sc.nextInt();
		int count = 0;
		ArrayList<Integer> candidate = new ArrayList<>();//initialize an array list which is extensible
		for (int number = 1; number <= 49; number++) { //exclude hate number
			if (number == hateN || number % 10 == hateN || number / 10 == hateN) {
				continue;
			}
			candidate.add(number); //add those possible numbers(candidate)into the array
			System.out.print(number + " ");
			count++;
			if (count % 6 == 0) {
				System.out.println();
			}
		}
		System.out.println(" Total " + count + " numbers to choose.");
		System.out.println("Random six numbers by java below:");
		
		Set<Integer> hash_set = new HashSet<>();// To generate 6 different numbers and not repeated
		
		while (hash_set.size() < 6) {
			hash_set.add((int) (Math.random() * candidate.size()));// generate index. e.g: index 32 is the 33rd number
		}
		//System.out.println("Index for random 6 numbers " + hash_set);
		for (Integer i : hash_set) {
			System.out.print(candidate.get(i) + " ");
		}
	}// main end.

}

//Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
//Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
//Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
