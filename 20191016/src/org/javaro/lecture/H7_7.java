package org.javaro.lecture;

public class H7_7 {
	public static void main(String[] args) {
		Varea4 area1 = new Varea4();
		area1.x = 10.0;
		area1.y = 20.0;
		double area_value = area1.fn_area();
		System.out.println("사각형의 면적 = " + area_value);
	}
}

class Varea4 {
	double x, y;

	Varea4() {
	}

	public double fn_area() {
		double result;
		result = this.x * this.y;
		return result;
	}
}
