package _1000;

import java.util.Scanner;

public class _1253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			int temp=b;
			b=a;
			a=temp;
		}
		for (int i = a; i < b+1; i++) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
