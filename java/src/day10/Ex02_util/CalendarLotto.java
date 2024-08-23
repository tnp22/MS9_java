package day10.Ex02_util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 이번 주 로또 추첨 일시를 구해보자
 * (조건)
 * - 매일 6시~24까지 판매
 * - 추첨일(토요일)에는 오후 8시에 판매 마감
 * - 추첨일(토요일) 오후 8시부터 다음일(일요일) 오전 6시까지 판매 정지
 * 
 * Q. 오늘 날짜/시간을 기준으로 로또를 구매한다면, 추첨일시는 언제인가?
 * (출력)
 * 추첨일 : 2024/08/24 21:00:00
 */

public class CalendarLotto {
	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월: ");
		cal.set(Calendar.MONTH, 19);
		System.out.print("일: ");
		cal.set(Calendar.DATE, 19);
		System.out.print("시간: ");
		cal.set(Calendar.HOUR, 5);
		
		cal.set(Calendar.AM_PM, 1);
		int week = cal.get( Calendar.DAY_OF_WEEK ); // 일(1)~토(7)
		int time = cal.get( Calendar.HOUR );
		int ampm = cal.get( Calendar.AM_PM );  // am(0), pm(1)
		System.out.println(week+" "+time+" "+ampm);
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		
		String today =sdf.format(cal.getTime());
		System.out.println("구입일 : "+today);
		
		
		if(time>=8 && ampm==1 && week==7) {
			System.out.println("못삼");
		}
		else if(time<6 && ampm==0 && week==1) {
			System.out.println("못삼");
		}
		else if(time<6 && time >=0 && ampm==0) {
			System.out.println("시간 제한");
		}
		else {
			cal.add(cal.DATE, 7-week);  //7-5=2일후
			cal.set(Calendar.AM_PM, 1);
			cal.set(Calendar.HOUR, 9);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			today =sdf.format(cal.getTime());
			System.out.print("추첨일 : "+today);
		}
		
	
		
		sc.close();
		
		
	}
}
