package day04;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int Min;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (Min > arr[i]) {
				Min = arr[i];
			}
		}
		System.out.println("Min : " + Min);
		sc.close();
	}

}
