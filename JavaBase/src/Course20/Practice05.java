package Course20;

public class Practice05 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		int mainasu = 0;
		int a = 0;
		for (int c : arr) {
			if (a == 0 || a == 4) {
				sum = sum + c;
			}
			a++;
			if (a == 3) {
				mainasu = mainasu + c;
			}
			if (a == 1) {
				mainasu = mainasu - c;
			}
		}
		System.out.println(sum);
		System.out.println(mainasu);
	}
}