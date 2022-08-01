package words;

//task - generate 10 words 4 characters each from random letters
public class Words {
	public static void main(String[] args) {
		// loop for 10 repeat, n characters
		for (int i = 0; i < 10; i++) {
			String nahodneSlovo = tvorbaNahodnehoSlova(4);
			System.out.println(nahodneSlovo);
		}
	}

	public static String tvorbaNahodnehoSlova(int n) {
		String name = "";
		// for each word generate n random numbers
		for (int i = 0; i < n; i++) {
			int v = (int) (Math.random() * 26);
			char c = (char) (v + 'a');
			name += c;
		}
		return name;
	}
}