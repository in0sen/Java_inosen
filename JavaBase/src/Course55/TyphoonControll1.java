package Course55;

import java.util.Scanner;

public class TyphoonControll1 {
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
		Typhoon[] typhoonlist = { tyhoon1, tyhoon2, tyhoon3, tyhoon4, tyhoon5, tyhoon6, tyhoon7, tyhoon8, tyhoon9 };
		String mode;
		do {
			System.out.println("台風名前編集\n0:編集しない　99:編集する");
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
					String gomi = stdIn.next();
				} catch (Exception e) {
				}
			}
		} while (!mode.equals("0"));
		for (Typhoon a : typhoonlist) {
			System.out.println(a.getName());
		}
	}
}