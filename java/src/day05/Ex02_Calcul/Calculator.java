package day05.Ex02_Calcul;

public class Calculator {
	
	public double Plus(double a, double b) {
		return a+b;
	}
	public double Minus(double a, double b) {
		return a-b;
	}
	public double Multiple(double a, double b) {
		return a*b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
	public double remain(double a, double b) {
		return a % b;
	}
	public double Sum(double a[]) {
		double sum=0.0;
		for (double d : a) {
			sum+=d;
		}
		return sum;
	}
	public double Avg(double a[]) {
		return (double)Sum(a)/a.length;
	}
}
