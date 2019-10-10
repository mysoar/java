package org.javaro.mybookstore;

public class H6_3 {
	public static void main(String[] args) {
		int x1, y1, x2, y2, x3, y3, x4, y4;
		x1 = 0;
		y1 = 0;
		x2 = 10;
		y2 = 10;
		x3 = 10;
		y3 = 15;
		x4 = 25;
		y4 = 60;
		double c = dLength(x1, y1, x2, y2);
		double d = eLength(x3, y3, x4, y4);
		System.out.println("두 점 사이 거리는" + c);
		System.out.println("두 점 사이 거리는" + d);
	}

	static double dLength(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	static double eLength(int x3, int y3, int x4, int y4) {

		return Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
	}

}
