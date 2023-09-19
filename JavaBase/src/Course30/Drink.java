package Course30;

public class Drink {
	int price;
	String name;
	
	//コンストラクタ追加
	//コンストラクタはメインクラスでnewをしたときに自動的に発動する。
	Drink(int p,String n){
		price =p;
		name=n;
	}

	void display() {
		System.out.println(name+" "+price+"円");
	}

	int calcSum(int price, int ryou) {
		int kingaku = price * ryou;
		return kingaku;
		
	
	}

}