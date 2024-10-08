package application;
	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	// 주 윈도우를 나타내는 객체 
	//private Stage primaryStage;
	// 화면 A, B 객체 선언
	private Scene sceneA, sceneB;
	@Override
	public void start(Stage primaryStage) {
		//this.primaryStage=primaryStage;
		try {
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//화면 A 생성
			Button switchButton = new Button("B 화면으로 이동");
			// 버튼 클릭 시, 화면 B로 이동
			switchButton.setOnAction(e->primaryStage.setScene(sceneB));
			StackPane layoutA = new StackPane(switchButton);
			sceneA = new Scene(layoutA,300,200);
			
			//화면 B 생성
			Button backButton = new Button("A 화면으로 이동");
			//버튼 클릭 시, 화면 A로 이동
			backButton.setOnAction(e->primaryStage.setScene(sceneA));
			StackPane layoutB = new StackPane(backButton);
			sceneB = new Scene(layoutB,300,200);
			
			// 프로그램 아이콘 지정
			
			// 프로그램 아이콘 지정 src폴더에 저장
			Image icon = new Image("icon.png");
			primaryStage.getIcons().add(icon);
			
			
			// 시작화면 Scene 설정
			primaryStage.setScene(sceneA);					//화면A로 시작
			primaryStage.setTitle("Java FX - Scene 화면이동");// 윈도우 타이틀 설정
			primaryStage.show();							//윈도우 출력
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
