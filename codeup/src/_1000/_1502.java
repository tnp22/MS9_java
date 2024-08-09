package _1000;

import java.util.Scanner;

public class _1502 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		
		int a[][]=new int[b][b];
		for (int i = 0; i< a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=i+1+b*j;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
