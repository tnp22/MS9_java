package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class MainController {

    @FXML
    private Circle circle;

    @FXML
    private Button downButton;

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    private Button upButton;

    private double x;
    private double y;
    
    // 키보드 이벤트 등록
//    @FXML
//    public void initialize() {
//    	
//    }
	/**
	 * 키보드로 도형을 이동시키는 이벤트 등록
	 * 
	 */
	public static void setEvent(Scene scene,Parent root) {
		// lookup("#fx:id) : 해당 화면에서 fx:id 로 요소를 찾는다.
		Circle circle = (Circle) root.lookup("#circle");
		if(circle != null) {
			System.out.println("원의 반지름 : "+circle.getRadius());
		}
		else {
			System.err.println("원을 찾을 수 없습니다.");
			return;
		}
		
		// 키 입력 이벤트 등록
		Main.scene.setOnKeyPressed(event ->{
			double x = circle.getCenterX(); // 원의 중심 x좌표
			double y = circle.getCenterY(); // 원의 중심 y좌표
			
			switch (event.getCode()) {
			case UP:
				System.out.println("UP");
				circle.setCenterY(y-=10);
				break;
			case DOWN:
				System.out.println("DOWN");
				circle.setCenterY(y+=10);
				break;
			case LEFT:
				System.out.println("LEFT");
				circle.setCenterX(x-=10);
				break;
			case RIGHT:
				System.out.println("RUGHT");
				circle.setCenterX(x+=10);
				break;
			default:
				break;
				
			}
		});
		
	}
    
    @FXML
    void downButtonClick(ActionEvent event) {
    	System.out.println("DOWN");
    	y+=10;
    	circle.setCenterY(y);
    }

    @FXML
    void leftButtonClick(ActionEvent event) {
    	System.out.println("LEFT");
    	x-=10;
    	circle.setCenterX(x);
    }

    @FXML
    void rightButtonClick(ActionEvent event) {
    	System.out.println("RIGHT");
    	x+=10;
    	circle.setCenterX(x);
    }

    @FXML
    void upButtonClick(ActionEvent event) {
    	System.out.println("UP");
    	y-=10;
    	circle.setCenterY(y);
    }

}
