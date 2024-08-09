package day04;

public class Ex01_Array {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println("배열의 길이 : "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
