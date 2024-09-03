package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene scene;
	
	@Override
	public void start(Stage stage) throws IOException {
		try {
			scene = new Scene(loadFXML("Main"),600,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// 스타일 시트 파일(CSS) 적용
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			stage.setScene(scene);
			stage.show();
			

			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Scene 의 컨테이너를 불러온 FXML 로 지정하는 메소드
	 * @param fxml
	 * @throws IOException
	 */
	static void setRoot(String fxml) throws IOException{
		scene.setRoot(loadFXML(fxml));
	}
	
	/**
	 * FXML 파일 읽어오는 메소드
	 * @param fxml
	 * @return
	 * @throws IOException
	 */
	private static Parent loadFXML(String fxml) throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml+".fxml"));
		return fxmlLoader.load();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * 커스텀 프로그램 종료
	 * @param stage
	 */
//	public void exit(Stage stage) {
//		System.out.println("프로그램 종료를 시도합니다...");
//		
//		// 확인 경고창
//		Alert alert = new Alert(AlertType.CONFIRMATION);
//		alert.setTitle("프로그램 종료");
//		alert.setHeaderText("프로그램을 종료합니다.");
//		alert.setContentText("종료 전에 수정 내용을 저장하시겠습니까?");
//		
//		// 경고창에서 OK 버튼 클릭 시
//		if(alert.showAndWait().get()==ButtonType.OK) {
//			System.out.println("프로그램을 종료합니다...");
//			stage.close();
//		}
//		
//		
//	}
}
