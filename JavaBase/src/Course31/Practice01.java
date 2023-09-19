package Course31;

public class Practice01 {
	public static void main(String[] args) {

		Books books = new Books("初期ネーム", 100, "初期太朗");

		books.name = "ITワールド";
		books.page = 500000;
		books.author = "サーティファイ";
		books.display();
	}
}