package day13_14.Ex03_WlidCard.sugang;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	static List<Course<?>> courseList = new ArrayList<Course<?>>();
	static List<Person> studentList = new ArrayList<Person>();

	public static void main(String[] args) {
		int no = -1;
		do {
			try {
				menu(); // 메뉴 출력
				no = sc.nextInt();
				sc.nextLine();
				System.out.println();

				switch (no) {
				case 1:
					courseList.add(createCourse());
					break;
				case 2:
					addStudent();
					break;
				case 3:
					printCourseList();
					break;
				case 4:
					printStudent();
					break;
				case 0:
					System.out.print("종료하빈다");
					break;
				default:
					System.out.println("유효한 메뉴번호를 입력해주세요.");
					break;
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				no = -1;
				sc.nextLine();
				continue;
			}
		} while (no != 0);
	}

	/**
	 * 메뉴 출력
	 */
	public static void menu() {
		System.out.println("::::: 수강생 등록 프로그램 :::::");
		System.out.println("1. 과정 등록");
		System.out.println("2. 수강생 등록");
		System.out.println("3. 과정 확인");
		System.out.println("4. 수강생 확인");
		System.out.println("0. 종료하기");
		System.out.println("::::::::::::::::::::::::::::");
		System.out.print("번호 : ");
	}

	/**
	 * 과정 등록
	 */
	public static Course<?> createCourse() {
		System.out.print("- 과정 종류 (일반인, 직장인, 학생) : ");
		String type = sc.nextLine();
		System.out.print("- 과정 명 : ");
		String name = sc.nextLine();

		Course<?> course = switch (type) {
		case "일반인" -> {
			Course<Person> newCouse = new Course<Person>();
			yield newCouse.createCourse(name, newCouse);
		}
		case "직장인" -> {
			Course<Worker> newCouse = new Course<Worker>();
			yield newCouse.createWorkerCourse(name, newCouse);
		}
		case "학생" -> {
			Course<Student> newCouse = new Course<Student>();
			yield newCouse.createStudentCourse(name, newCouse);
		}
		default -> throw new IllegalArgumentException("유효하지 않은 과정 종류 : " + type);
		};

		return course;
	}

	/**
	 * 과정 확인
	 */
	public static void printCourseList() {
		System.out.println(":::::::::::::: 과정 목록 ::::::::::::::");
		for (Course<?> course : courseList) {
			System.out.println(course);
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::");
	}

	/**
	 * 수강생 등록
	 */
	public static void addStudent() {
		System.out.print("- 과정 종류 (일반인, 직장인, 학생, 중학생, 고등학생) : ");
		String courseType = sc.nextLine();
		System.out.print("- 수강생 종류 (일반인, 직장인, 학생, 중학생, 고등학생) : ");
		String type = sc.nextLine();
		System.out.print("- 수강생 이름 : ");
		String name = sc.nextLine();
		System.out.print("- 등록할 과정 명 : ");
		String courseName = sc.nextLine();

		Course<?> selectedCourse = new Course();
		Person newStudent = null;
		for (int i = 0; i < courseList.size(); i++) {
			Course<?> course = courseList.get(i);
			// 입력한 과정명과 등록된 과정명이 일치하면
			if (course.getName().equals(courseName)) {
				selectedCourse = course; // 지정된 과정
				switch (type) {
				case "일반인":
					newStudent = new Person(name);
					break;
				case "직장인":
					newStudent = new Worker(name);
					break;
				case "학생":
					newStudent = new Student(name);
					break;
				}
				break;
			}
		}

		// 선택된 과정에서 수강생 목록을 가져온다.
		// List<Person> students = (List<Person>) selectedCourse.getStudents();

		// ** 여기서 과정별로 수강할 수 없는 수강생 등록이 이루어지면 예외가 발생하도록 코드를 수정

		// 수강생 목록엣 지금 입력한 수강생을 추가한다.
		// * 수강생 종류에 맞게 객체를 생성하여 추가한다.
		try {
			switch (courseType) {
			case "일반인":
				((Course<Person>) selectedCourse).addStudent(newStudent);
				break;
			case "직장인":
				((Course<Worker>) selectedCourse).addStudent((Worker) newStudent);
				break;

			case "학생":
				((Course<Student>) selectedCourse).addStudent((Student) newStudent);
				break;
			// 해당 과정에 수강생 추가
			}
			studentList.add(newStudent); // 원생 목록에 수강생 추가
		} catch (Exception e) { // IllegalArgumentException
			System.err.println(courseType + " 과정에" + type + "을 등록할 수 없습니다.");
		}

	}

	/**
	 * 수강생 확인
	 */
	public static void printStudent() {
		System.out.print("- 수강생 이름 : ");
		String name = sc.nextLine();

		boolean check = false;
		for (int i = 0; i < studentList.size(); i++) {
			Person person = studentList.get(i);
			if (person.getName().equals(name)) {
				System.out.println("* 등록된 수강생입니다 : " + name);
				check = true; // 등록 O
				break;
			}
		}
		// check : false 그대로 남아있는 경우
		if (!check) {
			System.out.println("* 등록되지 않은 이름입니다.");
			return; // 메소드 종료 : 아래 코드는 실행되지 않음
		}

		// 등록된 수강생인 경우 수강 중인 과정을 출력
		System.out.println(":::::::::: 수강 중인 과정 ::::::::::::");
		for (int i = 0; i < courseList.size(); i++) {
			// 해당 과정의 수강생 목록
			List<Person> students = (List<Person>) courseList.get(i).getStudents();
			// 해당 과정의 과정명
			String courseName = courseList.get(i).getName();
			// 해당 과정의 수강생 목록을 확인하여, 입력한 이름과 일치하는 경우가 있으면
			// 해당 수강생이 수강하는 과정으로 인식하고 출력한다.
			for (int j = 0; j < students.size(); j++) {
				if (students.get(j).getName().equals(name)) {
					System.out.println("- " + courseName);
				}
			}
		}
		System.out.println(":::::::::::::::::::::::::::::::::");
	}

}
