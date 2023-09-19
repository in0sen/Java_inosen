package Course13;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してね");
		int yy = stdIn.nextInt();
		
		for (int i = 1; i <= yy; i++) {
			System.out.println("現在" + i + "回目のループです。");
		}
	}
}
