package Course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Pocketon pocke1 = new Pocketon();
		pocke1.name = "銭ガタ";
		pocke1.power = 100;
		pocke1.difficult = 1;

		String[] arr2 = { "あ", "か", "さ" };

		Pocketon[] myPockes = new Pocketon[6];
		myPockes[0] = pocke1;

		Pocketon pocke2 = new Pocketon();
		pocke2.name = "不思議リーフ";
		pocke2.power = 200;
		pocke2.difficult = 3;
		myPockes[1] = pocke2;

		System.out.println(myPockes[0].name);
		System.out.println(myPockes[1].difficult);

		Pocketon pocke3 = new Pocketon();
		pocke3.name = stdIn.next();
		pocke3.power = stdIn.nextInt();
		pocke3.difficult = stdIn.nextInt();
		myPockes[2] = pocke3;
		myPockes[2].display();

		for (int a = 0; a < 3; a++) {
			System.out.println(myPockes[a].name);
		}

		myPockes[1].display();
	}
}