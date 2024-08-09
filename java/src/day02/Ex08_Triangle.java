package day02;

import java.util.Scanner;

public class Ex08_Triangle {
	public static void main(String[] args) {

		double h = 0;
		double v = 0;
		double result;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("높이: ");
		h = sc.nextDouble();
		
		System.out.print("밑변: ");
		v = sc.nextDouble();
		
		result = (h * v) / 2;
		System.out.println("답: " + result);
		sc.close();
	}
}
