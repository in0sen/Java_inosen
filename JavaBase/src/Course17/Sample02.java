package Course17;

public class Sample02 {

	public static void main(String[] args) {
		int x = 8;
		//>>は右に２びっとずらす
		x = x >> 2;
		System.out.println(x);

		int y = 8;
		//<<は左に２ビットずらす
		y = y << 2;
		System.out.println(y);

		//ちなみに
		int z = 8;
		//こう書くと４ビットずらす
		z = z << 4;
		System.out.println(z);
	}
}