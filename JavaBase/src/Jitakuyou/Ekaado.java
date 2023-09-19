package Jitakuyou;

import java.util.Random;
import java.util.Scanner;

public class Ekaado {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random ransuu = new Random();

		System.out.println("ルール説明");
		System.out.println("皇帝は市民に　市民は奴隷に　奴隷は皇帝に勝ちます");
		System.out.println("カード枚数は市民四枚　皇帝と奴隷が一枚");
		System.out.println("一度使ったカードをもう使えません");
		System.out.println();
		System.out.println("陣営交代したら使えるようになります");
		System.out.println("３戦ごとに陣営交代");
		System.out.println("また両陣営市民のみになった場合も陣営を好感します");
		System.out.println("その時残りのゲームは引き分けとしてカウントされます");
		System.out.println();
		System.out.println("７回勝利　7回敗北　１２ゲームでゲーム終了です");
		System.out.println("では、陣営を選択してください");
		System.out.println("皇帝 or 奴隷");

		//String sentaku = stdIn.next();
		String sentaku = stdIn.next();
		int siminn = 4;
		int aite = 4;
		int koutei = 1;
		int dorei = 1;
		int game = 0;
		int kaisuu = 1;
		int haiboku = 0;
		int shouri = 0;
		while (game < 12 && shouri <= 6 && haiboku <= 6) {
			game++;

			if (sentaku.equals("皇帝")) {
				System.out.println("陣営は皇帝です");
				//自分と相手の現在のカード枚数
				System.out.print("自分のカードは");
				System.out.print("皇帝" + koutei + "枚");
				System.out.println("　市民" + siminn + "枚");
				System.out.print("相手のカードは");
				System.out.print("奴隷" + dorei + "枚");
				System.out.println("　市民" + aite + "枚");
				System.out.println();

				//自分カード選択
				if (koutei == 0) {
					System.out.println("皇帝がないので市民を出します");
					String kaado = "市民";
					siminn--;

					//敵のカード選択
					int teki = ransuu.nextInt(aite + 1) + 1;
					if (dorei == 0 || koutei == 0) {
						System.out.println("相手のカードは市民です");
						aite--;
						System.out.println("引き分け");
					} else {
						if (teki == 5) {
							System.out.println("相手のカードは奴隷です");
							dorei--;
							System.out.println("勝利");
							shouri++;
						} else {
							System.out.println("相手のカードは市民です");
							aite--;
							System.out.println("引き分け");
						}
					}

				} else {
					System.out.println("何を出しますか？");
					String kaado = stdIn.next();
					while (!(kaado.equals("皇帝")) && (!(kaado.equals("市民")))) {
						System.out.println("皇帝か市民を入力してね");
						kaado = stdIn.next();
					}
					if (kaado.equals("皇帝")) {
						koutei--;

						//敵のカード選択
						int teki = ransuu.nextInt(5) + 1;
						if (dorei == 0) {
							System.out.println("相手のカードは市民です");
							aite--;
							System.out.println("勝ち");
							shouri++;
						} else {
							if (teki == 5) {
								System.out.println("相手のカードは奴隷です");
								dorei--;
								System.out.println("負け");
								haiboku++;
							} else {
								System.out.println("相手のカードは市民です");
								aite--;
								System.out.println("勝ち");
								shouri++;
							}
						}
					} else {
						siminn--;

						//敵のカード選択
						int teki = ransuu.nextInt(aite + 1) + 1;
						if (dorei == 0) {
							System.out.println("相手のカードは市民です");
							aite--;
							System.out.println("引き分け");
						} else {
							if (teki == 5) {
								System.out.println("相手のカードは奴隷です");
								dorei--;
								System.out.println("勝利");
								shouri++;
							} else {
								System.out.println("相手のカードは市民です");
								aite--;
								System.out.println("引き分け");
							}
						}
					}
				}

				System.out.println();
				if (shouri == 7) {
					System.out.println("ゲーム終了：７回勝利しました");
					System.out.println("あなたの勝利です");
					break;
				} else {
					if (haiboku == 7) {
						System.out.println("ゲーム終了：７回敗北しました");
						System.out.println("あなたの負けです");
						break;
					} else {
						if (game < 12) {
							System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
							System.out.println("あと" + (7 - shouri) + "勝で勝利です");
						} else {
							if (shouri > haiboku) {
								System.out.println("ゲーム終了");
								System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
								System.out.println("あなたの勝利です");
								break;
							} else {
								if (shouri < haiboku) {
									System.out.println("ゲーム終了");
									System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
									System.out.println("あなたの負けです");
								} else {
									System.out.println("ゲーム終了");
									System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
									System.out.println("引き分け");
								}
							}
						}
					}
				}
				System.out.println();
				//カードのリセット　陣営の変更
				if ((game % 3 == 0 && game != 0 & game <= 9) || (koutei == 0 && dorei == 0 && game <= 9)) {
					if (game % 3 != 0) {
						System.out.println(3 - (game % 3) + "回引き分けになります");
						System.out.println();
						game = (game / 3 + 1) * 3;
					}
					System.out.println("陣営を交代します");
					sentaku = "奴隷";
					dorei = 1;
					koutei = 1;
					siminn = 4;
					aite = 4;
				}

			} else {
				if (sentaku.equals("奴隷")) {
					System.out.println("陣営は奴隷です");
					//自分と相手の現在のカード枚数
					System.out.print("自分のカードは");
					System.out.print("奴隷" + dorei + "枚");
					System.out.println("　市民" + siminn + "枚");
					System.out.print("相手のカードは");
					System.out.print("皇帝" + koutei + "枚");
					System.out.println("　市民" + aite + "枚");
					System.out.println();

					//自分カード選択
					if (dorei == 0) {
						System.out.println("奴隷がないので市民を出します");
						String kaado = "市民";
						siminn--;

						//敵のカード選択
						int teki = ransuu.nextInt(5) + 1;
						if (koutei == 0) {
							System.out.println("相手のカードは市民です");
							aite--;
							System.out.println("引き分け");
						} else {
							if (teki == 5 || (dorei == 0 && koutei != 0)) {
								System.out.println("相手のカードは皇帝です");
								koutei--;
								System.out.println("負け");
								haiboku++;
							} else {
								System.out.println("相手のカードは市民です");
								aite--;
								System.out.println("引き分け");
							}
						}

					} else {

						System.out.println("何を出しますか？");
						String kaado = stdIn.next();

						while (!(kaado.equals("奴隷")) && (!(kaado.equals("市民")))) {
							System.out.println("奴隷か市民を入力してね");
							kaado = stdIn.next();
						}
						if (kaado.equals("奴隷")) {
							dorei--;

							//敵のカード選択
							int teki = ransuu.nextInt(5) + 1;
							if (koutei == 0) {
								System.out.println("相手のカードは市民です");
								aite--;
								System.out.println("負け");
								haiboku++;
							} else {
								if (teki == 5) {
									System.out.println("相手のカードは皇帝です");
									koutei--;
									System.out.println("勝ち");
									shouri++;
								} else {
									System.out.println("相手のカードは市民です");
									aite--;
									System.out.println("負け");
									haiboku++;
								}
							}
						} else {
							siminn--;

							//敵のカード選択
							int teki = ransuu.nextInt(5) + 1;
							if (dorei == 0) {
								System.out.println("相手のカードは市民です");
								aite--;
								System.out.println("引き分け");
							} else {
								if (teki == 5) {
									System.out.println("相手のカードは奴隷です");
									dorei--;
									System.out.println("勝利");
									shouri++;
								} else {
									System.out.println("相手のカードは市民です");
									aite--;
									System.out.println("引き分け");
								}
							}
						}
					}

					//途中経過とゲーム終了
					if (shouri == 7) {
						System.out.println("ゲーム終了：７回勝利しました");
						System.out.println("あなたの勝利です");
						break;
					} else {
						if (haiboku == 7) {
							System.out.println("ゲーム終了：７回敗北しました");
							System.out.println("あなたの負けです");
							break;
						} else {
							if (game < 12) {
								System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
								System.out.println("あと" + (7 - shouri) + "勝で勝利です");
							} else {
								if (shouri > haiboku) {
									System.out.println("ゲーム終了");
									System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
									System.out.println("あなたの勝利です");
									break;
								} else {
									if (shouri < haiboku) {
										System.out.println("ゲーム終了");
										System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
										System.out.println("あなたの負けです");
									} else {
										System.out.println("ゲーム終了");
										System.out.println(game + "戦" + shouri + "勝" + haiboku + "敗");
										System.out.println("引き分け");
									}
								}
							}
						}
					}
					System.out.println();
					//カードのリセット　陣営の変更
					if ((game % 3 == 0 && game != 0 && game <= 9) || (koutei == 0 && dorei == 0 && game <= 9)) {
						if (game % 3 != 0) {
							System.out.println(3 - (game % 3) + "回引き分けになります");
							System.out.println();
							game = (game / 3 + 1) * 3;
						}
						System.out.println("陣営を交代します");
						sentaku = "皇帝";
						koutei = 1;
						dorei = 1;
						siminn = 4;
						aite = 4;
					}

					//選択肢以外の
				} else {
					System.out.println("「皇帝」か「奴隷」を選択してね");
					System.out.println("皇帝 or 奴隷");
					sentaku = stdIn.next();
				}
			}
		}
	}
}

/*やって後悔した
やらなければよかった
終わりが見えない助けて
休み一日しかないのに何やってんだろ
現在１０６行、「どうすれば終わるのだろうか
現在１２４行、もうやだふて寝したい
現在３００行、後戻りできないところまで来てしまったぶっちゃけ辞めたい
製作開始から５時間　簡単だと思ったのにとてつもない時間を費やしてしまった、まだ終わっていない
作成開始から９時間やっと終わった疲れた二度とこのプログラム書きたくない
一日をこれに費やしてしまったなにしてんだろ
翌日多分完璧だろう、ミスがあってもやり直しはしない*/