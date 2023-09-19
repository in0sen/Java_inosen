package Course09;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("数値を入力してください");

		int num = stdIn.nextInt();

		switch (num) {
		case 1:
			System.out.println("１ですね？");
			break;
		case 2:
			System.out.println("２ですね？");
			break;
		default:
			System.out.println("該当せず");

		}

	}

}
