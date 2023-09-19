package Course27;

import java.util.Random;
import java.util.Scanner;

public class Mix {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);
		int e = 1;
		///初期化プログラム
		int wincount = 0;
		int gamecount = 0;
		int losecount = 0;
		///所持金
		int kane = 1000;
		int okane = motigane(kane);
		while (e == 1) {
			System.out.println("現在の所持金は" + okane + "です");
			int a = rnd.nextInt(13) + 1;
			System.out.println(a);
			int a2 = rnd.nextInt(13) + 1;
			while (a == a2) {
				a2 = rnd.nextInt();
			}
			System.out.println("次のカードはこれよりも高い？低い？");
			System.out.println("高いと予想するなら「1」,低いと予想するなら「2」");
			int hihglow = stdIn.nextInt();
			String result = shouhai(a, a2, hihglow);
			System.out.println(a2);
			if (result.equals("WIN")) {
				wincount++;
				if ((a >= 2 && a <= 4) || (a >= 10 && a <= 12)) {
					okane *= 3;
				} else {
					okane *= 2;
				}
			} else {
				losecount++;
				okane /= 2;
			}
			///勝負数、勝利数、敗北数に加算処理をする
			gamecount++;
			int syoritu = syouritu(gamecount, wincount);
			System.out.println("勝率" + syoritu + "%");
			dispResult(gamecount, wincount, losecount);
			String owari = owari();
			System.out.println(owari);
			if (owari.equals("END")) {
				break;
			}
		}
	}

	static int motigane(int x) {
		int sum = x;
		return sum;
	}

	static String shouhai(int x, int y, int z) {
		String hantei = "";
		if (x < y) {
			if (z == 1) {
				hantei = "WIN";
			} else {
				hantei = "LOSE";
			}
		} else {
			if (z == 2) {
				hantei = "WIN";
			} else {
				hantei = "LOSE";
			}
		}
		return hantei;
	}

	static int syouritu(int x, int y) {
		int sum = 0;
		sum = y * 100 / x;
		return sum;
	}

	static void dispResult(int kazu, int kati, int make) {
		System.out.println("現在の行ったゲーム数は" + kazu + "です");
		System.out.println("現在の勝利数は" + kati + "です");
		System.out.println("現在の敗北数は" + make + "です");
	}

	static String owari() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("9999：ゲーム終了　その他：続行");
		int game = stdIn.nextInt();
		String shuuryou = "";
		if (game == 9999) {
			shuuryou = "END";
		} else {
			shuuryou = "CONT";
		}
		return shuuryou;
	}
}
