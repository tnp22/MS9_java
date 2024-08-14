package day08.Ex02_Multimplement;

public interface SmartRemoteControl extends RemoteControl,Microphone {
	
	
	//터치 패드 기능
	// - x y 좌표 위치에 터치패드를 클릭
	void touch(int x,int y);
	
	
	
}
