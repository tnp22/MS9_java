package day06.Ex02_ObjectArray;

class Circle{
	
	int ban;
	
	public Circle() {
		
	}
	
	public Circle(int ban) {
		this.ban = ban;
	}

	public void area(){
		System.out.println("넓이 : "+Math.pow(ban, 2)*Math.PI);
	}
	
}


public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir[]=new Circle[5];
		
		for (int i = 0; i < cir.length; i++) {
			cir[i]=new Circle(i+1);
		}
		
		for (Circle circle : cir) {
			circle.area();
		}
	}

}
