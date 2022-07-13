package stars;

public class Stars {
	public static void main(String[] args) {
		int rows1 = 9;

		for (int i = rows1; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		int rows2 = 4, k = 0;

		for (int i = 1; i <= rows2; ++i, k = 0) {
			for (int j = 1; j <= rows2 - i; ++j) {
				System.out.print(" ");
			}

			while (k != 2 * i - 1) {
				System.out.print("*");
				++k;
			}
			System.out.println();
		}
		System.out.println();

		int rows3 = 4;

		{

			for (int i = 1; i <= rows3; ++i) {
				for (int j = 1; j <= i; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}
			int rows4 = 3;

			for (int i = rows4; i >= 1; --i) {
				for (int j = 1; j <= i; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}