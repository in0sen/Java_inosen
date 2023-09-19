package Jitakuyou;

import java.util.Random;
import java.util.Scanner;

public class Kisuuhenkann {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		int mode = rand.nextInt(4) + 1;
		int suuti = rand.nextInt(503) + 10;
		String ni = "";
		String hati = "";
		String juu = "";
		String juuroku = "";
		ni = nihenkan(suuti);
		hati = hatihenkan(suuti);
		juuroku = juurokuhenkan(suuti);
		juu += suuti;
		String a2;
		String a8;
		String a10;
		String a16;

		if (mode == 1) {
			System.out.println("２進数：" + ni);
			a2 = ni;
			System.out.println("８進数の回答");
			a8 = stdIn.next();
			System.out.println("１０進数の回答");
			a10 = stdIn.next();
			System.out.println("１６進数の回答");
			a16 = stdIn.next();

		} else if (mode == 2) {
			System.out.println("８進数：" + hati);
			a8 = hati;
			System.out.println("２進数の回答");
			a2 = stdIn.next();
			System.out.println("１０進数の回答");
			a10 = stdIn.next();
			System.out.println("１６の回答");
			a16 = stdIn.next();
		} else if (mode == 3) {

			System.out.println("１０進数：" + suuti);
			a10 = juu;
			System.out.println("２進数の回答");
			a2 = stdIn.next();
			System.out.println("８進数の回答");
			a8 = stdIn.next();
			System.out.println("１６の回答");
			a16 = stdIn.next();

		} else {
			System.out.println("１６進数：" + juuroku);
			a16 = juuroku;
			System.out.println("２進数の回答");
			a2 = stdIn.next();
			System.out.println("８進数の回答");
			a8 = stdIn.next();
			System.out.println("１０の回答");
			a10 = stdIn.next();
		}
		System.out.println("\n答え");
		System.out.println("　２進数：" + ni);
		System.out.println("　８進数：" + hati);
		System.out.println("１０進数：" + suuti);
		System.out.println("１６進数：" + juuroku);
	}

	static String nihenkan(int suuti) {
		String ni = "";
		while (suuti != 0) {
			ni = suuti % 2 + ni;
			suuti /= 2;
		}
		return ni;
	}

	static String hatihenkan(int suuti) {
		String hati = "";
		while (suuti != 0) {
			hati = suuti % 8 + hati;
			suuti /= 8;
		}
		return hati;
	}

	static String juurokuhenkan(int suuti) {
		String[] suuji = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		String juuroku = "";
		while (suuti != 0) {
			juuroku = suuji[(suuti % 16) - 1] + juuroku;
			suuti /= 16;
		}
		return juuroku;
	}
}