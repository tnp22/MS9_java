package day02;

import java.util.Scanner;

public class Ex07_Boolean {
	public static void main(String[] args) {
		// 논리
		boolean check1 = false;
		boolean check2 = true;
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("true or false : ");
			boolean on = sc.nextBoolean();

			if (on) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}	
		}
	}
}
