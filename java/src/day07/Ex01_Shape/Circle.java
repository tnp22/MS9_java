package day07.Ex01_Shape;

public class Circle extends Shape {
	
	double radius;
	
	

	public Circle() {
		this.radius = 0.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.pow(radius,2)*Math.PI;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	public double getRaidus() {
		return radius;
	}

	public void setRaidus(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
