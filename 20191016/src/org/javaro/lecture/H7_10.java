package org.javaro.lecture;

public class H7_10 {
	public static void main(String[] args) {
		double x, y;
		x = 10.0;
		y = 20.0;

		double area = fn_area(x, y);
		System.out.println("삼각형의 면적 = " + area);
	}

	public static double fn_area(double x, double y) {
		double result;
		result = 0.5 * x * y;
		return result;
	}
}
