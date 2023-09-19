package Course41;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//①
		String moji = "模擬テスト。100点取ります";
		System.out.println(moji);

		//②
		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);

		//③
		Scanner stdIn = new Scanner(System.in);
		String mozi = stdIn.next();

		//④
		for (int a = 1; a <= 5; a++) {
			System.out.println(a + "回目のループです");
		}

		//⑤
		int b = stdIn.nextInt();
		if (b >= 50) {
			System.out.println("50以上です");
		} else {
			System.out.println("49以下です");
		}

		//⑥
		boolean isRaining = true;
		if (isRaining) {
			System.out.println("傘を持ってけーーー");
		} else {
			System.out.println("良い1日を！");
		}

		//⑦
		int[] numArr = { 10, 50, 30, 20, 40 };

		//⑧
		for (int c : numArr) {
			System.out.println(c);
		}

		//⑨
		int g = 0;
		for (int d = 0; d < numArr.length; d++) {
			int j = 0;
			int f = numArr[d];
			for (int e = numArr.length - 1; d < e; e--) {
				if (numArr[d] >= numArr[e]) {
					j++;
					numArr[d] = numArr[e];
					g = e;
				}
			}
			if (j != 0) {
				numArr[g] = f;
			}
		}
		for (int w : numArr) {
			System.out.println(w);
		}

		//⑩
		int x1 = stdIn.nextInt();
		int[] variable = new int[x];

		//EX
		int[] numExArr = { 10, 50, 30, 20, 40 };
		int f = numExArr[0];
		for (int e = 0; e < numExArr.length - 1; e++) {
			numExArr[e] = numExArr[e + 1];
		}
		numExArr[numExArr.length - 1] = f;
		for (int i : numExArr) {
			System.out.println(i);
		}
	}
}