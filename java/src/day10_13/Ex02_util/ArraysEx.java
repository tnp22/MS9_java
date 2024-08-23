package day10_13.Ex02_util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysEx {
	public static void main(String[] args) {
		Integer[] arr = {5,3,4,1,2};
		
		Arrays.sort(arr);
		for (Integer i : arr) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		Arrays.sort(arr,Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 이진 탐색 알고리즘
		//Arrays.binarySearch(배열, 찾을 값)
		// - 전제 조건 : 주어진 배열이 오름차순 정렬되어 있어야한다.
		// - 이진 탐색 알고리즘을 사용하여 탐색한 후,
		// 1. 해당 값이 있으면, 그 위치(index)를 반환
		// 2. 해당 값이 없으면, () - (insertion point -1 ) 음수를 반환
		// * insertion point
		// : 해당 값이 배열에 있다고 가정했을 때, 정렬에 따라 삽입되어야할 위치
		
		int[] random=new int[100];
		Random rand = new Random();
		for (int i = 0; i < random.length; i++) {
			random[i]=rand.nextInt(100)+1;
		}
		
		Arrays.sort(random);
		for (int i : random) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int result = Arrays.binarySearch(random, 10);
		if(result<0) {
			System.out.println("랜덤 수 10이 없습니다.");
			System.out.println("insertion point : "+result);
		}
		else {
			System.out.println("랜덤 수 10의 위치(index) : "+result);
		}
		
		// Arrays.fill
		int fill[]=new int[10];
		
		Arrays.fill(fill, 8);

		for(int i=0;i<fill.length;i++) {
			System.out.print(fill[i]+" ");
		}
		System.out.println();
		
		int copy[]=Arrays.copyOf(fill, 3);
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		int copyRange[]=Arrays.copyOfRange(random, 11, 21); //복사
		
		for (int i = 0; i < copyRange.length; i++) {
			System.out.print(copyRange[i]+" ");
		}
		System.out.println();
		
	}
}
