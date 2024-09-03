package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static Scene scene;
	private Parent root;
	
	public static Scene getScene() {
		return scene;
	}

	public static void setScene(Scene scene) {
		Main.scene = scene;
	}

	public Parent getRoot() {
		return root;
	}

	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void start(Stage stage) throws IOException {
		try {
			root=loadFXML("Main");
			scene = new Scene(root,600,400);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// 키보드 이벤트 등록
			// 키 이벤트 등록
			MainController.setEvent(scene,root);
			
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
	
//	public void setEvent(Scene scene,Parent root) {
//		// lookup("#fx:id) : 해당 화면에서 fx:id 로 요소를 찾는다.
//		Circle circle = (Circle) root.lookup("#circle");
//		if(circle != null) {
//			System.out.println("원의 반지름 : "+circle.getRadius());
//		}
//		else {
//			System.err.println("원을 찾을 수 없습니다.");
//			return;
//		}
//		
//		// 키 입력 이벤트 등록
//		scene.setOnKeyPressed(event ->{
//			double x = circle.getCenterX(); // 원의 중심 x좌표
//			double y = circle.getCenterY(); // 원의 중심 y좌표
//			
//			switch (event.getCode()) {
//			case UP:
//				System.out.println("UP");
//				circle.setCenterY(y-=10);
//				break;
//			case DOWN:
//				System.out.println("DOWN");
//				circle.setCenterY(y+=10);
//				break;
//			case LEFT:
//				System.out.println("LEFT");
//				circle.setCenterX(x-=10);
//				break;
//			case RIGHT:
//				System.out.println("RUGHT");
//				circle.setCenterX(x+=10);
//				break;
//			default:
//				break;
//				
//			}
//		});
//		
//	}

}
