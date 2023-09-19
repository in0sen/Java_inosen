package Course24;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("１：足し算　２：引き算");
		int a = stdin.nextInt();
		while (a > 2 || a < 1) {
			System.out.println("１か２を入力してね");
			a = stdin.nextInt();
		}
		System.out.println("数値を二つ入力");
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		if (a == 1) {
			plus(b, c);
		} else {
			minus(b, c);
		}
	}

	static void plus(int d, int e) {
		System.out.println(d + e);
	}

	static void minus(int f, int g) {
		System.out.println(f - g);
	}
}