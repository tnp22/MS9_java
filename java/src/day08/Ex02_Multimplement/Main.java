package day08.Ex02_Multimplement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolumen(20);
		int channel = tv.channelSearch("SBS");
		tv.setChannel(channel);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 컨텐츠 : ");
		String keyword = sc.nextLine();
		String[] content = tv.contentSerach(keyword);
		
		for (int i = 0; i < content.length; i++) {
			System.out.print(content[i]);
			if(i<content.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		tv.receiveVoice("뉴스 틀어줘");
		
		tv.turnOff();
		sc.close(); 
	}
}
