package Course22;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int tate = 0;
		int yoko = 0;
		int gyou = 0;
		int retu = 0;
		int tesuu=0;
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
			System.out.println("入れ替え位置の縦を入力してください");
			tate = std.nextInt();
			System.out.println("入れ替え位置の横を入力してください");
			yoko = std.nextInt();
			irekae1 = rikodora[tate][yoko];

			System.out.println("入れ替え先の縦を入力してください");
			gyou = std.nextInt();
			System.out.println("入れ替え先の縦を入力してください");
			retu = std.nextInt();
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
		System.out.print(tesuu+"で");
		System.out.println("クリア");
	}
}
