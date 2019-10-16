package org.javaro.lecture;

public class Ex7_5 {
	public static void main(String[] args) {
		Vadd5 add1 = new Vadd5();
		add1.x = 10.0;
		add1.y = 20.0;
		double add_value = add1.fn_add();
		System.out.println("´õÇÏ±â=" + add_value);
	}
}

class Vadd5 {
	double x, y;

	Vadd5() {
	}

	public double fn_add() {
		double result;
		result = this.x + this.y;
		return result;
	}
}
