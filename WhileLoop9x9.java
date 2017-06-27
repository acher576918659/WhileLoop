package tw.aaa.myproject.loop;

public class WhileLoop9x9 {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1, c = 0;
			while (b <= 9) {
				c = a * b;
				// System.out.print(a+"*"+b+"="+c+" ");
				if (c < 10) {
					System.out.print(a + "x" + b + "=" + " " + c + "	");
				} else {
					System.out.print(a + "x" + b + "=" + c + "	");
				}
				b++;
			}
			System.out.println();
			a++;
		}
	}

}
