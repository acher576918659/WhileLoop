package tw.aaa.myproject.OOP;

public class ThisTest {
int age=18;
int grade =80;
public void n1(int age,int grade)
{this.age=age;
this.grade=grade;	
}
public ThisTest(){
	System.out.println("first");
}
public ThisTest(int age){
	this();
	System.out.println("second");
}
	public static void main(String[] args) {
		ThisTest a=new ThisTest(12);
		a.n1(8,90);
		System.out.println("age="+a.age);
		System.out.println("grade="+a.grade);

	}
}
