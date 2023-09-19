package Course10;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int a = stdIn.nextInt();
		int b = a % 2;
		if(b==0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}

	}

}
