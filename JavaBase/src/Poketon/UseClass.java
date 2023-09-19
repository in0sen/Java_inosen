package Poketon;

import java.util.Scanner;

public class UseClass {
	public static void main(String[] args) {
		int hiki = 0;
		Scanner stdIn = new Scanner(System.in);

		Trainer trainer = new Trainer();
		Pocketon pocke = new Pocketon("名前", "タイプ", 0, 0);
		System.out.println("名前入力");
		String player = stdIn.next();
		Pocketon a = new Pocketon(player, "", 0, 0);
		int menu = 0;
		int b = 0;
		pocke.type = "";
		while (menu != 99) {
			System.out.println("１：捕獲　２：図鑑を見る　３：バトル　９９：終了");
			menu = stdIn.nextInt();
			while ((menu < 1 || menu > 3) && menu != 99) {
				System.out.println("１：捕獲　２：図鑑を見る　３：バトル　９９：終了");
				menu = stdIn.nextInt();
			}
			if (menu == 99) {

				break;
			} else {
				int zokusei = 0;
				if (menu == 1) {
					System.out.println("捕獲するポケモ○の名前を入力してね");
					pocke.name = stdIn.next();

					System.out.println("捕獲するポケ○ンのタイプを入力してね");
					while (zokusei < 1 || zokusei > 4) {
						System.out.println("１：炎　２：水　３：地面　４：草");
						zokusei = stdIn.nextInt();
					}
					if (zokusei == 1) {
						pocke.type = "炎";
					} else {
						if (zokusei == 2) {
							pocke.type = "水";
						} else {
							if (zokusei == 3) {
								pocke.type = "地面";
							} else {
								pocke.type = "草";
							}
						}
					}

					System.out.println("捕獲するポ○モンの戦闘力を入力してね");
					pocke.power = stdIn.nextInt();
					System.out.println("捕獲する○ケモンの捕獲難易度を入力してね");
					pocke.difficult = stdIn.nextInt();
					System.out.println();
					trainer.capture(pocke);
					hiki++;
					if (hiki == pocke.getted) {
						trainer.display();
					} else {
						hiki--;
					}
				} else {
					if (menu == 2) {
						trainer.display();
					} else {
						Battle battle = new Battle();
						if (pocke.getted < 2) {
							System.out.println("バトルには手持ちのポケモソが２匹必要です。\n現在の手持ちは" + pocke.getted + "だけです");
						} else {
							System.out.println("戦わせるポケモソの名前を２匹入力してください");
							String pocke1 = stdIn.next();
							try {
								for (b = 0; (!(pocke1.equals(trainer.myPockes[b].name))) && b < hiki; b++) {
								}
								Pocketon c = trainer.myPockes[b];
								System.out.println("もう１匹のポケモソの名前を入力してください");
								String pocke2 = stdIn.next();
								for (b = 0; (!(pocke2.equals(trainer.myPockes[b].name))) && b < hiki; b++) {
								}
								Pocketon d = trainer.myPockes[b];
								String winner = battle.doBattle(c, d);
								if (!(winner.equals("引き分け"))) {
									System.out.println("勝ったのは" + winner);
								} else {
									System.out.println(winner);
								}
							} catch (NullPointerException e) {
								System.out.println("その名前のポケモソは手持ちに居ません");
							}
						}
					}
				}
			}
			System.out.println();
		}
	}
}