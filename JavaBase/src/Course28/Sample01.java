package Course28;

public class Sample01 {

	public static void main(String[] args) {
		//インスタンス
		// 「hu1」はhumanのインスタンス（実態）
		// インスタンスに対してパラメータを設定する
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";
		hu1.hp = 50;
		hu1.neru();
		System.out.println(hu1.name);

		//Chrクラスのインスタンス「numata」を作成
		//attack def spd love mp hpに好きなパラメータを設定してみよう
		Chr numata = new Chr();
		numata.attack = 125;
		numata.def = 100;
		numata.spd = 100;
		numata.love = 0;
		numata.mp = 75;
		numata.hp = 100;

		//Chrクラスのインスタンス「kajima」を生成
		//パラメータを設定してみよう
		Chr kajima = new Chr();
		kajima.attack = 400;
		kajima.def = 125;
		kajima.spd = 225;
		kajima.love = 0;
		kajima.mp = 0;
		kajima.hp = 250;

		kajima.naguru(kajima.attack, numata.def);
	}
}