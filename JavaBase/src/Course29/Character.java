package Course29;

public class Character {
	String name;
	int hp;
	int def;
	int str;
	int dex;
	int agi;

	void viewStatus() {
		System.out.println(name + "のステータス");
		System.out.println("HP:" + hp);
		System.out.println("攻撃力:" + str);
		System.out.println("防御力:" + def);
		System.out.println("命中率:" + dex);
		System.out.println("回避率:" + agi + "\n");
	}

	void battle(Character player1, Character player2) {
		System.out.println(player1.name + "と" + player2.name + "の熱い戦いが始まる・・・！");

		while (player1.hp > 0 & player2.hp > 0) {

			if (player1.agi < player2.agi) {

				System.out.println(player2.name + "の攻撃");
				int damage = player2.str - player1.def;
				if(damage<=0) {
					damage=1;
				}
				player1.hp = player1.hp - damage;
				System.out.println(player1.name + "の体力" + player1.hp);
				System.out.println();

				if (player1.hp > 0) {
					System.out.println(player1.name + "の攻撃");
					damage = player1.str - player2.def;
					if(damage<=0) {
						damage=1;
					}
					player2.hp = player2.hp - damage;
					System.out.println(player2.name + "の体力" + player2.hp);
					System.out.println();
				}
			} else {

				System.out.println(player1.name + "の攻撃");
				int damage = player1.str - player2.def;
				if(damage<=0) {
					damage=1;
				}
				player2.hp = player2.hp - damage;
				System.out.println(player2.name + "の体力" + player2.hp);
				System.out.println();

				if (player2.hp > 0) {
					System.out.println(player2.name + "の攻撃");
					damage = player2.str - player1.def;
					if(damage<=0) {
						damage=1;
					}
					player1.hp = player1.hp - damage;
					System.out.println(player1.name + "の体力" + player1.hp);
					System.out.println();
				}
			}

		}
		if (player1.hp <= 0) {
			System.out.println(player1.name + "は死亡した");
		} else {
			System.out.println(player2.name + "は死亡した");
		}
	}

}