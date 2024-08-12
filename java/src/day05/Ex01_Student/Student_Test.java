package day05.Ex01_Student;

public class Student_Test {
	public static void main(String[] args) {
		
		Student stu = new Student("리춘동",35,25484,"핵에너지");
		
		int scores[]= {100,80,90,50,75};
		
		System.out.println(":::::학생:::::");
		System.out.println("학생 이름 : "+stu.getName());
		System.out.println("학생 나이 : "+stu.getAge());
		System.out.println("학생 학번 : "+stu.getNumer());
		System.out.println("학생 전공 : "+stu.getGengong());
		
		
		System.out.println("학생 평균 : "+stu.getAverage(100,90)+"점");
		System.out.println("학생 평균 : "+stu.getAverage(100,90,80)+"점");
		System.out.println("학생 평균 : "+stu.getAverage(scores)+"점");
		stu.Study("리틀보이");
		
		Student stu0 = new Student("이동혁",-1,22222,"컴공");
		
		int scores0[]= {100,90,90,90,80};
		
		System.out.println(":::::학생:::::");
		System.out.println("학생 이름 : "+stu0.getName());
		System.out.println("학생 나이 : "+stu0.getAge());
		System.out.println("학생 학번 : "+stu0.getNumer());
		System.out.println("학생 전공 : "+stu0.getGengong());
		
		
		System.out.println("학생 평균 : "+stu0.getAverage(100,90)+"점");
		System.out.println("학생 평균 : "+stu0.getAverage(100,90,80)+"점");
		System.out.println("학생 평균 : "+stu0.getAverage(scores0)+"점");
		stu0.Study("자바");
		
		
	}
}
