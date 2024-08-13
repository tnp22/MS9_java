package day07.Review;

import java.util.Scanner;

public class Ex01_Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a%3==0) {
			System.out.println("3의 배수");
		}
		else {
			System.out.println("3의 배수X");			
		}
	}
}
