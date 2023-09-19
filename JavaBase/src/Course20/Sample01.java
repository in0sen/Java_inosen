package Course20;

public class Sample01 {

	public static void main(String[] args) {

		String[] moji = new String[5];
		moji[0] = "て";
		moji[1] = "す";
		moji[2] = "と";
		moji[3] = "だ";
		moji[4] = "よ";
		//lengthは箱の数だけループする
		//配列の長さを取得する
		int x =moji.length;
		System.out.println(x);
		for(int i = 0; i<moji.length; i++) {
			System.out.println(i+"番目の要素は"+moji[i]+"です");
		}
	}
}
