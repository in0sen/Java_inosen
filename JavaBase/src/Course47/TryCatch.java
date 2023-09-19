package Course47;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.println("数値を入力してね");
			int x = stdIn.nextInt();

			int[] numArr = new int[3];
			numArr[0] = 10;
			numArr[1] = 20;
			numArr[2] = 30;
			numArr[3] = 40;

		} catch (java.util.InputMismatchException e) {
			System.out.println("以下のエラーを検出しました！ggrks！！！");
			System.out.println(e);
			//エラーの理由とエラー排出場所が分かる
			//e.printStackTrace();
			System.out.println(1);
		}
	}
}