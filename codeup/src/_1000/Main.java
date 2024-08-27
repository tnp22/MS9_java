package _1000;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		String input = null;
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		String delim[] = new String[4];

		StringTokenizer stk = new StringTokenizer(input, "+-*/", true);
		// System.out.println("total tokens:"+stk.countTokens());
		// System.out.println("================tokens==================");
		int i = 0;
		while (stk.hasMoreTokens()) {
			delim[i++] = stk.nextToken();
		}
		// System.out.println("total tokens:"+stk.countTokens());
		double result = switch (delim[1]) {
		case "+" -> {
			yield Double.parseDouble(delim[0])+Double.parseDouble(delim[2]);
		}
		case "-" -> {
			yield Double.parseDouble(delim[0])-Double.parseDouble(delim[2]);
		}
		case "*" -> {
			yield Double.parseDouble(delim[0])*Double.parseDouble(delim[2]);
		}
		case "/" -> {
			yield Double.parseDouble(delim[0])/Double.parseDouble(delim[2]);
		}
		default -> throw new IllegalArgumentException("유효하지 않은 과정 종류 : " + delim[1]);
		};
		if(delim[1].equals("/")) {
			System.out.printf("%.2f",result);
		}
		else {
			System.out.println((int)result);
		}
		
		sc.close();
	}
}