package _java_project;

import java.util.Scanner;
//삽입정렬
public class Sort_2 {
	//5 4 3 2 1 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10001];
		int n, i, j, temp, key;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int z = 0; z < n; z++) {
			System.out.print(a[z]+" ");
		}
		System.out.println();
		for (i = 1; i < n; i++) {
			key=a[i];
		    for(j=i-1;j>=0&&key<a[j];j--)
		    {
	            a[j+1]=a[j];
	        }
	        a[j+1]=key;
			for (int z = 0; z < n; z++) {
				System.out.print(a[z]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}