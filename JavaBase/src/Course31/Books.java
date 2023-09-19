package Course31;

public class Books {
	String name;
	int page;
	String author;

	Books(String n, int p, String a) {
		name = n;
		page = p;
		author = a;
	}

	void display() {
		System.out.println(name);
		System.out.println(page);
		System.out.println(author);
	}
}