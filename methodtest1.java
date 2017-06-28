package tw.aaa.myproject.OOP;

public class methodtest1 {
	public int a() {
		int sum = 0;
		for (int b = 1; b <= 10; b++) {
			sum += b;
		}
		return sum;
	}

	public static void main(String[] args) {
		methodtest1 c = new methodtest1();
		int value = c.a();
		System.out.println("value:" + value);
	}
}
