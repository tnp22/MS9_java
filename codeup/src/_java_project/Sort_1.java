package _java_project;

import java.util.Scanner;
//버블정렬
public class Sort_1 {
	//5 4 3 2 1 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10001];
		int n, i, j, temp, min;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int z = 0; z < n; z++) {
			System.out.print(a[z]+" ");
		}
		System.out.println();
		for (i = 0; i < n-1; i++) {
			for (j = 0 ; j < n-1-i; j++) {
				// 이 부분에 들어갈 코드만 작성하여 제출하세요
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			for (int z = 0; z < n; z++) {
				System.out.print(a[z]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}