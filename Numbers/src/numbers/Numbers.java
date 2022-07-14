package numbers;

/*task- find all numbers divisible by 3 and 4 from number entered
by user*/
import java.util.Scanner;

public class Numbers {
	public static void main(String args[]) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		// scan number
		n = input.nextInt();

		System.out.println("\nNumbers divisible by 3 and 4: ");
		// print all number that are divisible by 3 and 4
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 && i % 4 == 0)
				System.out.print(i + ", ");
		}
	}
}