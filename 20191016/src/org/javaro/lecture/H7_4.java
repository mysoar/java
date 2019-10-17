package org.javaro.lecture;

public class H7_4 {
	public static void main(String[] args) {
		Vmult6 mult1 = new Vmult6();
		mult1.setX(10.0);
		mult1.setY(20.0);
		double mult_value = mult1.fn_mult();
		System.out.println("°öÇÏ±â = " + mult_value);
	}
}

class Vmult6 {
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

	public double fn_mult() {
		return this.x * this.y;
	}

}
