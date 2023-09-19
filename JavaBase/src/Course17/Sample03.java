package Course17;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {

		//整数リテラル
		int a = 13; //１０進数の１３
		int b = 013; //　８進数の１３
		int c = 0x13; //１６進数の１３

		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);

		//int型の整数値を１０進数で読み込んで１０進数・８進数・１６進数で表現
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数：");
		int x = stdIn.nextInt();

		System.out.printf("１０進数では%dです。\n", x);
		System.out.printf("　８進数では%oです。\n", x);
		System.out.printf("１６進数では%xです。\n", x);

	}
}