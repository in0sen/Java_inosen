package Course10;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("曜日を入力してね");
		String a = stdIn.next();
		System.out.println("午前　午後　夜間　どれかを入力してね");
		String b = stdIn.next();
		switch(a+b) {
		case"日曜日午前":
		case"日曜日午後":
		case"日曜日夜間":
		case"火曜日午前":
		case"水曜日夜間":
		case"金曜日午前":
		case"土曜日午後":
		case"土曜日夜間":
			System.out.println("予約できません");
			break;
		case"月曜日午前":
		case"月曜日午後":
		case"月曜日夜間":
		case"火曜日午後":
		case"火曜日夜間":
		case"水曜日午前":
		case"水曜日午後":
		case"木曜日午前":
		case"木曜日午後":
		case"木曜日夜間":
		case"金曜日午後":
		case"金曜日夜間":
		case"土曜日午前":
			System.out.println("予約できます");
			break;
			default:
				System.out.println("曜日は「〇曜日」となるように！！時間帯は「午前　午後　夜間」どれかを入力してね");
			
		}
			
		

	}

}
