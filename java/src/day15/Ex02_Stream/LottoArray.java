package day15.Ex02_Stream;

import java.util.Scanner;

public class LottoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + "게임] : ");
			int lotto[] = new int[6];

			// 랜덤 수 6개를 대입
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int) (Math.random() * 45 + 1);
				lotto[j] = rand;

				for (int k = 0; k < j; k++) {
					if (rand == lotto[k]) {
						j--;
						break;
					}
				}
			}
			for (int j = 0; j < lotto.length; j++) {
				for (int j2 = j + 1; j2 < lotto.length; j2++) {
					if (lotto[j] > lotto[j2]) {
						int temp = lotto[j];
						lotto[j] = lotto[j2];
						lotto[j2] = temp;
					}
				}
			}

			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}
}
