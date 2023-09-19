package Course24;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		keisan();
	}

	static void keisan() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println(stdIn.nextInt() + stdIn.nextInt());
	}
}