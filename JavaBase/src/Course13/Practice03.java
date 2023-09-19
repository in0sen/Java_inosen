package Course13;

public class Practice03 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int y = i % 2;
			if (y == 0 && i != 0) {
				System.out.println(i + "は偶数です。");
			}
		}
	}

}