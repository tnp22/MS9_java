package day09.Ex02_ClassCasting;

public class UpCasting {
	public static void main(String[] args) {
		Person person = new Student("김조은",20,1,"게임미디어학과");
		
		System.out.println("name: "+person.name);
		System.out.println("age: "+person.age);
		
		//Person 객체에서는 자식 변수 접근불가
		//System.out.println("grade: "+person.grade);
		//System.out.println("major: "+person.major);
		
		//자식 변수는 접근 불가하고, 자식 메소드가 우선하여 실행된다.
		System.out.println(person);
		System.out.println(person.work());
	}
}
