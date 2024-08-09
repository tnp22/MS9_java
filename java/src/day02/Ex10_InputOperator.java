package day02;

import java.util.Scanner;

public class Ex10_InputOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();

		System.out.print("y : ");
		int y = sc.nextInt();

		System.out.print("z : ");
		int z = sc.nextInt();

		int sum = x + y + z;
		
		double avg = sum / 3;

		System.out.println("합계 : " + sum);
		System.out.println("평균 :" + avg);
		avg = (double)sum / 3;
		System.out.println("실제 평균 :" + avg);
		
		sc.close();
	}

}
