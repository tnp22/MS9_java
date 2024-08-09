package _1000;

import java.util.Scanner;

public class _1355 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
			int b=i;
			for (int j = 0; j < a; j++) {
				if(b>0) {
					System.out.print(" ");
					b--;
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
