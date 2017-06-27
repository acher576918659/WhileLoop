package tw.aaa.myproject.loop;

public class WhileLoop9x9_2 {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1, c = 0;
			while (b <= 9) {
				c = a * b;
				System.out.printf("%dx%d=%2d\t", a, b, c);
				b++;
			}
			System.out.println();
			a++;
		}
	}

}
