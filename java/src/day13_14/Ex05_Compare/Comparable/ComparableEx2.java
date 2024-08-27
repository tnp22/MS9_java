package day13_14.Ex05_Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 1. Movie 영화 클래스 정의
 * 2. Movie 변수는 title,author,price 로 변수 선언
 * 3. 영화를 제목순으로 오름차순 정렬
 * 		- String 의 compareTo() 를 활용
 * 		  해당문자열.compareTo(비교문자열)
 * 		  * 해당문자열이 사전순으로 더 뒤에 있으면 (양수)
 * 		  * 해당문자열이 사전순으로 더 앞에 있으면 (음수)
 * 		  * 같은 문자열이면 0
 */

class Movie implements Comparable<Movie>{
	String title;
	String author;
	int price;
	public Movie() {
	}
	public Movie(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Movie o) {
		String thisTitle = this.getTitle();
		String comTitle = o.getTitle();
		
		int asc = thisTitle.compareTo(comTitle);
		// -asc 이면 내림차순
		int desc = comTitle.compareTo(thisTitle);
		
		return asc;
	}
	
	
	
}
public class ComparableEx2 {
	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("반지의 제왕","감독2",40000));
		movieList.add(new Movie("늘봄가든","감독1",50000));
		movieList.add(new Movie("파일럿","감독3",30000));
		movieList.add(new Movie("에이리언 : 로뮬루스","감독4",20000));
		movieList.add(new Movie("퍼시픽 림","감독5",10000));
		
		//정렬 전
		System.out.println("* 정렬 전");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println("----------------------------");
		
		//정렬
		// * Book 클래스에서 구현한 compareTo() 메소드의 비교 기준에 따라서 정렬
		Collections.sort(movieList);
		
		//정렬 후
		System.out.println("* 정렬 후");
		
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println("-----------------------------");
	}
}
