package curriculum.c;

public class Main {

	public static void main(String[] args) {
		Question6user player = new Question6user();
		Enemy enemy = new Enemy();

		while (true) {
			int playhand = player.gethand();
			int enemyhand = enemy.gethand();

			System.out.println("あなたの手" + hdtoSt(playhand));
			System.out.println("CPUの手" + hdtoSt(enemyhand));

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

	}

	private static String hdtoSt(int hand) {
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
