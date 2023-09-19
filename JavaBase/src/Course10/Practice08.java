package Course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を三つ入力してね");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		if (a > b && a > c) {
			System.out.println("aが1番大きい数値です");
		} else {
			if (b > a && b > c) {
				System.out.println("bが1番大きい数値です");
			} else {
				if (c > a && c > b) {
					System.out.println("cが1番大きい数値です");
				}
			}
		}
		if (a > b && a > c) {
			System.out.println("aが2番目に大きい数値です");
		} else {
			if (b > a && b > c) {
				System.out.println("bが2番目に大きい数値です");
			} else {
				if (c > a && c > b) {
					System.out.println("cが2番目に大きい数値です");
				}
			}
		}
		if (a > b && a > c) {
			System.out.println("aが3番目に大きい数値です");
		} else {
			if (b > a && b > c) {
				System.out.println("bが3番目に大きい数値です");
			} else {
				if (c > a && c > b) {
					System.out.println("cが3番目に大きい数値です");
				}
			}
		}
		if (a == b && a == c && b == c) {
			System.out.println("すべて一緒だよ");
		} else {
			if (a == b) {
				System.out.println("aとbは一緒だよ");
			}
			if (a == c) {
				System.out.println("aとcは一緒だよ");
			}
			if (b == c) {
				System.out.println("bとcは一緒だよ");
			}
		}

	}

}
