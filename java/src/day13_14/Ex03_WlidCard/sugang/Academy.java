package day13_14.Ex03_WlidCard.sugang;

import java.util.ArrayList;
import java.util.List;

public class Academy {
	public static void main(String[] args) {
		
		// 일반인 과정 생성
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("김조은"));
		personList.add(new Worker("박조은"));
		personList.add(new Student("이조은"));
		personList.add(new HighStudent("황조은"));
		personList.add(new MiddleStudent("권조은"));
		Course<Person> personCourse = new Course<Person>(personList);
		personCourse.createCourse("일반인과정", personCourse);
		personCourse.printStudentList(personCourse);
		
		// 직장인 과정 생성
		List<Worker> workerList = new ArrayList<Worker>();
		//workerList.add(new Person("김조은"));
		//workerList.add(new Student("이조은"));
		//workerList.add(new HighStudent("황조은"));
		//workerList.add(new MiddleStudent("권조은"));
		workerList.add(new Worker("김백수"));
		workerList.add(new Worker("안기욱"));
		workerList.add(new Worker("김부장"));
		workerList.add(new Worker("장그래"));
		Course<? super Worker> workerCourse = new Course<>(workerList);
		workerCourse.createWorkerCourse("직장인과정", workerCourse);
		workerCourse.createWorkerCourse("직장인과정2", personCourse);
		workerCourse.printStudentList(workerCourse);
		
		// 학생 과정
		List<Person> studentList = new ArrayList<Person>();
		//workerList.add(new Person("김조은"));
		studentList.add(new Student("김학생"));
		studentList.add(new HighStudent("이고딩"));
		studentList.add(new MiddleStudent("장중딩"));
		Course<? extends Student> studentCourse = new Course(studentList);
		studentCourse.createStudentCourse("학생과정", studentCourse);
		//studentCourse.createStudentCourse("직장인과정", workerCourse);
		//studentCourse.createStudentCourse("일반인과정", personCourse);		
		studentCourse.printStudentList(studentCourse);
		
		List<MiddleStudent> middleStudentList = new ArrayList<MiddleStudent>();
		middleStudentList.add(new MiddleStudent("이중딩"));
		Course<MiddleStudent> middleStudentCourse = new Course(middleStudentList);
		middleStudentCourse.createStudentCourse("중학생과정", middleStudentCourse);
		
		//workerCourse.createWorkerCourse("직장인과정3", studentCourse);
		// 직장인 과정은 학생 과정 세팅을 개설할 수 없다.
		
		studentCourse.printStudentList(studentCourse);
		studentCourse.printStudentList(middleStudentCourse);
		
				
	}
}