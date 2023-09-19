package Course41;

public class UseClass {

	public static void main(String[] args) {
		//⑮
		Product pro1 = new Product();
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;
		pro1.display();

		//⑯
		Food food = new Food();
		food.name = "白米";
		food.price = 100;

		//⑰
		Food[] menu = new Food[4];
		Food f1 = new Food();
		f1.name = "魚";
		f1.price = 1000;
		
		Food o2 = new Food();
		o2.name = "野菜";
		o2.price = 500;
		
		Food o3 = new Food();
		o3.name = "肉";
		o3.price = 3000;
		
		Food d4 = new Food();
		d4.name = "果物";
		d4.price = 2500;
		
		menu[0] = f1;
		menu[1] = o2;
		menu[2] = o3;
		menu[3] = d4;
		for (Food a : menu) {
			System.out.println(a.name);
		}

		//クラスEX
		int g = 0;
		for (int d = 0; d < menu.length; d++) {
			int j = 0;
			Food f = menu[d];
			for (int e = menu.length - 1; d < e; e--) {
				if (menu[d].price <= menu[e].price) {
					j++;
					menu[d] = menu[e];
					g = e;
				}
			}
			if (j != 0) {
				menu[g] = f;
			}
		}
		for (Food w : menu) {
			System.out.println(w.price);

		}
	}
}