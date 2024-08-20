package day09.Ex02_ClassCasting;



public class Student extends Person {
	int grade;
	String major;
	
	public Student() {
		this("x",1,1,"x");
	}

	public Student(String string, int i, int j, String string2) {
		super(string, i);
		this.grade = j;
        this.major = string2;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}

	@Override
	public String work() {
		return "상속";
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
}
