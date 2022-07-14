package calculator;

/*task - create input for choice of operation and 2 numbers to do
calculations with and return result*/
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int znak;
		double num1, num2;
		do {
			// for user input
			Scanner input = new Scanner(System.in);
			// print choices
			System.out.println("1 - Addition\n" + "2 - Subtraction\n" + "3 - Multiplication\n" + "4 - Division\n"
					+ "5 - Terminate program\n" + "Choose operation (1-5) and press Enter");
			// scan choice
			znak = input.next().charAt(0);
			// terminate if 5
			switch (znak) {
			case '5':
				System.out.println("Program terminated.");
				System.exit(0);
			}
			// scan 2 numbers
			System.out.println("Enter numbers one by one and press Enter");
			num1 = input.nextDouble();
			num2 = input.nextDouble();

			//perform mathematical operation, print line and break
			switch (znak) {
			case '1':
				System.out.printf("%.0f + %.0f = %.0f", num1, num2, (num1 + num2));
				System.out.println();
				break;

			case '2':
				System.out.printf("%.0f - %.0f = %.0f", num1, num2, (num1 - num2));
				System.out.println();
				break;

			case '3':
				System.out.printf("%.0f * %.0f = %.0f", num1, num2, (num1 * num2));
				System.out.println();
				break;

			case '4':
				System.out.printf("%.0f / %.0f = %.0f", num1, num2, (num1 / num2));
				System.out.println();
				break;

			default:
				System.out.printf("%c je neplatný znak", znak);
				System.out.println();
			}
			System.out.println();
		} while (znak != 5);
	}
}