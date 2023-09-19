package Course15;

import java.util.Random;
import java.util.Scanner;

public class pea1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random random = new Random();

		int shojikinn = 10000;

		while (shojikinn <= 50000 && shojikinn >= 1) {

			int kakekinn = stdIn.nextInt();

			int ran1 = random.nextInt(7) + 1;
			int ran2 = random.nextInt(7) + 1;
			int ran3 = random.nextInt(7) + 1;

			//さいころの結果を出目という文字関数で扱う
			String deme = ran1 + "・" + ran2 + "・" + ran3;
			System.out.println(deme);
			switch (deme) {

			//ピンゾロ
			case "1・1・1":
				kakekinn = kakekinn * 5;
				break;

			//ぞろ目三つ
			case "2・2・2":
			case "3・3・3":
			case "4・4・4":
			case "5・5・5":
			case "6・6・6":
			case "7・7・7":
				kakekinn = kakekinn * 3;
				break;

			//シゴロ
			case "4・5・6":
			case "4・6・5":
			case "5・4・6":
			case "5・6・4":
			case "6・4・5":
			case "6・5・4":
				kakekinn = kakekinn * 2;
				break;

			//ヒフミ
			case "1・2・3":
			case "1・3・2":
			case "2・1・3":
			case "2・3・1":
			case "3・1・2":
			case "3・2・1":
				kakekinn = -kakekinn * 2;
				break;

			//１ぞろ目二つ
			case "1・1・2":
			case "1・1・3":
			case "1・1・4":
			case "1・1・5":
			case "1・1・6":
			case "1・1・7":
			case "1・2・1":
			case "1・3・1":
			case "1・4・1":
			case "1・5・1":
			case "1・6・1":
			case "1・7・1":
			case "2・1・1":
			case "3・1・1":
			case "4・1・1":
			case "5・1・1":
			case "6・1・1":
			case "7・1・1":
				//２ぞろ目二つ
			case "2・2・1":
			case "2・2・3":
			case "2・2・4":
			case "2・2・5":
			case "2・1・6":
			case "2・1・7":
			case "2・1・2":
			case "2・3・2":
			case "2・4・2":
			case "2・5・2":
			case "2・6・2":
			case "2・7・2":
			case "1・2・2":
			case "3・2・2":
			case "4・2・2":
			case "5・2・2":
			case "6・2・2":
			case "7・2・2":
				//３ぞろ目二つ
			case "3・3・2":
			case "3・3・1":
			case "3・3・4":
			case "3・3・5":
			case "3・3・6":
			case "3・3・7":
			case "3・2・3":
			case "3・1・3":
			case "3・4・3":
			case "3・5・3":
			case "3・6・3":
			case "3・7・3":
			case "2・3・3":
			case "1・3・3":
			case "4・3・3":
			case "5・3・3":
			case "6・3・3":
			case "7・3・3":
				//４ぞろ目二つ
			case "4・4・2":
			case "4・4・3":
			case "4・4・1":
			case "4・4・5":
			case "4・4・6":
			case "4・4・7":
			case "4・2・4":
			case "4・3・4":
			case "4・1・4":
			case "4・5・4":
			case "4・6・4":
			case "4・7・4":
			case "2・4・4":
			case "3・4・4":
			case "1・4・4":
			case "5・4・4":
			case "6・4・4":
			case "7・4・4":
				//５ぞろ目二つ
			case "5・5・2":
			case "5・5・3":
			case "5・5・4":
			case "5・5・1":
			case "5・5・6":
			case "5・5・7":
			case "5・2・5":
			case "5・3・5":
			case "5・4・5":
			case "5・1・5":
			case "5・6・5":
			case "5・7・5":
			case "2・5・5":
			case "3・5・5":
			case "4・5・5":
			case "1・5・5":
			case "6・5・5":
			case "7・5・5":
				//６ぞろ目二つ
			case "6・6・2":
			case "6・6・3":
			case "6・6・4":
			case "6・6・5":
			case "6・6・1":
			case "6・6・7":
			case "6・2・6":
			case "6・3・6":
			case "6・4・6":
			case "6・5・6":
			case "6・1・6":
			case "6・7・6":
			case "2・6・6":
			case "3・6・6":
			case "4・6・6":
			case "5・6・6":
			case "1・6・6":
			case "7・6・6":
				kakekinn = 0;
				break;
			//役無しとションベン
			default:
				kakekinn = -kakekinn;
			}
			shojikinn = shojikinn + kakekinn;

			System.out.println(shojikinn);
		}
		if (shojikinn >= 50000) {
			System.out.println("クリア");
		} else {
			System.out.println("１０５０年地下行き！");
		}
	}
}