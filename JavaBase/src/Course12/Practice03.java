package Course12;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("横の数値");
		int yoko = stdIn.nextInt();
		System.out.println("縦の数値");
		int tate = stdIn.nextInt();
		int retu = 1;
		int suuti = 1;
		int gyou = 1;
		while (retu <= tate) {
			if (suuti <= retu * yoko) {
				System.out.print(gyou + ",");
				suuti++;
				gyou = gyou + retu;
			} else {
				System.out.println();
				retu++;
				gyou = retu;
			}
		}
	}
}