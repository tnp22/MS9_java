package day04;

public class Ex04_Foreach {
	public static void main(String[] args) {
		
		String[] week = {"월요일","화요일","수요일","목요일","금요일",
				"토요일","일요일"};
		
		for (String day : week) {
			System.out.print(day+" ");
		}
		System.out.println();
		for (int i = 0; i < week.length; i+=2) {
			System.out.print(week[i]+" ");
		}
	}
}
