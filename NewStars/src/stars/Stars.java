package stars;

//task - create 3 pictures with stars
public class Stars {
	public static void main(String[] args) {
		// 1st picture - descending stairs
		// maximum number of stars for this picture
		int rows1 = 9;

		// prints stars descending from 9 to 1
		for (int i = rows1; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		// gap between pictures
		System.out.println();

		// 2nd picture - pyramid/christmas tree
		// height and starting number of stars (-1)
		int rows2 = 4, k = 0;

		// prints spaces in acsending order by 1
		for (int i = 1; i <= rows2; ++i, k = 0) {
			for (int j = 1; j <= rows2 - i; ++j) {
				System.out.print(" ");
			}

			// prints stars in ascending order by 2
			while (k != 2 * i - 1) {
				System.out.print("*");
				++k;
			}
			// prints new line
			System.out.println();
		}
		// gap between pictures
		System.out.println();

		// 3rd picture - pyramid 90° clockwise
		// maximum number of stars for this picture
		int rows3 = 4;

		{
			// prints stars in ascending order
			for (int i = 1; i <= rows3; ++i) {
				for (int j = 1; j <= i; ++j) {
					System.out.print("*");
				}
				// prints new line
				System.out.println();
			}

			// maximum number of stars for rows3-1 for descending part
			int rows4 = 3;

			for (int i = rows4; i >= 1; --i) {
				for (int j = 1; j <= i; ++j) {
					System.out.print("*");
				}
				// prints new line
				System.out.println();
			}
		}
	}
}