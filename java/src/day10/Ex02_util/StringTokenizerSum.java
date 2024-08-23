package day10.Ex02_util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(input,"+");
		int sum=0;
		
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			int item = Integer.parseInt(token);
			sum+=item;
		}
		System.out.println("합계 : "+sum);
		sc.close();
		
		
	}
}
