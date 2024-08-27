package day13_14.Ex03_WlidCard.sugang;

import java.util.ArrayList;
import java.util.List;

public class Course<T> implements Manager {
	private String name; // 과정명
	private List<T> students; // 수강생 목록

	
	public Course() {
		this.name = "";
		this.students = new ArrayList<T>();
	}

	public Course(List<T> students) {
		this.students = students;
	}

	public Course(String name, List<T> students) {
		this.name = name;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<T> getStudents() {
		return students;
	}

	public void setStudents(List<T> students) {
		this.students = students;
	}

	@Override
	public Course<?> createCourse(String name, Course<Person> course) {
		course.setName(name);
		System.out.println("일반인 과정 생성!");
		return course;
	}

	@Override
	public Course<?> createWorkerCourse(String name, Course<? super Worker> course) {
		course.setName(name);
		System.out.println("직장인 과정 생성!");
		return course;
	}

	@Override
	public Course<?> createStudentCourse(String name, Course<? extends Student> course) {
		course.name=name;
		System.out.println("학생 과정 생성!");
		return course;
	}

	@Override
	public void printStudentList(Course<?> course) {
		System.out.println("::::: 과정명 "+course.getName()+" :::::");
		System.out.println("::::: 수강생 목록 :::::");
		List<Object> studentList = (List<Object>) course.getStudents();
		for (Object st: studentList) {
			System.out.println(st);
		}
		System.out.println();
	}
	
	/**
	 * 수강생 추가
	 * @param t
	 */
	public void addStudent(T t) {
		getStudents().add(t);
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", students=" + students + "]";
	}
	

}
