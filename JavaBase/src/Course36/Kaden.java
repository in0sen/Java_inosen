package Course36;

public class Kaden {

	private String name;
	static int price;

	void display() {
		System.out.println(name);
		System.out.println(price);
	}
	
	String getName() {
		return name;
	}
	void setName(String n) {
		name=n;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int p) {
		price=p;
	}
}