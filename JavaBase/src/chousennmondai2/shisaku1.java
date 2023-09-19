package chousennmondai2;

import java.util.Random;
import java.util.Scanner;

public class shisaku1 {

	public static void main(String[] args) {

		Random RandObj = new Random();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("ガチャを回す回数を入力してください");
		int kaisuu = stdIn.nextInt();
		int mawasu = 1;

		if (kaisuu >= 301) {
			while (mawasu <= kaisuu) {
				int ran1 = RandObj.nextInt(100) + 1;
				int ran2 = RandObj.nextInt(10) + 1;
				String kekka = mawasu + "回目のガチャ：";

				if (mawasu % 300 == 0 && mawasu != 0) {
					if (ran2 <= 3) {
						System.out.println(kekka + "通常SSR");
					} else {
						System.out.println(kekka + "ピックアップSSR");
					}
				} else {
					if (ran1 <= 1) {
						if (ran2 <= 3) {
							System.out.println(kekka + "通常SSR");
						} else
							System.out.println(kekka + "ピックアップSSR");
					} else {
						if (ran1 <= 18) {
							System.out.println(kekka + "SR");
						} else {
							System.out.println(kekka + "R");
						}
					}
				}
				mawasu++;
			}
		} else {
			while (mawasu <= kaisuu) {
				int ran1 = RandObj.nextInt(100) + 1;
				int ran2 = RandObj.nextInt(10) + 1;
				String kekka = mawasu + "回目のガチャ：";

				if (mawasu % 10 == 0 && mawasu != 0) {
					if (mawasu % 300 == 0 && mawasu != 0) {
						if (ran2 <= 3) {
							System.out.println(kekka + "通常SSR");
						} else {
							System.out.println(kekka + "ピックアップSSR");
						}
					} else {
						if (ran1 <= 3) {
							if (ran2 <= 3) {
								System.out.println(kekka + "通常SSR");
							} else {
								System.out.println(kekka + "ピックアップSR");
							}
						} else {
							System.out.println(kekka + "SR");
						}
					}
				} else {
					if (ran1 <= 3) {
						if (ran2 <= 3) {
							System.out.println(kekka + "通常SSR");
						} else {
							System.out.println(kekka + "ピックアップSSR");
						}
					} else {
						if (ran1 <= 18) {
							System.out.println(kekka + "SR");
						} else {
							System.out.println(kekka + "R");
						}
					}
				}
				mawasu++;
			}
		}
	}
}
