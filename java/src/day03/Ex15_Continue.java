package day03;

import java.util.Scanner;

public class Ex15_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int su=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			su=sc.nextInt();
			if(su<0) {
				continue;
			}
			sum+=su;
		}
		System.out.println("양수합: "+sum);
		sc.close();
	}

}
