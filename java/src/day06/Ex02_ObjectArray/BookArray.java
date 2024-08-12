package day06.Ex02_ObjectArray;

import java.util.Scanner;

class Book{
	String title;
	String author;
	
	
	public Book() {
		this("제목없음","작가미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	//Object(최상위 클래스)에 정의된 toString() 메소드를 오버라이딩하면,
	//반환값을 출력물에서 출력하는 객체를 대신하여 출력
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}

public class BookArray {
	public static void main(String[] args) {
		Book list[]=new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < list.length; i++) {
			System.out.print("제목 : ");
			String title=sc.nextLine();
			System.out.print("저자 : ");
			String author=sc.nextLine();

			list[i]=new Book(title,author);
			
		}
		for (Book book : list) {
			System.out.println(book);
		}
		
		sc.close();
		
	}
		
}
