package curriculum.c;

import java.util.Scanner;

public class Question6user {

	private Scanner sc = new Scanner(System.in);

	public int gethand() {
		System.out.print("グー(0),チョキ(1),パー(2)を入力");
		return sc.nextInt();
	}
}