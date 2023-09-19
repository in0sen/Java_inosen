package Course22;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int kaisuu = 0;
		int tate = 0;
		int yoko = 0;
		int gyou = 0;
		int retu = 0;
		int haijo = 0;
		int fusei = 0;
		int tesuu = 0;
		String irekae1 = "";
		String irekae2 = "";
		String rikodora[][] = new String[3][3];
		rikodora[0][0] = "☆";
		rikodora[0][1] = "□";
		rikodora[0][2] = "☆";
		rikodora[1][0] = "□";
		rikodora[1][1] = "☆";
		rikodora[1][2] = "△";
		rikodora[2][0] = "△";
		rikodora[2][1] = "□";
		rikodora[2][2] = "△";
		while (!(rikodora[0][0].equals("Ｇ")) || (!(rikodora[1][1].equals("Ｇ")) || (!(rikodora[2][2].equals("Ｇ"))))) {
			tesuu++;
			for (int a = 0; a < rikodora.length; a++) {
				for (int b = 0; b < rikodora.length; b++) {
					System.out.print(rikodora[a][b]);
				}
				System.out.println();
			}

			if (kaisuu != 0) {
				tate = 0;
				yoko = 0;
				gyou = 0;
				retu = 0;
				fusei = 0;
			}
			kaisuu++;
			do {
				if (fusei != 0) {
					System.out.println("Ｇを動かさないで");
				}
				System.out.println("入れ替え位置の縦を入力してください");

				while (tate < 1 || tate > 4) {
					if (haijo != 0) {
						System.out.println("１から３までの数値を入力してね");
					}
					haijo++;
					tate = std.nextInt();
				}
				tate--;
				haijo = 0;

				System.out.println("入れ替え位置の横を入力してください");
				while (yoko < 1 || yoko > 3) {
					if (haijo != 0) {
						System.out.println("１から３までの数値を入力してね");
					}
					haijo++;
					yoko = std.nextInt();
				}
				yoko--;
				haijo = 0;
				fusei++;
			} while (rikodora[tate][yoko].equals("Ｇ"));
			irekae1 = rikodora[tate][yoko];
			fusei = 0;

			do {
				if (fusei != 0) {
					System.out.println("Ｇを動かさないで");
				}

				System.out.println("入れ替え先の縦を入力してください");

				while (gyou < 1 || gyou > 3) {
					if (haijo != 0) {
						System.out.println("１から３までの数値を入力してね");
					}
					haijo++;
					gyou = std.nextInt();
				}
				gyou--;
				haijo = 0;

				System.out.println("入れ替え先の縦を入力してください");

				while (retu < 1 || retu > 3) {
					if (haijo != 0) {
						System.out.println("１から３までの数値を入力してね");
					}
					haijo++;
					retu = std.nextInt();
				}
				retu--;
				haijo = 0;
				fusei++;
			} while (rikodora[gyou][retu].equals("Ｇ"));
			irekae2 = rikodora[gyou][retu];

			rikodora[gyou][retu] = irekae1;
			rikodora[tate][yoko] = irekae2;

			if (rikodora[0][0].equals(rikodora[0][1]) && (rikodora[0][0].equals(rikodora[0][2]))) {
				rikodora[0][0] = "Ｇ";
				rikodora[0][1] = "Ｇ";
				rikodora[0][2] = "Ｇ";
			}
			if (rikodora[1][0].equals(rikodora[1][1]) && (rikodora[1][0].equals(rikodora[1][2]))) {
				rikodora[1][0] = "Ｇ";
				rikodora[1][1] = "Ｇ";
				rikodora[1][2] = "Ｇ";
			}
			if (rikodora[2][0].equals(rikodora[2][1]) && (rikodora[2][0].equals(rikodora[2][2]))) {
				rikodora[2][0] = "Ｇ";
				rikodora[2][1] = "Ｇ";
				rikodora[2][2] = "Ｇ";
			}

			if (rikodora[0][0].equals(rikodora[1][0]) && (rikodora[0][0].equals(rikodora[2][0]))) {
				rikodora[0][0] = "Ｇ";
				rikodora[1][0] = "Ｇ";
				rikodora[2][0] = "Ｇ";
			}
			if (rikodora[0][1].equals(rikodora[1][1]) && (rikodora[0][1].equals(rikodora[2][1]))) {
				rikodora[0][1] = "Ｇ";
				rikodora[1][1] = "Ｇ";
				rikodora[2][1] = "Ｇ";
			}
			if (rikodora[0][2].equals(rikodora[1][2]) && (rikodora[0][2].equals(rikodora[2][2]))) {
				rikodora[0][2] = "Ｇ";
				rikodora[1][2] = "Ｇ";
				rikodora[2][2] = "Ｇ";
			}
		}
		for (int a = 0; a < rikodora.length; a++) {
			for (int b = 0; b < rikodora.length; b++) {
				System.out.print(rikodora[a][b]);
			}
			System.out.println();
		}
		System.out.println(tesuu + "手でクリア");
	}
}
