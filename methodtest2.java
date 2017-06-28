package tw.aaa.myproject.OOP;

class test1 {

	public boolean a(int cnt) {

		for (int b = 0; b <= cnt; b++) {
			System.out.println("hi");
		}
		return true;
	}
}

public class methodtest2 {
	public static void main(String[] args) {
		test1 c = new test1();
		boolean d = c.a(10);
		System.out.println("stars:" + d);
	}
}
