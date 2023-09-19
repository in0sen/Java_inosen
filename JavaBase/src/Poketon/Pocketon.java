package Poketon;

public class Pocketon {
	String name;
	String type;
	int power;
	int difficult;
	int getted;

	Pocketon(String n, String t, int p, int d) {
		name = n;
		type = t;
		power = p;
		difficult = d;
		getted = 0;
	}

	void display() {
		System.out.println("なまえは　　" + name);
		System.out.println("タイプは　　" + type);
		System.out.println("戦闘力は　　" + power);
		System.out.println("捕獲難易度　" + difficult);
		System.out.println("手持ちは　　" + getted);
	}

}
