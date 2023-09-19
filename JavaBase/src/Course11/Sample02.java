package Course11;

public class Sample02 {

	public static void main(String[] args) {
		//while文の鉄板構文
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			if(i == 5) {
				break;
				
			}
			i++;
		}
		System.out.println("抜けたよ");

	}

}
