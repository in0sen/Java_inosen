package Course06;

public class Sample02 {

	public static void main(String[] args) {
		String a = "あいうえお";
		String b = "かきくけこ";

		if (a.equals(b)) {
			System.out.println("文字は一緒です。");
		} else {
			System.out.println("違う文字です！");
		}

		if (a.equals("さしすせそ")) {
			System.out.println("文字は一緒です");
		} else {
			System.out.println("違うよ！");
		}

	}

}
