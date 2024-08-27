package day15.Ex02_Stream;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoStream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + "게임] : ");
			// ArrayList<Integer> lottoList = new ArrayList<Integer>();
			Set<Integer> set = new HashSet<Integer>();

			// 랜덤 수 6개를 대입
//			for (int j = 0; j < 6; j++) {
//				int rand = (int) (Math.random() * 45 + 1);
//				//중복제거
//				if(lottoList.contains(rand)) j--;
//				else lottoList.add(rand);
//			}
			while (set.size() < 6) {
				int rand = (int) (Math.random() * 45 + 1);
				set.add(rand);
			}
			// sort
			// Collections.sort(lottoList);

//			for (Integer integer : lottoList) {
//				System.out.print(integer +" ");
//			}
//			System.out.println();
			set.stream()	//스트림 객체 생성
			   .sorted()	// 정렬
			   .forEach(lotto -> System.out.print(lotto + " ")); // 전체 반복
			System.out.println();
		}

		sc.close();

	}
}
