package tw.aaa.myproject.OOP;

public class overload {
	public void plus(int x1, int y1) {
		System.out.printf("%d+%d=%d \n", x1, y1, (x1 + y1));
	}

	public void plus(double x2, double y2) {
		System.out.println("x2+y2=" + (x2 + y2));
	}

	public static void main(String[] args) {
		overload a = new overload();
		a.plus(5, 6);
		a.plus(5.5, 6.2);
		a.plus('a', 8);
		a.plus('A', 5);
	}

}
