package _java_project;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int odd = 0;
		int even = 0;
		for (int i = 1; i < a + 1; i += 2) {
			if (i == a - 1||i == a) {
				odd += i;
				System.out.print(i);
			}
			else if (i % 2 != 0) {
				odd += i;
				System.out.print(i + "+");
			}

		}
		System.out.println("=" + odd);
		for (int i = 2; i < a + 1; i += 2) {
			if (i == a - 1||i == a) {
				even += i;
				System.out.print(i);
			}
			else if (i % 2 == 0) {
				even += i;
				System.out.print(i + "+");
			} 
		}
		System.out.println("=" + even);
		
		for (int i = 1; i < a+1; i++) {
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}
}
