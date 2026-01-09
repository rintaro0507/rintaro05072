package curriculum.c;

import java.util.Scanner;

public class Question6user {

	private Scanner sc = new Scanner(System.in);

	public int getHand() {
		int hand;
		while (true) {
			System.out.print("グー(0),チョキ(1),パー(2)を入力");

			hand = sc.nextInt();

			if (hand >= 0 && hand <= 2) {
				return hand;
			}
			System.out.println("0～2を入力してください");
		}
	}

	public void close() {
		sc.close();
	}

}