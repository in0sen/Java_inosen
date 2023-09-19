package Poketon;

import java.util.Random;

public class Trainer {
	static int hiki = 0;
	String name;
	Pocketon[] myPockes;

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	void capture(Pocketon pocke) {
		Random ra = new Random();
		int ran = ra.nextInt(10) + 1;

		if (pocke.difficult > ran || pocke.getted > 6) {
			System.out.println(pocke.name + "は逃げてしまった");

		} else {
			Pocketon pocke1 = new Pocketon(pocke.name, pocke.type, pocke.power, pocke.difficult);
			myPockes[hiki] = pocke1;
			pocke.getted++;
			myPockes[hiki].getted = pocke.getted;
			hiki++;
		}
	}

	void display() {
		for (int a = 0; a < hiki; a++) {
			System.out.println(myPockes[a].name);
			System.out.println();
		}
	}
}
