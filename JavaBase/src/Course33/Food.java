package Course33;

public class Food {
	String name;
	int price;

	void display() {
		System.out.println(name);
		System.out.println(price);
	}

	Food() {
		name = "初期";
		price = 0;
	}
}
