package tw.aaa.myproject.loop;

public class LableBreakContinue {

	public static void main(String[] args) {
		action:
			for(int i =1;i<=3;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(i==2&&j==3)
					{
						//break action;
				continue action; 
					}
					System.out.printf("i=%d j=%d\n", i,j);
					
				}
			}
	}

}
