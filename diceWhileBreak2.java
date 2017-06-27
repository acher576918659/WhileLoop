package tw.aaa.myproject.loop;

public class diceWhileBreak2 {

	public static void main(String[] args) {
		int b = 5;
		int count=0;
		while (true) {
			
			int a = (int) (Math.random() * 6) + 1;
			System.out.println(a);
			if (b == a) {
				count++;
				if(count==2)
				{System.out.println("win");
					break;}
			} else {
				System.out.println("lose");
			}
		}
	}
}
