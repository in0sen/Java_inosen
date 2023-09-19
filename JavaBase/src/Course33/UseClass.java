package Course33;

public class UseClass {

	public static void main(String[] args) {
		Kaden reizo = new Kaden();

		/*
		reizo.name"冷蔵庫";
		reizo.price=30000;
		*/
		//Kadenクラスでprivateを使っているからKadenクラスでしか設定できない

		reizo.setName("マウス");
		System.out.println(reizo.getName());

		reizo.setCategory("大型");
		System.out.println(reizo.getCategory());
	}
}