package day04;

public class Ex05_Arrays {

	public static void main(String[] args) {
		
		int arr[][]=new int[2][3];
		int a=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=a++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int arr1[][]=new int[3][];
		a=2;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=new int[a++];
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for (int[] is : arr1) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
	}

}
