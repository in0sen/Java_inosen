package Course03;

public class sample01 {

	public static void main(String[] args) {

		//変数に文字列や数値を格納する。
		String hensu = "Java";
		int hensu1 = 100 + 100;
		String hensu2 = "100+100";

		//変数を上書きする。
		int hensu3 = 3000;
		hensu3 = 1000;

		//変数同士を計算する（数値）
		int hensu4 = 1500;
		int hensu5 = 3000;
		int hensu6 = hensu4 + hensu5;

		//変数同士を計算する（文字列）
		String hensu7 = "国際";
		String hensu8 = "理工";
		String hensu9 = hensu7 + hensu8;

		//変数の中身を表示する。
		System.out.println(hensu);
		System.out.println(hensu1);
		System.out.println(hensu2);
		System.out.println(hensu3);
		System.out.println(hensu6);
		System.out.println(hensu9);

		//変数も文法。
		//変数も「変数の方　変数名＝値」と書く。
		//例えば「int abc＝100」のように書く。
		//intは変数の方、abc＝変数名、100は値。

	}

}
