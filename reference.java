package tw.aaa.myproject.OOP;
class shirt{
	int price=2000;
	char size='l';
}
public class reference {

	public static void main(String[] args) {
		shirt a=new shirt();
		a.price=3000;
		a.size='s';

		shirt b=new shirt();
		b.price=2500;
		b.size='m';
		System.out.println("a price:"+a.price);
		System.out.println("a size:"+a.size);
		System.out.println("b price:"+b.price);
		System.out.println("b size:"+b.size);
		System.out.println("a --->"+a);
		System.out.println("b --->"+b);
		a=b;
		b.price=6000;
		b.size='L';
		System.out.println("a_1 price:"+a.price);
		System.out.println("a_1 size:"+a.size);
		System.out.println("a-1 --->"+a);
		System.out.println("b-1 --->"+b);
		
	}

}
