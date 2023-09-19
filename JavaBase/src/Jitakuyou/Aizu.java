package Jitakuyou;

import java.util.Scanner;

public class Aizu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] A = new int[4][3][10];
		int n = sc.nextInt();
		while (n-- != 0) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();

			A[b - 1][f - 1][r - 1] += v;
		}
		for (int a = 0; a < 4 * 3 * 10; a++) {
			if (a % 30 == 0 && a != 0) {
				System.out.println();
				for (int b2 = 0; b2 < 20; b2++) {
					System.out.print("#");
				}
				System.out.println();
			} else if (a % 10 == 0 && a != 0 && a != 119) {
				System.out.println();
			} else {
			}
			System.out.print(" " + A[a / 30][a / 10 % 3][a % 10]);
		}
	}
}