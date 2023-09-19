package Course13;

public class Practice04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i);
			if (i == 3) {
				System.out.println("３週目");
			}
			if (i == 6) {
				System.out.println("あと４週");
			}
			if (i == 10) {
				System.out.println("最後のループ");
			}
		}
	}

}