package Course11;

public class Practice06 {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 100) {
			System.out.println(i);
			if (i % 10 == 0 && i != 0) {
				System.out.println("10の倍数");
			}
			i++;
		}

	}

}
