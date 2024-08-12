package day06.Ex03_02_AccessModifier;

import day06.Ex03_01_AccessModifier.Person;

public class Student extends Person {

	public Student() {
		super();
	}

	public Student(String name, int age, double height, double weight) {
		super(name, age, height, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음";//public
		age=20; //protected 상속이라 가능
//		height=170; //default 다른 패키지라서 안됨
//		wegiht=60; //private 다른 클래스라서 안됨
		
		setHeight(170); 
		setWeight(60);
	}
	
}
