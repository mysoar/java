package org.javaro.mybookstore;

public class Ex6_14 {
	public static void main(String args[]) {
		double x, y;

		x = 10.0;
		y = 20.0;
		double area = fn_area(x, y);

		System.out.println("���� = " + area);
	}

	public static double fn_area(double x, double y) {
		double result;
		result = 0.5 * x * y;
		return result;
	}

}
