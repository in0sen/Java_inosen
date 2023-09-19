package Course10;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("曜日を入力してね");
		String a = stdIn.next();
		
		switch(a) {
		case"月曜日":
		case"水曜日":
		case"木曜日":
		case"土曜日":
			System.out.println("予約できます");
			break;
		case"日曜日":
		case"火曜日":
		case"金曜日":
			System.out.println("予約できません");
			default:
				System.out.println("「〇曜日」と入力してね");
		}

	}

}
