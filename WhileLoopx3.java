package tw.aaa.myproject.loop;

public class WhileLoopx3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int k = 1; k <= 10 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();

		}
		for(int a=1;a<=10;a++)
		{System.out.print(" ");
			for(int b=1;b<=11-a;b++)
			{System.out.print(" ");}
			for(int c=1;c<=a;c++)
			{
				System.out.print("*");
			}
			
			for(int d=1;d<=a-1;d++)
			{System.out.print("*");}
			System.out.println();
		}
	}

}
