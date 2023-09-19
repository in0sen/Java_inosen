package Course33;

import java.util.Scanner;

public class UseClass00 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Food food = new Food(/*Foodクラスで引数を受け取らないから何も入れない*/);
		food.display();

		food.name = s.next();
		food.price = s.nextInt();
		food.display();
	}

}