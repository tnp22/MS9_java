package day09.Ex02_ClassCasting;


public class Person {
	String name;
	int age;
	
	public Person() {
		this.name = "미정";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String work() {
		return "일을 합니다.";
	}
}
