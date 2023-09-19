package Course53;

public class BookControll {
	public static void main(String[] args) {

		Book book1 = new Book();

		Book book2 = new Book("ITワールド");

		Book book3 = new Book("ITワールド", 25000);

		System.out.println(book3.getTitle() + "の値段は" + book3.getPrice() + "円");
	}
}