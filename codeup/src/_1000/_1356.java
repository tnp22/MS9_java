package _1000;

import java.util.Scanner;

public class _1356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
			if(i==0 || i==a-1) {
				for (int j = 0; j < a; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 0; j < a; j++) {
					if(j==0||j==a-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
