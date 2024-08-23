package day10.Ex02_util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println( cal.get(Calendar.YEAR) );
		System.out.println( cal.get(Calendar.MONTH) + 1 );
		System.out.println( cal.get(Calendar.DAY_OF_MONTH) );
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		
		String today =sdf.format(cal.getTime());
		System.out.println("현재 날짜/시간 : "+today);
		
		cal.add(cal.MINUTE, 10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println("10분 후 : "+after10Min);
		
		cal.add(cal.HOUR, 1);
		String after1Hour = sdf.format(cal.getTime());
		System.out.println("1시간 후 : "+after1Hour);
		
		cal.add(cal.DAY_OF_WEEK, 1);
		String after1Day = sdf.format(cal.getTime());
		System.out.println("1일 후 : "+after1Day);
		
		cal.add(cal.DAY_OF_WEEK, -18);
		String before18Day = sdf.format(cal.getTime());
		System.out.println("18일 전 : "+before18Day);
		
		Calendar cal2=Calendar.getInstance();
		cal2.roll(cal.DAY_OF_WEEK, -50);
		String before50Day = sdf.format(cal2.getTime());
		System.out.println("50일 전 : "+before50Day);
		
		// add(날짜필드 , 값) : 해당 날짜 데이터에서 날짜 필드의 값을 증감시키는 메소드
		// roll(날짜필드, 값) : 해당 날짜 데이터에서 날짜 필드의 값을 증감시키는 메소드
		//					* 상위 날짜 필드에 영향을 주지않는다.
		
	}
}
