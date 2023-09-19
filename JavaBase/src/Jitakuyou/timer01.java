package Jitakuyou;

import java.util.Scanner;

public class timer01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//並行処理
		Thread countdownThread = new Thread(new Runnable() {
			@Override
			public void run() {

				for (int i = 10; i > 0; i--) {

					System.out.print(i + " ");
					//try は catch とセットで使う
					try {

						//（）内の数値を1000で割った時間止まる
						//sleepは「Thread」と「try」の中じゃないと使えない
						Thread.sleep(1000);

						//catch は try とセットで使う
					} catch (Exception e) {

						System.out.println("Error:" + e);
					}

				}
				//[\n]で改行をする
				System.out.println("\nFinished!!!");
			}
		});
		countdownThread.start();
	}

}
