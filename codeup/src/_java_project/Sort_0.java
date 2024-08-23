package _java_project;

import java.util.Scanner;
//선택정렬
public class Sort_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10001];
		int n, i, j, temp, min;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {
				// 이 부분에 들어갈 코드만 작성하여 제출하세요
				if(a[min]>a[j]) {
					min=j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}