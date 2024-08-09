package day04;

public class Ex06_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";

		String c = "Hello";

		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");

		System.out.println("a == c : " + (a == c));
		System.out.println("a == d : " + (a == d));
		System.out.println("문자열 비교 : "+a.equals(d));
		
		System.out.println("e == f : " + (e == f));
		System.out.println("문자열 비교 : "+e.equals(f));
	}

}
