package day07.Review;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_Lotto {
	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int bayal[]=new int[6];
		
		double random = Math.random();		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 1000; i++) {
			int a=(int)(Math.random()*41)-20;
			if(min>a) {
				min=a;
			}
			if(max<a) {
				max=a;
			}
			
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		for (int i = 0; i < bayal.length; i++) {
			bayal[i]=(int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(bayal[i]==bayal[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(bayal);
		for (int i : bayal) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		sc.close();
	}
}
