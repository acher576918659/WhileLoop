package tw.aaa.myproject.loop;

public class diceWhileBreak {

	public static void main(String[] args) {
		int b = 5;
		while (true) {
			int a = (int) (Math.random() * 6) + 1;
			System.out.println(a);
			if (b == a) {
				System.out.println("win");
				break;
			} else {
				System.out.println("lose");
			}
		}
	}
}
