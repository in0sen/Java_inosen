package Course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		Player me = new Player();
		me.setGakuryoku(rand.nextInt(5) + 1);
		me.setKinryoku(rand.nextInt(5) + 1);
		me.setMitame(rand.nextInt(5) + 1);
		me.setOmosiro(rand.nextInt(5) + 1);
		Target koku = new Target();
		koku.setHituryouGaku(rand.nextInt(11) + 3);
		koku.setHituryouKin(rand.nextInt(11) + 3);
		koku.setHituryouMita(rand.nextInt(11) + 3);
		koku.setHituryouOmo(rand.nextInt(11) + 3);
		String menu;
		for (int training = 1; training <= 7; training++) {
			System.out.println("あなたの筋力は" + me.getKinryoku() + "\nあなたの学力は" + me.getGakuryoku() + "\nあなたの見た目は"
					+ me.getMitame() + "\nあなたの面白さは" + me.getOmosiro() + "\n");
			System.out.println(training + "回目のトレーニング\n1:筋トレ　2:勉強　3:整形　4:人と喋る");
			System.out.println("筋トレで筋肉が上昇、勉強で学力が上昇\n整形で見た目が上昇、人と喋るで面白さが上昇");
			menu = stdIn.next();
			switch (menu) {
			case "1":
				me.setKinryoku(1 + me.getKinryoku());
				break;
			case "2":
				me.setGakuryoku(1 + me.getGakuryoku());
				break;
			case "3":
				me.setMitame(1 + me.getMitame());
				break;
			case "4":
				me.setOmosiro(1 + me.getOmosiro());
				break;
			default:
				System.out.println("1～4を入力してね" + "\n");
				training--;
				continue;
			}
			int ran = rand.nextInt(4) + 1;
			if (ran == 1) {
				System.out.println("告白成功まで必要な学力は" + (koku.getHituryouGaku() - me.getGakuryoku()) + "\n");
			} else if (ran == 2) {
				System.out.println("告白成功まで必要な筋力は" + (koku.getHituryouKin() - me.getKinryoku()) + "\n");
			} else if (ran == 3) {
				System.out.println("告白成功まで必要な見た目は" + (koku.getHituryouMita() - me.getMitame()) + "\n");
			} else {
				System.out.println("告白成功まで必要な面白さは" + (koku.getHituryouOmo() - me.getOmosiro()) + "\n");
			}
		}
		String kokuhaku;
		for (int a = 0; a < 2; a++) {
			String[] b = { "1", "2", "3", "4" };
			if (a == 0) {
				System.out.println("どの能力で告白する？\n1:筋肉　2:学力　3:見た目　4:面白さ");
				kokuhaku = stdIn.next();
			} else {
				kokuhaku = b[rand.nextInt(4) + 1];
			}
			switch (kokuhaku) {
			case "1":
				if (me.getKinryoku() < koku.getHituryouKin()) {
					System.out.println("あなたは死亡した");
					a = 2;
				} else if (a == 1) {
					System.out.println("告白に成功した");
				}
				break;
			case "2":
				if (me.getGakuryoku() < koku.getHituryouGaku()) {
					System.out.println("あなたは死亡した");
					a = 2;
					break;
				} else if (a == 1) {
					System.out.println("告白に成功した");
				}
				break;
			case "3":
				if (me.getMitame() < koku.getHituryouMita()) {
					System.out.println("あなたは死亡した");
					a = 2;
					break;
				} else if (a == 1) {
					System.out.println("告白に成功した");
				}
				break;
			case "4":
				if (me.getOmosiro() < koku.getHituryouOmo()) {
					System.out.println("あなたは死亡した");
					a = 2;
					break;
				} else if (a == 1) {
					System.out.println("告白に成功した");
				}
				break;
			default:
				System.out.println("1～4を入力してね");
				a--;
				continue;
			}
		}
	}
}