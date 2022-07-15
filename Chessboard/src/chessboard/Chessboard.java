package chessboard;

//task - create chessboard from 1s and 0s
public class Chessboard {
	public static void main(String args[]) {
		int pomocna = 0;
		System.out.print("CHESSBOARD");
		
		// loop for 8 rows
		for (int i = 0; i <= 7; i++) {
			// new line after each row
			System.out.println();
			// add 1 so next line starts with other value
			pomocna++;

			// loop for 8 collums
			for (int j = 0; j <= 7; j++) {
				// print %2 of pomocna and space
				System.out.print(pomocna % 2 + " ");
				// add 1 so value is switched
				pomocna++;
			}
		}
	}
}