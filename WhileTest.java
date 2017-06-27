package tw.aaa.myproject.loop;

public class WhileTest {

	public static void main(String[] args) {
		int i = 1, j = 0;
		while (i <= 10) {
			j += i;
		System.out.println("i=" + i + " sum=" + j);
			i++;
		}
		System.out.println(j);
	}

}
