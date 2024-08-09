package day05.Ex02_Calcul;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		
		double a[]= {1,2,3,4,5};
		
		System.out.println("plus="+cal.Plus(b, c));
		System.out.println("Minus="+cal.Minus(b, c));
		System.out.println("Multiple="+cal.Multiple(b, c));
		System.out.println("divide="+cal.divide(b, c));
		System.out.println("remain="+cal.remain(b, c));
		System.out.println("sum="+cal.Sum(a));
		System.out.println("avg="+cal.Avg(a));
		
		System.out.printf("%.1f",1234.5678);
		
		
		sc.close();
	}

}
