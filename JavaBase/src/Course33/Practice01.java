package Course33;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);

		for (int ruupu = 0; ruupu < 5; ruupu++) {
			System.out.println(ruupu + "回目のループです。");
		}

		int numArr[] = { 10, 20, 30, 40, 50 };
		for (int hyouji : numArr) {
			System.out.println(hyouji);
		}

		offOff();

		String moji = prapra("練習問題");
		System.out.println(moji);
		
		
		
	}

	static void offOff() {
		System.out.println("呼び出されました");
	}

	static String prapra(String a) {
		a = a + "を受け取りました";
		return a;
	}
}