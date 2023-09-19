package Jitakuyou;

import java.util.Scanner;

public class sosuu {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("入力したい数値の数を入力してね");
		int suuti[] = new int[stdIn.nextInt()];
		System.out.println(suuti.length + "個数値を入力してね");
		int b = 0;
		while (b < suuti.length) {
			suuti[b] = stdIn.nextInt();
			while (suuti[b] <= 0) {
				System.out.println("0以下の数値を入力しないでください\nもう一度入力してください");
				suuti[b] = stdIn.nextInt();
			}
			b++;
		}
		for (int c : suuti) {
			System.out.println(c + "は");
			int sosuu = 0;
			for (int waru = 1; waru <= c; waru++) {
				if (c % waru == 0 && waru != c) {
					System.out.print(waru + "・");
					sosuu++;
				} else {
					if (c % waru == 0) {
						System.out.println(waru + "で割れます");
					}
				}
			}
			if (sosuu > 1 || c == 1) {
				System.out.println(c + "は素数ではありません");
			} else {
				System.out.println(c + "は素数です");
			}
		}
	}
}