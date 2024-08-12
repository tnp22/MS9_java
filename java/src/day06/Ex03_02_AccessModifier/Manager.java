package day06.Ex03_02_AccessModifier;

import day06.Ex03_01_AccessModifier.Person;

public class Manager{
	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.defaultSetting();
		System.out.println(stu);
		System.out.println("name : "+stu.name);
		System.out.println("age : "+stu.getAge());
		//선언한 클래스를 기준으로 접근 지정자가 적용된다.
		// 같은 패키지인 Manager 클래스에서 Student 클래스의
		// default 접근지정자인 height를 접근할 수 없는 이유?
		// - 실질적으로 height를 선언한 곳은 다른 패키지 Person 클래스
		// 따라서 접근불가
		System.out.println("height : "+stu.getHeight());
		System.out.println("weight : "+stu.getWeight());
		System.out.println();
		
		Person person = new Person();
		System.out.println("name : "+person.name);
		System.out.println("age : "+person.getAge());
		System.out.println("height : "+person.getHeight());
		System.out.println("weight : "+person.getWeight());
		
	}
}
