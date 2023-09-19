package Course55;

import java.util.Scanner;

public class TyphoonControll2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Typhoon tyhoon1 = new Typhoon(1, "2022-4-8", "マラカス");
		Typhoon tyhoon2 = new Typhoon(2, "2022-4-10", "メーギー");
		Typhoon tyhoon3 = new Typhoon(3, "2022-6-30", "チャバ");
		Typhoon tyhoon4 = new Typhoon(4, "2022-7-1", "アイレー");
		Typhoon tyhoon5 = new Typhoon(5, "2022-7-28", "ソングダー");
		Typhoon tyhoon6 = new Typhoon(6, "2022-7-31", "トローセス");
		Typhoon tyhoon7 = new Typhoon(7, "2022-8-9", "ムーラン");
		Typhoon tyhoon8 = new Typhoon(8, "2022-8-12", "メアリー");
		Typhoon tyhoon9 = new Typhoon(9, "2022-8-22", "マーゴン");
		Typhoon tyhoon10 = new Typhoon();
		Typhoon tyhoon11 = new Typhoon();
		Typhoon tyhoon12 = new Typhoon();
		Typhoon tyhoon13 = new Typhoon();
		Typhoon tyhoon14 = new Typhoon();
		Typhoon tyhoon15 = new Typhoon();
		Typhoon[] typhoonlist = { tyhoon1, tyhoon2, tyhoon3, tyhoon4, tyhoon5, tyhoon6, tyhoon7, tyhoon8, tyhoon9,
				tyhoon10, tyhoon11, tyhoon12, tyhoon13, tyhoon14, tyhoon15 };
		String mode;
		String gomi;
		int bangou = 9;
		do {
			System.out.println("台風編集\n0:編集しない　55:追加　99:編集する");
			System.out.println("数値入力");
			mode = stdIn.next();
			if (mode.equals("99")) {
				System.out.println("台風番号入力");
				try {
					int bango = stdIn.nextInt();
					if (bango < 1 || bango > 10) {
						bango /= 0;
					} else {
						System.out.println("台風" + bango + "号の名前を入力してください");
						bango--;
						typhoonlist[bango].setName(stdIn.next());
					}
				} catch (java.util.InputMismatchException e) {
					gomi = stdIn.next();
				} catch (Exception e) {
				}
			} else if (mode.equals("55")) {
				try {
					System.out.print("台風" + (bangou + 1) + "号の");
					typhoonlist[bangou].setBango(bangou + 1);
					System.out.println("台風の発生日入力");
					System.out.println("XXXX-XX-XX");
					typhoonlist[bangou].setHassei(stdIn.next());
					System.out.println("台風の発生した名前");
					typhoonlist[bangou++].setName(stdIn.next());
				} catch (Exception e) {
					gomi = stdIn.next();
				}
			}
		} while (!mode.equals("0"));
		for (Typhoon a : typhoonlist) {
			System.out.println(a.getName());
			if (a.getBango() == bangou) {
				break;
			}
		}
	}
}