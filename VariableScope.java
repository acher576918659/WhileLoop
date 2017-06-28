package tw.aaa.myproject.OOP;


public class VariableScope {
int a=1;
 static int b=2;
 public void n1(int c){
	 int d=4;
	 System.out.println("a="+a);
	 System.out.println("b="+b);
	 System.out.println("c="+c);
	 System.out.println("d="+d);
 }
 public static void n2(int e){//只有static看的到
	 System.out.println("b="+b);
	 System.out.println("e="+e);
 }
	public static void main(String[] args) {
		VariableScope e=new VariableScope();
		e.n1(3);
		e.n2(6);
		n2(7);
	}

}
