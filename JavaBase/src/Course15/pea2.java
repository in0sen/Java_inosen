package Course15;

import java.util.Random;
import java.util.Scanner;

public class pea2 {

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
			
			if (shojikinn >= kakekinn && kakekinn != 0) {
				//掛け金を所持金から減らす
				shojikinn = shojikinn - kakekinn;

				int ran1 = random.nextInt(7) + 1;
				int ran2 = random.nextInt(7) + 1;
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
				shojikinn = shojikinn + kakekinn ;
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