package _1000;

import java.util.Scanner;

public class _1501 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		int c=1;
		int a[][]=new int[b][b];
		for (int i = 0; i< a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=c++;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
	
	
}
