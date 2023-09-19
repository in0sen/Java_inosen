package Course35;

public class Sample01 {

	public static void main(String[] args) {
		calc();

		calc(50, 100);

		calc("a");

		calc(50);
	}

	static void calc() {
		System.out.println("計算したいときは、引数を二つ渡してね");
	}

	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));
	}

	static void calc(String a) {
		System.out.println("渡された文字は" + a + "です");
	}

	static void calc(int a) {
		System.out.println("受け取った値は" + a + "です");
	}

}