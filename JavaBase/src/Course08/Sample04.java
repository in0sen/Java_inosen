package Course08;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String like = stdIn.next();

		//switch鉄板構文
		switch (like) {
		case "魚":
			System.out.println("魚が好きです。");
			//以降の判定を全スキップ
			break;
		case "肉":
			System.out.println("肉が好きです。");
			break;
		//どれにも該当しない

		default:
			System.out.println("野菜が好きです。");
		}

	}

}
