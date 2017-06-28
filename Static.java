package tw.aaa.myproject.OOP;

class animal {
	static String food = "a";

	public static void eat() {
		System.out.println("animal eat");
	}
}

public class Static {

	public static void main(String[] args) {
		animal.eat();
		System.out.println(animal.food);

	}

}
