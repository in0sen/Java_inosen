package Course20;

public class Practice03 {

	public static void main(String[] args) {
		int c = 0;
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int b = 0; b < arr.length; b++) {
			c = c + arr[b];
			if (b + 1 < arr.length) {
				System.out.println("途中" + c);
			}
		}
		System.out.println("最終合計" + c);
		System.out.println("平均" + c / arr.length);
	}
}