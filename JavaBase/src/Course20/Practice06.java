package Course20;

public class Practice06 {

	public static void main(String[] args) {
		String[] a = { "x", "y", "x", "y", "x" };
		int count = 0;
		for (String moji : a) {
			if (moji.equals("x")) {
				count++;
			}
		}
		System.out.println(count);
	}
}