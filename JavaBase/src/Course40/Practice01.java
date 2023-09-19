package Course40;

public class Practice01 {

	public static void main(String[] args) {
		int number = 15;
		if (number > 10) {
			System.out.println("でか！！！");
		}

		int age = 20;
		if (age >= 18) {
			System.out.println("大人っすね！");
		} else {
			System.out.println("キッズだね＾＾");
		}

		int score = 85;
		if (score >= 90) {
			System.out.println("Excellent");
		} else {
			if (score >= 80) {
				System.out.println("Good");
			} else {
				System.out.println("勉強しましょう");
			}
		}

		boolean isRaining = true;
		if (isRaining) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("良い１日を！");
		}

		int num = 123;
		if (num % 2 == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数でっせ");
		}

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		for (int b = 1; b <= 100; b++) {
			if (b % 2 == 0) {
				System.out.print("現在" + b + "回目もループです。");
				System.out.println("偶数です");
			}
		}

		for (int c = 10; c >= 1; c--) {
			System.out.println(c);
		}

		int sum = 0;
		for (int d = 1; d <= 100; d++) {
			sum += d;
		}
		System.out.println(sum);

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int e : numbers) {
			System.out.println(e);
		}

		String[] cities = { "東京", "大阪", "千葉", "神奈川", "埼玉笑" };
		for (String f : cities) {
			System.out.println(f);
		}

		int numsum = 0;
		for (int g : numbers) {
			numsum += g;
		}
		System.out.println(numsum);

		int max = 0;
		for (int h :numbers) {
			if (max <=h) {
				max = h;
			}
		}
		System.out.println(max);

		int[] numbers1 = { 11, 20, 31, 40, 51 };
		for (int i : numbers1) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}