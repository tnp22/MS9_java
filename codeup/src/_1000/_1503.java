package _1000;

import java.util.Scanner;

public class _1503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		int aa=1;
		int a[][]=new int[b][b];
		
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j]=aa++;
				}
			}
			else {
				for (int j = a[i].length-1; j >-1; j--) {
					a[i][j]=aa++;
				}
			}
			
		}
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
