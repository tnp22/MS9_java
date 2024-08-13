package day07.Review;

public class Ex02_ThreeSixNine {
	final static int NUMBER =1000;
	static void sam(int i) {
		int result=0;
		int gi=i;
		while(i>0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				result+=1;
			}
			i=i/10;
		}
		if(result>0) {
			for (int j = 0; j < result; j++) {
				System.out.print("*");
			}
		}
		else {
			System.out.print(gi);
		}
	}

	public static void main(String[] args) {
		int a = NUMBER + 1;
		for (int i = 1; i < a; i++) {
			sam(i);
			System.out.println();
		}
	}
}
