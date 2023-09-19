package Course11;

public class Practice07 {

	public static void main(String[] args) {
		int retu = 1;
		int ryou1 = 1;
		int ryou2 = 1;
		int kazu = 1;
		String d = "*";

		while (retu <= 7) {

			if (retu > 4) {
				kazu = 8 - retu;

				if (ryou2 == kazu) {

					System.out.println(d);
					retu++;
					ryou2 = 1;

				} else {

					System.out.print(d);
					ryou2++;

				}

			} else {

				if (ryou1 == kazu) {
					System.out.println(d);
					kazu = kazu + retu;
					retu++;

				} else {

					System.out.print(d);
					ryou1++;

				}

			}

		}

	}

}