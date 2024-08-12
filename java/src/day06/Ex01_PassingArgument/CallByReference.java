package day06.Ex01_PassingArgument;

import java.util.Iterator;

import day04.Class.Pikachu;

public class CallByReference {

	public static void setArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		System.out.println("::::: setArr() 메소드 :::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void setObject(Pikachu pikachu) {
		pikachu.energy=1000;
		pikachu.type="불";
		System.out.println("::::: setObject() 메소드 :::::");
		System.out.println(pikachu);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Pikachu pikachu = new Pikachu();
		
		System.out.println("::::: main() 메소드 :::::");
		for (int i = 0; i < 5; i++) {
			a[i]=i+1;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
		
		
		setArr(a);
		setObject(pikachu);
		
		System.out.println("::::: setXXX() 메소드 호출 후 :::::");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(pikachu);
		
	}

}
