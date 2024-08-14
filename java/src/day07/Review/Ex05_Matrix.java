package day07.Review;

import java.util.Scanner;

public class Ex05_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M=sc.nextInt();
		System.out.print("N : ");
		int N=sc.nextInt();
		
		int arr[][]=new int[M][N];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
