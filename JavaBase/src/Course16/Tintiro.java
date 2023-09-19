package Course16;

import java.util.Random;
import java.util.Scanner;

public class Tintiro {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random random = new Random();
		//所持金
		int shojikinn = 10000;
		System.out.println("所持金は１万です、５万を超えたらクリアです");
		//所持金５万以上　１未満で抜ける//
		while (shojikinn <= 50000 && shojikinn >= 1) {
			System.out.println("掛け金を入力してください");
			int kakekinn = stdIn.nextInt();
			int kakekinn1 = kakekinn;

			if (shojikinn >= kakekinn && kakekinn != 0) {
				//掛け金を所持金から減らす

				int ran1 = random.nextInt(7) + 1;
				System.out.println("１の出目は" + ran1 + "です");
				System.out.println("掛け金を増やしますか？");
				System.out.println("増やす　増やさない");
				System.out.println("※現在の掛け金は" + kakekinn + "です");
				String henkou = stdIn.next();
				while (!(henkou.equals("増やす")) && (!(henkou.equals("増やさない")))) {
					System.out.println("「増やす」か「増やさない」を入力してね");
					henkou = stdIn.next();
				}
				if (henkou.equals("増やす")) {
					System.out.println("掛け金を入力してください");
					kakekinn = stdIn.nextInt();

					while (kakekinn <= kakekinn1 || kakekinn >= shojikinn) {
						if (kakekinn >= shojikinn) {
							System.out.println("所持金を超えないでね");
							kakekinn = stdIn.nextInt();
						} else {
							System.out.println("元の所持金より大きな金額をかけてね");
							kakekinn = stdIn.nextInt();
						}
					}
				}
				shojikinn = shojikinn - kakekinn;
				int ran2 = random.nextInt(7) + 1;
				System.out.println("１の出目は" + ran1 + "　２の出目は" + ran2 + "です");
				System.out.println("ドロップアウトが可能ですがしますか");
				System.out.println("注意：ドロップアウトすると所持金から掛け金をひかれます");
				System.out.println("する　しない");
				String doroppuauto = stdIn.next();
				while (!(doroppuauto.equals("する")) && (!(doroppuauto.equals("しない")))) {
					System.out.println("「する」か「しない」を入力してね");
					doroppuauto = stdIn.next();
				}
				if (doroppuauto.equals("しない")) {

					int ran3 = random.nextInt(7) + 1;
					//サイコロを振った結果用
					int deme = ran1 + ran2 * 10 + ran3 * 100;

					System.out.println("出目は" + deme);

					//ピンゾロ
					if (deme == 111) {
						kakekinn = kakekinn * 6;
					} else {

						//ぞろ目
						if (ran1 == ran2 && ran1 == ran3) {
							kakekinn = kakekinn * 4;

						} else {
							//ションベン
							if ((ran1 == 7 && ran2 == 7) || (ran1 == 7 && ran3 == 7) || (ran3 == 7 && ran2 == 7)) {
								kakekinn = 0;

							} else {
								//通常の目
								if (ran1 == ran2 || ran1 == ran3 || ran2 == ran3) {

								} else {
									//シゴロ
									if ((ran1 >= 4 && ran2 >= 4 && ran3 >= 4) && (ran1 > 7 || ran2 > 7 || ran3 > 7)) {
										kakekinn = kakekinn * 3;

									} else {
										//ヒフミ
										if (ran1 <= 3 && ran2 <= 3 && ran3 <= 3) {
											kakekinn = -kakekinn;

										} else {
											//役無し
											kakekinn = 0;
										}
									}
								}
							}
						}
					}
				} else {
					shojikinn = shojikinn - kakekinn;
				}
				shojikinn = shojikinn + kakekinn;
				System.out.println("所持金" + shojikinn);
				System.out.println();
			} else {
				if (kakekinn != 0) {
					System.out.println("所持金は" + shojikinn);
					System.out.println(+shojikinn + "を超えないでください");
				} else {
					System.out.println("お金をかけてください");
				}
				System.out.println();
			}
		}
		if (shojikinn > 50000) {
			System.out.println("クリア");
		} else {
			System.out.println("１０５０年地下行き！");
		}
	}
}