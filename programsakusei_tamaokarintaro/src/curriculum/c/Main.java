package curriculum.c;

public class Main {

	public static void main(String[] args) {
		Question6user player = new Question6user();
		Enemy enemy = new Enemy();

		while (true) {
			int playhand = player.getHand();
			int enemyhand = enemy.getHand();

			System.out.println("あなたの手" + handToString(playhand));
			System.out.println("CPUの手" + handToString(enemyhand));

			if ((playhand == 0 && enemyhand == 1) ||
					(playhand == 1 && enemyhand == 2) ||
					(playhand == 2 && enemyhand == 0)) {
				System.out.println("あなたの勝ち！");
				break;
			}

			if (playhand == enemyhand) {
				System.out.println("あいこで！");
			} else {
				System.out.println("負けー！");
			}
			System.out.println();

		}
		player.close();

	}

	private static String handToString(int hand) {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "該当なし";

		}
	}

}
