package Course12;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("縦の数値");
		int tate = stdIn.nextInt();
		System.out.println("横の数値");
		int yoko = stdIn.nextInt();
		int retu = 1;
		int gyou = 1;
		while (gyou <= tate) {
			while (retu < yoko * gyou) {
				System.out.print(retu + ",");
				retu = retu + gyou;
			}
			System.out.println(retu);
			gyou++;
			retu = gyou;
		}
	}
}