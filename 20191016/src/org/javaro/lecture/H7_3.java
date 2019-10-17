package org.javaro.lecture;

public class H7_3 {
	public static void main(String[] args) {
		Vmult5 mult1 = new Vmult5();
		mult1.x = 10.0;
		mult1.y = 20.0;
		double mult_value = mult1.fn_mult();
		System.out.println("°öÇÏ±â = " + mult_value);
	}

}

class Vmult5 {
	double x, y;

	Vmult5() {
	}

	public double fn_mult()
	{
		double result;
		result=this.x*this.y;
		return result;
	}
}
