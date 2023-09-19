package Course35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int x = std.nextInt();
		if (x >= 50) {
			int y = std.nextInt();
			calc(x, y);
		} else {
			calc(x);
		}

	}

	static void calc(int x, int y) {
		System.out.println(x + y);
	}

	static void calc(int x) {
		System.out.println(x * 10);

	}
}