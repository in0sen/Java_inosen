package Course13;

public class Practice08 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			while (i % 10 == i / 10 && i != 0) {
				System.out.println(i + "はゾロ目だよ");
				break;
			}
			System.out.println(i);
		}
	}

}
