package day07.Review;

import java.util.Scanner;

public class Ex03_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = 50000, temp;

		System.out.print("구매비 : ");
		int Bee = sc.nextInt();
		boolean mode = true;
		while (one > 0) {
			temp = Bee / one;
			Bee = Bee % one;
			System.out.println(one + " : " + temp);
			if (mode) {
				one/=5;
			} else {
				one/=2;
			}
			mode=!mode;
		}

		System.out.println();

		sc.close();
	}
}
