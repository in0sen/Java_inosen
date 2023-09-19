package Course47;

public class Practice01 {

	public static void main(String[] args) {
		//1
		int[] array = { 1, 2, 3 };
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}

		} catch (IndexOutOfBoundsException e) {
			//配列の範囲外によるエラー
			System.out.println(e);
		}

		//2
		int number = 0;
		try {
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}
		} catch (ArithmeticException e) {
			//0の割り算によるエラー
			System.out.println(e);
		}

		//3
		//0の割り算によるエラー
		int number2 = 0;
		try {
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		//4
		//0の割り算によるエラー
		try {
			int result = divideNumbers(10, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	///////これはmainメソッドの外に書いて////////
	public static int divideNumbers(int a, int b) {
		return a / b;
	}
}