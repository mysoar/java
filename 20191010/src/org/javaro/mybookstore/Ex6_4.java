package org.javaro.mybookstore;

public class Ex6_4 {
	public static void main(String args[]) {
		double x, y, area;
		int idx;
		x = 10;
		y = 20;
		idx = 1;
		area = fn_area(idx, x, y);
		System.out.println("4���� ����=" + area);
		idx = 2;
		area = fn_area(idx, x, y);
		System.out.println("3���� ����=" + area);
	}

	static double fn_area(int a, double b, double c) {
		double result = 0;
		if (a == 1) {
			result = b * c;
		} else if (a == 2) {
			result = 0.5 * b * c;
		}
		return result;
	}

}
