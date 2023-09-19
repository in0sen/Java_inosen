package Course53;

public class Book {
	private String title;
	private int price;

	public Book() {
		System.out.println("動いたよ。");
	}
	//↑デフォルトコンストラクタ
	//　引数のないコンストラクタ

	public Book(String userInputTitle) {
		this.title = userInputTitle;
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
	}

	//ここにタイトルと価格をセットするコンストラクタを書いてみよう////

	public Book(String userInputTitle, int userInputPrice) {
		this.title = userInputTitle;
		this.price = userInputPrice;
		System.out.println(userInputTitle + "の値段は" + userInputPrice + "円");
	}

	//////////////////////////////////////////////////////////////////

	////////////////以下getter及びsetter(今日は無視してOK）/////////////
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	////////////////以下getter及びsetter(今日は無視してOK）/////////////
}