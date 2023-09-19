package Course48;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random random1 = new Random();
		int[][] chair = new int[6][6];
		//エラーが発生（文字入力）した時に入力した文字を格納する
		String gomibako = "";
		System.out.println("完全ランダムで席を決める　　左上の席から出席番号を決める");
		System.out.println("0：ランダム　　その他：指定");
		//ランダムか指定かの判定を行う変数
		int sekigae;
		try {
			sekigae = stdIn.nextInt();
		} catch (Exception e) {
			gomibako = stdIn.next();
			sekigae = 1;
		}
		//ランダムか指定かの分岐
		if (sekigae == 0) {
			//入れ替えをしてない出席番号を入れる変数
			int[] number = new int[36];
			//「number」に出席番号１～３６を入れる
			for (int a = 0; a < number.length; a++) {
				number[a] = a + 1;
			}
			//入れ替えの行(j)と列(i)
			for (int j = 0; j < 6; j++) {
				for (int i = 0; i < 6; i++) {
					//１～３６の乱数生成＆格納
					int ran = random1.nextInt(36) + 1;
					//配列に格納されている番号と「ran」を揃えるためのデクリメント(変数から１引くこと)
					ran--;
					//「number」の「ran」のところに0じゃないことを確認する
					//0ならループさせる
					while (number[ran] == 0) {
						ran = random1.nextInt(36) + 1;
						//配列に格納されている番号と「ran」を揃えるためのデクリメント(変数から１引くこと)
						ran--;
					}
					//j列 i行にランダムで出た変数を格納する
					chair[j][i] = number[ran];
					//席が決まった人は０にする
					number[ran] = 0;
				}
			}
		} else {
			/*i,jに数値（１～３６）を入れる
			 * 被りがあってはいけない
			 * 被っているならもっかい入力
			 * ３６の席全て入力したら繰り返し処理の終了
			 */
			int[] banngou = new int[36];
			for (int a = 1; a <= banngou.length; a++) {
				banngou[a - 1] = a;
			}
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					System.out.println((i + 1) + "行の" + (j + 1) + "番目" + "を入力してね");
					int q = stdIn.nextInt();
					//１～３６であること確認する
					while (q < 1 || q > 36) {
						System.out.println("１～３６以外を入れないでね");
						q = stdIn.nextInt();
					}
					q--;
					//「banngou」配列に入ってる文字が０出ないこと確認する
					while (banngou[q] == 0) {
						System.out.println("その人は席がもう決まっているよ");
						System.out.println("数値を入力してね");
						q = stdIn.nextInt();
						//入れる数値が１～３６であること確認する
						while (q < 1 || q > 36) {
							System.out.println("１～３６以外を入れないでね");
							q = stdIn.nextInt();
						}
						q--;
					}
					chair[i][j] = banngou[q];
					//入れた番号はもう入れないように０に置き換える
					banngou[q] = 0;
				}
			}
		}
		for (int z1 = 0; z1 < 6; z1++) {
			for (int z2 = 0; z2 < 6; z2++) {
				if (chair[z1][z2] < 10) {
					System.out.print(" ");
				}
				System.out.print(" " + chair[z1][z2] + " ");
				if (z2 != 5) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		System.out.println("席替えが終了しました");
		System.out.println("席を変更しますか？確定しますか？");
		System.out.println("0：確定　　その他：変更");
		int henkou;
		//文字が入力されたら「henkou」に1を入れる。
		//try-catch　エラー排除
		try {
			henkou = stdIn.nextInt();
		} catch (Exception e) {
			gomibako = stdIn.next();
			henkou = 1;
		}
		//入力されたのが0以外なら席替えの変更をする
		//入力されたのが0なら席を確定する
		while (henkou != 0) {
			//エラー時のループ変数
			int loop2;
			//「a」は入れ替え元
			//「b」は入れ替え先
			// 1は行
			// 2は列
			int a1 = 0;
			int a2 = 0;
			int b1 = 0;
			int b2 = 0;
			//do-while 　エラーが起きた時のループ（文字入力）
			//try-catch　エラー排除
			//while　　　０～５以外の数値を入力させない
			System.out.println("入れ替え元の行を入力してね");
			do {
				try {
					System.out.println("数値で入力してね");
					loop2 = 1;
					a1 = stdIn.nextInt();
					while (a1 < 0 || a1 > 5) {
						System.out.println("０～５を入力してね");
						a1 = stdIn.nextInt();
					}
				} catch (Exception e) {
					gomibako = stdIn.next();
					loop2 = 0;
				}
			} while (loop2 == 0);
			//do-while 　エラーが起きた時のループ（文字入力）
			//try-catch　エラー排除
			//while　　　０～５以外の数値を入力させない
			System.out.println("入れ替え元の列を入力してね");
			do {
				try {
					System.out.println("数値で入力してね");
					loop2 = 1;
					a2 = stdIn.nextInt();
					while (a2 < 0 || a2 > 5) {
						System.out.println("０～５を入力してね");
						a2 = stdIn.nextInt();
					}
				} catch (Exception e) {
					gomibako = stdIn.next();
					loop2 = 0;
				}
			} while (loop2 == 0);
			int moto = chair[a1][a2];
			//do-while 　エラーが起きた時のループ（文字入力）
			//try-catch　エラー排除
			//while　　　０～５以外の数値を入力させない
			System.out.println("入れ替え先の行を入力してね");
			do {
				try {
					System.out.println("数値で入力してね");
					loop2 = 1;
					b1 = stdIn.nextInt();
					while (b1 < 0 || b1 > 5) {
						System.out.println("０～５を入力してね");
						b1 = stdIn.nextInt();
					}
				} catch (Exception e) {
					gomibako = stdIn.next();
					loop2 = 0;
				}
			} while (loop2 == 0);
			//do-while 　エラーが起きた時のループ（文字入力）
			//try-catch　エラー排除
			//while　　　０～５以外の数値を入力させない
			System.out.println("入れ替え先の列を入力してね");
			do {
				try {
					System.out.println("数値で入力してね");
					loop2 = 1;
					b2 = stdIn.nextInt();
					while (b2 < 0 || b2 > 5) {
						System.out.println("０～５を入力してね");
						b2 = stdIn.nextInt();
					}
				} catch (Exception e) {
					gomibako = stdIn.next();
					loop2 = 0;
				}
			} while (loop2 == 0);
			//席の入れ替え
			chair[a1][a2] = chair[b1][b2];
			chair[b1][b2] = moto;
			//入れ替え後の席を出す
			for (int z1 = 0; z1 < 6; z1++) {
				for (int z2 = 0; z2 < 6; z2++) {
					//見やすくするために出席番号が１０未満の時に半角の空白を出力する
					if (chair[z1][z2] < 10) {
						System.out.print(" ");
					}
					System.out.print(" " + chair[z1][z2] + " ");
					//１番右の席の人以外を「,」で区切る
					if (z2 != 5) {
						System.out.print(",");
					}
				}
				//１行(６人)出したら後ろの行に行く
				System.out.println();
			}
			System.out.println("もう一回変更しますか？");
			System.out.println("0：確定　　その他：変更");
			try {
				henkou = stdIn.nextInt();
			} catch (Exception e) {
				gomibako = stdIn.next();
				henkou = 1;
			}
		}
		System.out.println("最終的な席はこうなりました");
		for (int z1 = 0; z1 < 6; z1++) {
			for (int z2 = 0; z2 < 6; z2++) {
				if (chair[z1][z2] < 10) {
					System.out.print(" ");
				}
				System.out.print(" " + chair[z1][z2] + " ");
				if (z2 != 5) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}