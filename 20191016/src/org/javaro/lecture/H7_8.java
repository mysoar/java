package org.javaro.lecture;

public class H7_8 {
	public static void main(String[] args) {
		Varea5 area1 = new Varea5();
		area1.setX(10.0);
		area1.setY(20.0);
		double area_value = area1.fn_area();
		System.out.println("사각형의 면적 = " + area_value);
	}
}

class Varea5 {
	private double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double fn_area() {
		return this.x * this.y;
	}
}
