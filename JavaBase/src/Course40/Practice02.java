package Course40;

public class Practice02 {

	public static void main(String[] args) {
		printHello();

		multiply(10, 20);

		int modori1 = multiplymodori(20, 30);
		System.out.println(modori1);

		boolean modori2 = isEven(26);
		System.out.println(modori2);

		String name = getGreeting("藤倉一樹");
		System.out.println(name);
	}

	static void printHello() {
		System.out.println("Hello,Wold!");
	}

	static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	static int multiplymodori(int a, int b) {
		return a * b;
	}

	static boolean isEven(int number) {
		boolean tf;
		if (number % 2 == 0) {
			tf = true;
		} else {
			tf = false;
		}
		return tf;
	}

	static String getGreeting(String nume) {
		nume = "こんにちは、" + nume;
		return nume;
	}
}