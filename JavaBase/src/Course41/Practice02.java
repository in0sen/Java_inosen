package Course41;

public class Practice02 {

	public static void main(String[] args) {
		moji();

		calc(10, 11);

		String x = mojicon("今のところ全問正解でしょ？");

	}

	//⑪
	static void moji() {
		System.out.println("メソッド問題");
	}

	//⑫
	static void calc(int a, int b) {
		System.out.println(a + b);
	}

	//⑬
	static String mojicon(String moji) {
		String concated = moji + "を受け取りました";
		return concated;
	}

}
