package Course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		System.out.println("数値入力");
		Scanner stdIn = new Scanner(System.in);
		int[] myNumScan = new int[3];
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];

		for (int a = 0; a < 3; a++) {
			System.out.println(myNumScan[a]);
		}
	}
}