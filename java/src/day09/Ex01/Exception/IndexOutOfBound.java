package day09.Ex01.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * 예외처리 IndexOutOfBound : 배열이나 문자열의 index 를 벗어나는 경우 발생하는 예외
 */
public class IndexOutOfBound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=0;
		int[] arr = new int[N];
		int index=0,input=0;
		try {
			System.out.print("배열 요소의 개수");
			N = sc.nextInt();
			System.out.print("접근할 index : ");
			index = sc.nextInt();
			System.out.print("입력할 값 : ");
			input = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("정수 범위에서 입력해주세요");
		}
		//ArrayIndexOutOfBoundsException : 배열 인덱스 범위를 벗어남
		try {
			arr[index] = input;
			System.out.println("arr[" + index + "] : " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인덱스를 벗어남");
			System.err.println("(0~"+(N-1)+") 사이의 정수 범위에서 입력해주세요");
		}

		sc.close();
	}
}
