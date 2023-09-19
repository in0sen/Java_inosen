package Course21;

import java.util.Scanner;

public class ArrQuestion03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int e = 0;
		int irekae[] = new int[12];
		int goukei = 0;
		int typhoon[] = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int quake[] = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int rain[] = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		System.out.println("見たい情報を選んでください");
		System.out.println("１：台風件数　２：地震件数　３：降水量　４：すべて");

		while (a > 4 || a < 1) {
			if (a >= 5) {
				System.out.println("5以上、０以下は入力しないでね");
			}
			a = stdIn.nextInt();
		}

		if (a == 1) {
			System.out.println("年別か月別かを選んでください");
			System.out.println("１：年別　２：月別　３：月別(大きい順)");
			b = stdIn.nextInt();
			while (b > 3 || b < 1) {
				System.out.println("３以上、０以下は入力しないでね");
				b = stdIn.nextInt();
			}
			if (b == 1) {
				for (int d : typhoon) {
					goukei = goukei + d;
				}
				System.out.println("１年間に起こった台風の総合計は" + goukei + "です");
			} else {
				if (b == 2) {
					System.out.println("見たい月を入力してください");
					e = stdIn.nextInt();
					while (e > 12 || e < 1) {
						System.out.println("１３以上、０以下は入力しないでね");
						e = stdIn.nextInt();
					}
					System.out.println(typhoon[e - 1]);

				} else {

					for (int s = 0; s < typhoon.length; s++) {
						if (s == typhoon.length - 1) {
							System.out.println(typhoon[s]);
						}
						int f = typhoon[s];
						int g = 0;

						for (int d = typhoon.length - 1; s < d; d--) {
							if (typhoon[s] < typhoon[d]) {
								typhoon[s] = typhoon[d];
								g = d;
							}
							if (s == d - 1) {
								System.out.println(typhoon[s]);
								typhoon[g] = f;

							}
						}
					}
				}
			}
		} else {

			if (a == 2) {
				System.out.println("年別か月別かを選んでください");
				System.out.println("１：年別　２：月別");
				b = stdIn.nextInt();
				while (b > 2 || b < 1) {
					System.out.println("３以上、０以下は入力しないでね");
					b = stdIn.nextInt();
				}
				if (b == 1) {
					for (int d : quake) {
						goukei = goukei + d;
					}
					System.out.println("１年間に起こった地震の総合計は" + goukei + "です");
				} else {
					System.out.println("見たい月を入力してください");
					e = stdIn.nextInt();
					while (e > 12 || e < 1) {
						System.out.println("１３以上、０以下は入力しないでね");
						e = stdIn.nextInt();
					}
					System.out.println(e + "月の地震件数は" + quake[e - 1] + "です。");
				}
			} else {

				if (a == 3) {
					System.out.println("年別か月別かを選んでください");
					System.out.println("１：年別　２：月別");
					b = stdIn.nextInt();
					while (b > 2 || b < 1) {
						System.out.println("３以上、０以下は入力しないでね");
						b = stdIn.nextInt();
					}
					if (b == 1) {
						for (int d : rain) {
							goukei = goukei + d;
						}
						System.out.println("１年間に起こった降水量の総合計は" + goukei + "です");
					} else {
						System.out.println("見たい月を入力してください");
						e = stdIn.nextInt();
						while (e > 12 || e < 1) {
							System.out.println("１３以上、０以下は入力しないでね");
							e = stdIn.nextInt();
						}
						System.out.println(e + "月の降水量は" + rain[e - 1] + "です。");
					}
				} else {

					System.out.println("台風");
					int tuki = 1;
					for (int taihuu : typhoon) {
						System.out.print(tuki + "月" + taihuu + "  ");
						tuki++;
					}
					tuki = 1;
					System.out.println("\n地震");
					for (int jisinn : quake) {
						System.out.print(tuki + "月" + jisinn + "  ");
						tuki++;
					}
					tuki = 1;
					System.out.println("\n雨");
					for (int ame : rain) {
						System.out.print(tuki + "月" + ame + "  ");
						tuki++;
					}
				}
			}
		}
	}

}