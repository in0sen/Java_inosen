package Course30;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Drink drink =new Drink(100,"初期データ");
		drink.display();
		

		drink.price = 150;
		drink.name = "午後の紅茶";
		drink.display();

		System.out.println("数量入力");
		int kingaku = drink.calcSum(drink.price, sc.nextInt());
		System.out.println("金額は" + kingaku + "円");
		
	}
}