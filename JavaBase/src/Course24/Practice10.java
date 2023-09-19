package Course24;

import java.util.Scanner;

public class Practice10 {

	static double goukei = 0;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int aa=0;
do {
		System.out.println("１：加算　２：減算　３：乗算　４：除算");
		int handan = stdIn.nextInt();
		while (handan < 1 && handan > 4) {
			System.out.println("１～４を打ち込んでね");

		}
		int saidai[] = new int[100];
		for (int kaisuu = 0; kaisuu < saidai.length-1; kaisuu++) {
			saidai[kaisuu] = stdIn.nextInt();
			if (saidai[kaisuu] == 9999 ||saidai[kaisuu]==0) {
				break;
			}
		}
		int a = 0;
		while (saidai[a] != 0) {
			if (handan == 1) {
				tasu(saidai[a]);
				a++;
			} else {
				if (handan == 2) {
					hiku(saidai[a]);
					a++;
				} else {
					if (handan == 3) {
						kake(saidai[a]);
						a++;
					} else {
						waru(saidai[a]);
						a++;
					}
				}
			}
		}
		System.out.println(goukei);
}while(aa!=1);
	}

	static void tasu(int b) {

		goukei = goukei + b;
	}

	static void hiku(int c) {
		goukei = goukei - c;
	}

	static void kake(int d) {
		if (goukei == 0) {
			goukei++;
		}
		goukei = goukei * d;

	}

	static void waru(int e) {
		goukei = goukei / e;
	}
}