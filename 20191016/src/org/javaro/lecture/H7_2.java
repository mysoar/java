package org.javaro.lecture;

public class H7_2 {
	public static void main(String args[]) {
		double x, y;

		x = 10.0;
		y = 20.0;
		double mult_value = fn_mult(x, y);

		System.out.println("°öÇÏ±â =" + mult_value);
	}

	public static double fn_mult(double x, double y) {
		double result;
		result = x * y;
		return result;

	}
}
