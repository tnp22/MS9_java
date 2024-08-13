package day07.Ex01_Shape;

public class Rectangle extends Shape{
	double width,height;

	public Rectangle() {
		this.width = 0.0;
		this.height = 0.0;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
