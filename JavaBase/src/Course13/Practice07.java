package Course13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int kaisuu = stdIn.nextInt();
		if (kaisuu > 100) {
			System.out.println("どれだけ回すの？");
		} else {
			for (int i = 0; i < kaisuu; i++) {
				if (i == 0) {
					System.out.println("現在のカウントは０だよ");
				} else {
					if (i % 2 == 1 && i != 0) {
						System.out.println("現在のカウントは奇数だよ");
					} else {
						System.out.println("現在のカウントは偶数だよ");
					}
				}
			}
		}
	}
}
