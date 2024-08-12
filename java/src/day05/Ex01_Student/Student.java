package day05.Ex01_Student;

public class Student {
	private String name;
	private int age;
	private int numer;
	private String gengong;
	
	public Student() {
		this.name = null;
		this.age = 0;
		this.numer = 0;
		this.gengong = null;
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

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public String getGengong() {
		return gengong;
	}

	public void setGengong(String gengong) {
		this.gengong = gengong;
	}

	public Student(String name, int age, int numer, String gengong) {
		super();
		this.name = name;
		this.age = age;
		this.numer = numer;
		this.gengong = gengong;
	}
	
	public void Study(String subject) {
		System.out.println(subject+"(을/를) 공부합니다.");
	}
	
	public double getAverage(int score1,int score2) {
		double average = 0.0;
		average = (double) (score1+score2)/2;
		return average;
	}
	public double getAverage(int score1,int score2,int score3) {
		double average = 0.0;
		average = (double) (score1+score2+score3)/3;
		return average;
	}
	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum=0;
		int N=scores.length;
		for (int i : scores) {
			sum+=i;
		}
		average=(double)sum/N;
		
		return average;
	}
	
	
}
