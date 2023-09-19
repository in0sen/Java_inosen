package Course17;

public class Sample01 {

	public static void main(String[] args) {

		char c1 = 50;
		char c2 = 'A';
		char c3 = '字';

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		//↓実践//
		int num = 50;
		char moji = 50;

		System.out.println("intだったら50は" + num);
		System.out.println("charだったら50は" + moji);

		//↓数値を扱う型//
		byte byteNum = 127;

		short shortNum = 32767;

		int intNum = 2147483647;
		
		//Lをつける
		long longNum = 9223372036854775807L;
		//sysoutで出すな

		System.out.println(byteNum);
		System.out.println(shortNum);
		System.out.println(intNum);
		//しまえる範囲を超えるとエラーになる！

		//ちなみに、マイナスの値はマイナスをつけて変数にしまえば０
		shortNum = -32768;
		System.out.println(shortNum);
	}

}