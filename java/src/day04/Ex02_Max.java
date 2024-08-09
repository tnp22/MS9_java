package day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int Max;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (Max < arr[i]) {
				Max = arr[i];
			}
		}
		System.out.println("Max : " + Max);
		sc.close();
	}

}
