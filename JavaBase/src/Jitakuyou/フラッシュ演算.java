package Jitakuyou;

import java.util.Random;
import java.util.Scanner;

public class フラッシュ演算 {
	static int sum;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ra = new Random();

		Thread countdownThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int c = 0; c < 100; c++) {
					System.out.println();
				}
				for (int i = 1; i <= 10; i++) {
					for (int b = 0; b < 10000; b++) {
						System.out.println();
					}
					int a = ra.nextInt(10) + 1;
					System.out.println(i + "個目");
					System.out.println(a);
					sum += a;
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
				for (int d = 0; d < 10000; d++) {
					System.out.println();
				}
				if (s.nextInt() == sum) {
					System.out.println("○");
				} else {
					System.out.println("×");
				}
				System.out.println(sum);
			}
		});
		countdownThread.start();
	}
}