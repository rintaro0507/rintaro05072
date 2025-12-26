package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です！");
		}

		int age = 25;
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");

		}
		int iage = 18;
		if (iage >= 20) {
			System.out.println("成人です");
		} else if (iage >= 13 && iage <= 19) {
			System.out.println("ティーンエイジャーです");
		} else if (12 >= iage) {
			System.out.println("子供です");
		}

		int x = 30;
		int y = 15;
		int z = 50;
		int max = Math.max(x, Math.max(y, z));
		System.out.println(max);

		
		Scanner sc = new Scanner(System.in);

        System.out.println("数値を入力：");
        String input = sc.nextLine();          // nextLineで入力
        int num = Integer.parseInt(input);     // int型に変換

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0です");
        } else {
            System.out.println("負の数です");
        }


        System.out.println("数値を入力：");
        String finput = sc.nextLine();          // nextLineで入力
        int value = Integer.parseInt(finput);   // intに変換

        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

		System.out.print("0〜100の点数を入力してください：");
        String iinput = sc.nextLine();          // nextLineで入力
        int iscore = Integer.parseInt(iinput);   // int型に変換

        if (iscore >= 90) {
            System.out.println("優");
        } else if (iscore >= 70) {
            System.out.println("良");
        } else if (iscore >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

		String uinput;
		System.out.println("文字を打たないで:");
		uinput = sc.nextLine();
		if (uinput == null) {
			System.out.println("入力が無効です");
		} else if (uinput.isEmpty()) {
			System.out.println("入力が無効です");
		}

		int day;
		System.out.println("1～7のいずれかを入力");
		day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");
		}

		int month;
		System.out.println("1～12のいずれかを入力");
		month = sc.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("無効な入力です");
		}
	}
}
