package Course20;

public class Practice07 {

	public static void main(String[] args) {

		String arr[] = { "y", "x", "x", "y", "x", "x", "x", "y" };
		int b = 0;
		int count = 0;
		for (String a : arr) {

			if (a.equals("x")) {
				count++;
				System.out.println("xが" + count + "回連続で続いています");

			} else {
				count = 0;
				if (b > 0) {
					System.out.println("x以外があるのでカウントが０になりました");
				}
			}
			b++;
		}
	}
}