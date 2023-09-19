package Course08;

import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String tuki = stdIn.next();

		switch (tuki) {
		case "１月":
			System.out.println("３１日");
			break;

		case "２月":
			System.out.println("２８日");
			break;

		case "３月":
			System.out.println("３１日");
			break;

		case "４月":
			System.out.println("３０日");
			break;

		case "５月":
			System.out.println("３１日");
			break;

		case "６月":
			System.out.println("３０日");
			break;

		case "７月":
			System.out.println("３１日");
			break;

		case "８月":
			System.out.println("３１日");
			break;

		case "９月":
			System.out.println("３０日");
			break;

		case "１０月":
			System.out.println("３１日");
			break;

		case "１１月":
			System.out.println("３０日");
			break;

		case "１２月":
			System.out.println("３１日");
			break;
		}

	}

}