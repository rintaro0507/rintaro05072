package Question4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		int[] numbers2 = { 10, 20, 30, 40, 50 };
		for (int i2 = numbers2.length - 1; i2 >= 0; i2--) {
			System.out.println(numbers2[i2]);
		}

		int[] numbers3 = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int i3 = 0; i3 < numbers3.length; i3++) {
			sum += numbers3[i3];
		}
		System.out.println(sum);

		int[] numbers4 = { 12, 7, 9, 21, 5, 18 };
		int max = numbers4[0];
		int min = numbers4[0];
		for (int i4 = 1; i4 < numbers4.length; i4++) {
			if (numbers4[i4] > max) {
				max = numbers4[i4];
			}
			if (numbers4[i4] < min) {
				min = numbers4[i4];
			}
		}
		System.out.println(max);
		System.out.println(min);

		int[] num = { 1, 2, 3, 4, 5, };
		for (int i5 = 0; i5 < num.length; i5++) {
			num[i5] *= 2;
		}
		for (int v : num) {
			System.out.println(v);
		}

		int[] num2 = { 4, 7, 10, 15, 20 };
		Scanner sc = new Scanner(System.in);
		System.out.print("数値を入力：");
		int inputValue = Integer.parseInt(sc.nextLine());
		boolean found = false;
		for (int v2 : num2) {
			if (v2 == inputValue) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(inputValue + "は配列に含まれています");
		} else {
			System.out.println(inputValue + "は配列に含まれていません");
		}
		sc.close();

		int[][] num3 = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		for (int i6 = 0; i6 < num3.length; i6++) {
			for (int i7 = 0; i7 < num3[i6].length; i7++) {
				System.out.print(num3[i6][i7] + "");
			}
			System.out.println();
		}

		int[][] num4 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		int sum2 = 0;
		for (int a = 0; a < num4.length; a++) {
			for (int b = 0; b < num4[a].length; b++) {
				sum2 += num4[a][b];

			}
		}
		System.out.println(sum2);

		int[][] num5 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};
		int max2 = num5[0][0];
		int min2 = num5[0][0];
		for (int q = 0; q < num5.length; q++) {
			for (int w = 0; w < num5[q].length; w++) {
				if (num5[q][w] > max2) {
					max2 = num5[q][w];
				}
				if (num5[q][w] < min2) {
					min2 = num5[q][w];
				}
			}
		}
		System.out.println(max2);
		System.out.println(min2);

		int[][][] num6 = { {
				{ 1, 2 }, { 3, 4 } },
				{ { 5, 6 },
						{ 7, 8 } }
		};
		for (int r = 0; r < num6.length; r++) {
			for (int t = 0; t < num6[r].length; t++) {
				for (int y = 0; y < num6[r][t].length; y++) {
					System.out.println(num6[r][t][y]);
				}
			}
		}

	}

}