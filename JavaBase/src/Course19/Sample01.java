package Course19;

public class Sample01 {

	public static void main(String[] args) {

		String tuuki = "猪";
		String reiya = "鈴木";
		String kousei = "伊東";
		String kouki = "掛川";
		String sora = "伊藤";
		String taito = "安田";
		String kouhei = "坂本";
		String rikuto = "藤平";

		//配列の鉄板構文
		//[]のことを要素と呼ぶ。要素は０から始まる！。
		String[] nameList = new String[3];
		nameList[0] = "やすだ";
		nameList[1] = "ねもと";
		nameList[2] = "ながわな";

		for (int i = 0; i < 4; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
		}
	}
}
