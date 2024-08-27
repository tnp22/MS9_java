package day13_14.Ex03_WlidCard.sugang;

public class Person {
	private String name;
	//private int code;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [" + name + "]";
	}
	
	
}