package Bakudankaihi;

import java.util.Random;
import java.util.Scanner;

public class bomb {
	static String[][] kaihi = new String[5][5];

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int kokuri = rand.nextInt(24) + 0;
		int bomb1 = rand.nextInt(24) + 0;
		while (bomb1 == kokuri) {
			bomb1 = rand.nextInt(24) + 0;
		}
		int bomb2 = rand.nextInt(24) + 0;
		while (bomb2 == kokuri || bomb2 == bomb1) {
			bomb2 = rand.nextInt(24) + 0;
		}
		kaihi[kokuri / 5][kokuri % 5] = "国";
		kaihi[bomb1 / 5][bomb1 % 5] = "☆";
		kaihi[bomb2 / 5][bomb2 % 5] = "☆";
		System.out.println("\n─十─十─十─十─十");
		for (int a = 0; a < 25; a++) {
			if (kaihi[a / 5][a % 5] == null || (kaihi[a / 5][a % 5].equals("☆"))) {
				System.out.print("　｜");
			} else {
				System.out.print(kaihi[a / 5][a % 5] + "｜");
			}
			if (a % 5 == 4 && a != 0) {
				System.out.println("\n─十─十─十─十─十");
			}
		}
		for (int idou = 1; idou <= 5; idou++) {
			int genzaiti = kokuri;
			String houkou;
			do {
				System.out.println("\n" + idou + "回目");
				System.out.println("移動方向");
				System.out.println("　　　　↑：Ｗ　　\n←：Ａ　↓：Ｓ　→：Ｄ");
				houkou = stdIn.next();
				if (!(houkou.equals("W")) && !(houkou.equals("A")) && !(houkou.equals("S")) && !(houkou.equals("D"))) {
					hyouji();
				}
			} while (!(houkou.equals("W")) && !(houkou.equals("A")) && !(houkou.equals("S")) && !(houkou.equals("D")));
			switch (houkou) {
			case "W":
				if (kokuri < 5) {
					System.out.println("場外には出れません");
					idou--;
				} else {
					kokuri -= 5;
					kaihi[genzaiti / 5][genzaiti % 5] = null;
					kaihi[kokuri / 5][kokuri % 5] = "国";
				}
				break;
			case "A":
				if (kokuri % 5 == 0) {
					System.out.println("場外には出れません");
					idou--;
				} else {
					kokuri--;
					kaihi[genzaiti / 5][genzaiti % 5] = null;
					kaihi[kokuri / 5][kokuri % 5] = "国";
				}
				break;
			case "S":
				if (kokuri > 19) {
					System.out.println("場外には出れません");
					idou--;
				} else {
					kokuri += 5;
					kaihi[genzaiti / 5][genzaiti % 5] = null;
					kaihi[kokuri / 5][kokuri % 5] = "国";
				}
				break;
			default:
				if (kokuri % 5 == 4) {
					System.out.println("場外には出れません");
					idou--;
				} else {
					kokuri++;
					kaihi[genzaiti / 5][genzaiti % 5] = null;
					kaihi[kokuri / 5][kokuri % 5] = "国";
				}
			}
			if (kokuri == bomb1 || kokuri == bomb2) {
				System.out.println("爆弾を踏みました\nＧＡＭＥＯＶＥＲＡ");
				break;
			} else if (idou != 5) {
				hyouji();
			} else if (idou == 5) {
				System.out.println("ク　リ　ア");
				System.out.println("─十─十─十─十─十");
				for (int a = 0; a < 25; a++) {
					if (kaihi[a / 5][a % 5] == null) {
						System.out.print("　｜");
					} else {
						System.out.print(kaihi[a / 5][a % 5] + "｜");
					}
					if (a % 5 == 4 && a != 0) {
						System.out.println("\n─十─十─十─十─十");
					}
				}
			}
		}
	}

	static void hyouji() {
		System.out.println("─十─十─十─十─十");
		for (int a = 0; a < 25; a++) {
			if (kaihi[a / 5][a % 5] == null || (kaihi[a / 5][a % 5].equals("☆"))) {
				System.out.print("　｜");
			} else {
				System.out.print(kaihi[a / 5][a % 5] + "｜");
			}
			if (a % 5 == 4 && a != 0) {
				System.out.println("\n─十─十─十─十─十");
			}
		}
	}
}
/*爆破回避
５＊５の２次元配列
ランダムの位置に国際理工を置く
ランダムな位置に２つ爆弾を置く
国際理工は表示する
爆弾は表示しない
ユーザーに方向を選ばせる
５回移動して爆弾を踏まなければクリア
国際理工は国で表示する
爆弾は☆で表示する
*/