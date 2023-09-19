package Course57;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner stdIn = new Scanner(System.in);
		int ransu = ran.nextInt(100) + 1;
		int nyuuryoku = 0;
		int kaisuu = 1;
		do {
			if (nyuuryoku < 1 || nyuuryoku > 100) {
				System.out.println("数字は１～１００までです");
			} else if (nyuuryoku < ransu) {
				System.out.println("答えはもっと大きい数字です");
				kaisuu++;
			} else if (nyuuryoku > ransu) {
				System.out.println("答えはもっと小さい数字です");
				kaisuu++;
			}
			try {
				nyuuryoku = stdIn.nextInt();
			} catch (Exception e) {
				String gomibako = stdIn.next();
			}
		} while (ransu != nyuuryoku);
		System.out.println(kaisuu + "回でクリア\n答えは" + ransu + "でした");
	}
}