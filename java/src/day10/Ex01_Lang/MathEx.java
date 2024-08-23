package day10.Ex01_Lang;

public class MathEx {
	private static void swap(int a[], int b, int c) {
		int temp;
		temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	public static void main(String[] args) {
		System.out.println(Math.PI); //원주율
		System.out.println(Math.E); // 자연계수 e
		System.out.println(Math.ceil(-5.132)); //올림
		System.out.println(Math.floor(3.75)); //내림
		System.out.println(Math.sqrt(9)); //제곱근
		System.out.println(Math.pow(3, 2)); //제곱
		System.out.println(Math.exp(2));// e의 2승
		System.out.println(Math.round(3.14)); //반올림
		System.out.println("---------------------");
		
		
		
		//로또 번호
		//Math.random()  			: 0.0 보다 크거나 같고 1.0보다 작은 임의의 실수
		//Math.random()				: 0.0xxx~0.9xxx
		// (0.0xxx~0.9xxx) * 10 	: 0.xxx~9.xxx		(0~9)		-10개
		// (0.0xxx~0.9xxx) * 20 	: 0.xxx~9.xxx		(0~19)		-20개
		// (0.0xxx~0.9xxx) * 45 	: 0.xxx~44.xxx		(0~44)		-45개
		// (0.0xxx~0.9xxx) * 45+1 	: 1.xxx~45.xxx		(1~45)		-개
		// (int)(Math.random() * 45 + 1)	: 1~45
		
		// [공식]
		// (int)(Math.random() * [개수] + [시작숫자])
		int lotto[]=new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i]=random;
			
			for (int j = 0; j < i; j++) {
				if(lotto[j]==random) {
					i--;
					break;
				}
			}
		}
		
		for (int i : lotto) {
			System.out.print(i+" ");
		}
		System.out.println("\n============");
		
		//정렬
		for (int i = 0; i < lotto.length; i++) {
			
			for (int j = 0; j < i; j++) {
				if(lotto[i]<lotto[j]) {
					swap(lotto,i,j);
				}
			}
			for (int i0 : lotto) {
				System.out.print(i0+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
