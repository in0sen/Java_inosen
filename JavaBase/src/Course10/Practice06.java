package Course10;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を二つ入力して下しさい");
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		if(x>y) {
			System.out.println("xがでかい！なぜならxは"+x+"でyは"+y+"だから");
		}
		if(x<y) {
			System.out.println("yがでかい！なぜならyは"+y+"でxは"+x+"だから");
		}

	}

}
