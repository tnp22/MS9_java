package day03;

public class Ex12_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 50; i < 101; i++) {
			System.out.print(i + " ");
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("-------------------------------");
		for (int i = 2; i < 21; i += 2) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n-------------------------------");
		for (int i = 1; i < 21; i += 2) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
