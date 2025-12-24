package Question3;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int a = 1; a <= 20; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}

		for (int s = 10; s >= 1; s--) {
			System.out.println(s);
		}

		int sum = 0;
		for (int z = 1; z <= 100; z++) {
			sum += z;
		}
		System.out.println(sum);

		for (int x = 1; x <= 5; x++) {
			for (int c = 1; c <= x; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		int w = 2;
		while (w <= 20) {
			System.out.println(w);
			w += 2;
		}

		int e = 10;
		while (e >= 1) {
			System.out.println(e);
			e--;
		}

		int t = 1;
		int isum = 0;
		while (t <= 100) {
			isum += t;
			t++;
		}
		System.out.println(isum);

		Scanner sc = new Scanner(System.in);
		int num = 1;
		while (num != 0) {
			System.out.print("数値：");
			num = sc.nextInt();
		}
		System.out.println("終了しました");

		for (int k = 1; k <= 9; k++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d×%d=%2d", k, j, k * j);
			}
			System.out.println();
		}

		Random rand = new Random();
		String str = "パソコン、冷蔵庫、洗濯機、ゲーム機、テレビ、ディスプレイ、その他商品";
		System.out.println(str);
		String[] items = str.split("、");
		int tv = rand.nextInt(12);
		int ds = 11 - tv;

		for (String item : items) {
			switch (item) {
			case "テレビ":
			case "ディスプレイ":
				int stock = item.equals("テレビ") ? tv : ds;
				System.out.println(item + "残りの台数は" + stock + "台です");
				break;

			case "パソコン":
			case "冷蔵庫":
			case "洗濯機":
			case "ゲーム機":
				System.out.println(item + "の残りの台数は" + rand.nextInt(12) + "台です");
				break;

			default:
				System.out.println(item + "は指定の商品ではありません");
			}
		}
		sc.close();

	}
}
