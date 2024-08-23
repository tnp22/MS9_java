package day10_13.Ex02_util;

import java.util.Calendar;

public class CalendarEx {
	private static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		int ampm = cal.get(Calendar.AM_PM);

		System.out.print(msg + " : ");
		System.out.print(year + "/" + month + "/" + day + "/");

		String Day = "";
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			Day = "일요일";
			break;
		case Calendar.MONDAY:
			Day = "월요일";
			break;
		case Calendar.TUESDAY:
			Day = "화요일";
			break;
		case Calendar.WEDNESDAY:
			Day = "수요일";
			break;
		case Calendar.THURSDAY:
			Day = "목요일";
			break;
		case Calendar.FRIDAY:
			Day = "금요일";
			break;
		case Calendar.SATURDAY:
			Day = "토요일";
			break;

		}
		System.out.print(Day);

		System.out.println("(" + hourOfDay + "시)");

		if (ampm == Calendar.AM)
			System.out.println("오전");
		if (ampm == Calendar.PM)
			System.out.println("오후");

		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}

	public static void main(String[] args) {
		// * new Calender() 대신, getInstance() 메소드
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);

		Calendar test = Calendar.getInstance();
		test.set(2024, Calendar.SEPTEMBER, 4);
		printCalendar("자바 마지막 수업일(연/월/일)", test);
		
		//종강일
		Calendar lastDay = Calendar.getInstance();
		lastDay.set(2025, Calendar.FEBRUARY, 10, 18, 20, 0);
		
		//오늘로부터 종강일 까지 D-day
		//getTimeInMillis() : 날짜를 ms(밀리초)단위까지 숫자로 반환
		//1970년 1월 1일 0시 0분 0초 0ms 부터 현재 날짜/시간 까지 카운트한 숫자를 반환
		//0.001초		: 1ms
		//60초			: 1분
		//60분			: 1시간
		//24시			: 1일
		long lastT = lastDay.getTimeInMillis();
		long nowT = now.getTimeInMillis();
		System.out.println("lastT - notT = " + (lastT - nowT));

		
		long dDay = (lastT - nowT)/(1000*60*60*24);
		System.out.println("D-day : " + dDay + "일");
		
		//1970년 1월 1일 ~ 오늘
		//1970년 1월 1일 ~ 2025년 02월 10일
		long nowD = nowT/(1000*60*60*24);
		long lastD = lastT/(1000*60*60*24);
		
		System.out.println("1970년 1월 1일 ~ 오늘 : "+nowD);
		System.out.println("1970년 1월 1일 ~ 2025년 02월 10일 : "+lastD);
		
		Calendar birth = Calendar.getInstance();
		birth.set(2000,Calendar.FEBRUARY,22);
		
		long birthD=birth.getTimeInMillis()/(1000*60*60*24);
		long afterBirth = nowD-birthD;
		
		
		System.out.println("생후 "+afterBirth+"일이 지났습니다.");
		
		//오늘이 종강 전인지 후인지
		if(now.before(lastDay)) {
			System.out.println("종강 전입니다.");
		}
		else if(now.after(lastDay)) {
			System.out.println("종강 후입니다.");
		}
	}
}
