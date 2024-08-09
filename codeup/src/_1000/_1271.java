package _1000;

import java.util.Scanner;

public class _1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int result=-1000000000;
		for (int i = 0; i < a; i++) {
			int b=sc.nextInt();
			if(result<b) {
				result=b;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
