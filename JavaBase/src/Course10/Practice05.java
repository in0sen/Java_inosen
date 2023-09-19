package Course10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x =stdIn.nextInt();
		int y =stdIn.nextInt();
		if(x==y) {
			System.out.println("同じー");
		}
		if(x>y) {
			System.out.println("xがでかい！");
		}else {
			System.out.println("yがでかい！");
		}

	}

}
