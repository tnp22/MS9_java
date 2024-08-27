package day13_14.Ex03_WlidCard.sugang;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student ["+this.getName()+"]";
	}
	
}
