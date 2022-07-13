package chessboard;

public class Chessboard {
	public static void main(String args[]) {
		int[][] pole = new int[7][7];
		int pomocna = 0;
		
		for (int i = 0; i <= 7; i++) {
			System.out.println();
			pomocna++;
			for (int j = 0; j <= 7; j++) {
				System.out.print(pomocna%2 + ", ");
				pomocna++;
			}
		}
	}
}