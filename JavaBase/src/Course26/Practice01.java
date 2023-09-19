package Course26;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner stdIn = new Scanner(System.in);

		int game = 0;

		int gamecount = 0;
		do {

			int ra1 = ran.nextInt(13) + 1;
			int ra2 = ran.nextInt(13) + 1;
			while (ra1 == ra2) {
				ra2 = ran.nextInt(13) + 1;
			}
			System.out.println("カードは" + (ra1) + "です。次のカードはこれより高い？低い？");
			System.out.println("高いと予想するなら「１」　低いと予想するなら「２」");
			int handan = stdIn.nextInt();
			while (handan < 1 && handan > 2) {
				System.out.println("高いと予想するなら「１」　低いと予想するなら「２」");
				handan = stdIn.nextInt();
			}
			String hantei = shouhai(ra1, ra2, handan);
			System.out.println("現在のカード：【" + ra1 + "】\n" + "次のカードは【" + ra2 + "】");
			System.out.println(hantei);
			//勝負数、勝利数、敗北数に加算する
			String owari = owari();
			System.out.println(owari);
			if(owari.equals("END")) {
				break;
			}
		} while (game != 9999);
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