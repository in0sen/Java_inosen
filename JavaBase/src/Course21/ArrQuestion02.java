package Course21;

import java.util.Scanner;

public class ArrQuestion02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int e = 0;
		int goukei = 0;
		int typhoon[] = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int quake[] = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int rain[] = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		System.out.println("見たい情報を選んでください");
		System.out.println("１：台風件数　２：地震件数　３：降水量");
		a = stdIn.nextInt();

		while (a > 3 || a < 1) {
			System.out.println("４以上、０以下は入力しないでね");
		}
		
		if (a == 1) {
			System.out.println("年別か月別かを選んでください");
			System.out.println("１：年別　２：月別");
			b = stdIn.nextInt();
			while (b > 2 || b < 1) {
				System.out.println("３以上、０以下は入力しないでね");
				b = stdIn.nextInt();
			}
			if (b == 1) {
				for (int d : typhoon) {
					goukei = goukei + d;
				}
				System.out.println("１年間に起こった台風の総合計は" + goukei + "です");
			} else {
				System.out.println("見たい月を入力してください");
				e = stdIn.nextInt();
				while (e > 12 || e < 1) {
					System.out.println("１３以上、０以下は入力しないでね");
					e = stdIn.nextInt();
				}
				System.out.println(e+"月の台風件数は" + typhoon[e - 1] + "です。");
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
					System.out.println(e+"月の地震件数は" + quake[e - 1] + "です。");
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
						System.out.println(e+"月の降水量は" + rain[e - 1] + "です。");
					}
				}
			}
		}
	}

}