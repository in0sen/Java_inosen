package Course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Character me = new Character();
		me.name = "猪琉希";
		me.hp = 100;
		me.str = 150;
		me.def = 75;
		me.dex = 75;
		me.agi = 100;
		me.viewStatus();

		Character tonari = new Character();
		tonari.name = "藤倉一樹";
		tonari.hp = 125;
		tonari.str = 75;
		tonari.def = 125;
		tonari.dex = 85;
		tonari.agi = 90;
		tonari.viewStatus();

		int goukei = 1000;
		Character watabe = new Character();
		watabe.name = "渡部先生";
		System.out.println(watabe.name + "のステータス入力\nステータスポイント" + goukei);

		System.out.println("体力を入力してね");
		watabe.hp = sc.nextInt();
		while (goukei < watabe.hp) {
			System.out.println("ステータスポイント超えないでね");
			watabe.hp = sc.nextInt();
		}
		goukei -= watabe.hp;

		System.out.println("残りのステータスポイント" + goukei);
		System.out.println("攻撃力を入力してね");
		watabe.str = sc.nextInt();
		while (goukei < watabe.str) {
			System.out.println("ステータスポイント超えないでね");
			watabe.str = sc.nextInt();
		}
		goukei -= watabe.str;

		System.out.println("残りのステータスポイント" + goukei);
		System.out.println("防御力を入力してね");
		watabe.def = sc.nextInt();
		while (goukei < watabe.def) {
			System.out.println("ステータスポイント超えないでね");
			watabe.def = sc.nextInt();
		}
		goukei -= watabe.def;

		System.out.println("残りのステータスポイント" + goukei);
		System.out.println("回避率を入力してね");
		watabe.dex = sc.nextInt();
		while (goukei < watabe.dex) {
			System.out.println("ステータスポイント超えないでね");
			watabe.dex = sc.nextInt();
		}
		goukei -= watabe.dex;

		System.out.println("残りのステータスポイント" + goukei);
		System.out.println("命中率を入力してね");
		watabe.agi = sc.nextInt();
		while (goukei < watabe.agi) {
			System.out.println("ステータスポイント超えないでね");
			watabe.agi = sc.nextInt();
		}
		goukei -= watabe.agi;
		watabe.viewStatus();
		me.battle(watabe, tonari);
	}
}