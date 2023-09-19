package Course22;

import java.util.Arrays;

public class Practice01 {

	public static void main(String[] args) {
		//1
		String ox[][] = new String[3][3];
		ox[0][0] = "o";
		ox[0][1] = "x";
		ox[0][2] = "o";

		ox[1][0] = "x";
		ox[1][1] = "o";
		ox[1][2] = "x";

		ox[2][0] = "o";
		ox[2][1] = "o";
		ox[2][2] = "o";

		System.out.println(ox[1][2]);

		//2

		System.out.println(Arrays.deepToString(ox));

		//3
		int count = 0;
		for (int a = 0; a < ox.length; a++) {
			for (int b = 0; b < ox.length; b++) {
				if (ox[a][b].equals("o")) {
					count++;
				}
				System.out.println(ox[a][b]);
			}
		}
		System.out.println("oの数は" + count);
	}
}