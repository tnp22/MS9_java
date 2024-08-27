package day13_14.Ex05_Compare.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 1. Comparator 인터페이스를 구현 2. compare() 메소드 오버라이딩 - 정렬 기준1 : 나이순 오름차순 - 정렬 기준1 :
 * 이름순 내림차순
 */

class User implements Comparator<User> {
	String id;
	String name;
	int age;

	public User() {
		this("-", "-", 0);
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		// 정렬 기준1 : 나이순 - 오름차순
		// 정렬 기준2 : 이름순 - 내림차순

		// o1 : 해당 객체
		// o2 : 비교 객체

		// 1. 각각 객체의 나이를 가져와서 age1, age2 로 선언
		// 2. 각 객체의 이름을 가져와서 name1, name2 로 선언
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		String name1 = o1.getName();
		String name2 = o2.getName();
		// 정렬 로직 작성
		// o1 이 더 큰 객체 -> 양수
		// o1 이 o2 같은 객체 -> 0
		// o1 이 더 작은 객체 -> 음수
		int asc = age1 - age2;
		int Desc = -name1.compareTo(name2);
//		if(asc==0) {
//			return Desc;
//		}
//		else {
//			return asc;
//		}
		
		return asc == 0 ? Desc : asc;
	}

}

public class ComparatorEx {
	public static void main(String[] args) {
		List<User> userList = Arrays.asList(new User("1", "김김김", 20), new User("5", "이이이", 40),
				new User("4", "김김수", 20), new User("3", "무지아", 15), new User("0", "피카츄", 10000),
				new User("23", "피츄", 10000), new User("ㄹㄴㅁ", "츄", 10000), new User("ㄴㅇㄹ", "피", 10000),
				new User("ㄹㅇㄴㄻ", "피융", 10000), new User("ㄴㄹㄴㅁㅇㄹ", "피ㅈ", 10000), new User("ㄴㄹㅇㄹㄴㅁ", "피ㅋ", 10000),
				new User("ㄹㅇㄴㅁㄹ", "피ㅇ", 10000), new User("ㅈㄹㄷ", "ㅁㅇㄹ", 10000), new User("ㄷㅈㄹ", "피ㅇㄴ", 10000));

		// 정렬 전
		System.out.println("* 정렬 전");
		for (User movie : userList) {
			System.out.println(movie);
		}
		System.out.println("----------------------------");

		// 정렬
		// * Book 클래스에서 구현한 compareTo() 메소드의 비교 기준에 따라서 정렬
		Collections.sort(userList, new User());

		// 정렬 후
		System.out.println("* 정렬 후");

		for (User movie : userList) {
			System.out.println(movie);
		}
		System.out.println("-----------------------------");

		List<User> userList2 = Arrays.asList(new User("1", "김김김", 20), new User("5", "이이이", 40),
				new User("4", "김김수", 20), new User("3", "무지아", 15), new User("0", "피카츄", 10000),
				new User("23", "피츄", 10000), new User("ㄹㄴㅁ", "츄", 10000), new User("ㄴㅇㄹ", "피", 10000),
				new User("ㄹㅇㄴㄻ", "피융", 10000), new User("ㄴㄹㄴㅁㅇㄹ", "피ㅈ", 10000), new User("ㄴㄹㅇㄹㄴㅁ", "피ㅋ", 10000),
				new User("ㄹㅇㄴㅁㄹ", "피ㅇ", 10000), new User("ㅈㄹㄷ", "ㅁㅇㄹ", 10000), new User("ㄷㅈㄹ", "피ㅇㄴ", 10000));

		// 정렬 전
		System.out.println("* 정렬 전");
		for (User movie : userList2) {
			System.out.println(movie);
		}
		System.out.println("----------------------------");

		// 익명 구현 객체
		// Collections.sort( 컬렉션, 정렬기준객체);
		Collections.sort(userList2, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				String id1 = o1.getId();
				String id2 = o2.getId();
				int asc = id1.compareTo(id2);
				return asc;
			}
		});

		// 정렬 후
		System.out.println("* 정렬 후");

		for (User movie : userList2) {
			System.out.println(movie);
		}
		System.out.println("-----------------------------");
	}
}
