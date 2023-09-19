package Jitakuyou;

import java.util.Random;

public class renshuu {

	public static void main(String[] args) {
		Random ra = new Random();
		String[] moji = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		while (true) {
			String mojiretu = "";
			int suu = ra.nextInt(450) + 50;
			for (int a = 1; a <= suu; a++) {
				int r = ra.nextInt(51) + 0;
				mojiretu += moji[r];
			}
			System.out.println(mojiretu);
		}
	}
}