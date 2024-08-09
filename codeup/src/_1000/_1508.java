package _1000;

import java.util.Scanner;

public class _1508 {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int b=sc.nextInt();
			int a[][]=new int[b][];
			for (int i = 0; i < b; i++) {
				a[i]=new int[i+1];
			}
			for (int i = 0; i < a.length; i++) {
				a[i][0]=sc.nextInt();
			}
			for (int i = 1; i < a.length; i++) {
				for (int j = 1; j < a[i].length; j++) {
					a[i][j]=a[i][j-1]-a[i-1][j-1];
				}
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}
			sc.close();
		}
	}
