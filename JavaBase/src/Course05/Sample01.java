package Course05;

import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加算します");

		System.out.println("xの値を入力してください");
		//変数「x」に入力した内容が
		//格納される。
		int x = stdIn.nextInt();
		x = x + 10;

		System.out.println("yの値を入力してください");

		int y = stdIn.nextInt();

		System.out.println("ｚの値を入力してください");

		int z = stdIn.nextInt();

		double a = stdIn.nextDouble();

		System.out.println("x + y =" + (x + y));

	}
}