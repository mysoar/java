package org.javaro.lecture;

public class H7_11 {
	public static void main(String[] args) {
		Varea11 area1=new Varea11();
		area1.x=10.0;
		area1.y=20.0;
		double area_value=area1.fn_area();
		System.out.println("삼각형의 면적 = "+area_value);
	}
}
class Varea11{
	double x,y;
	Varea11(){
	}
	public double fn_area()
	{
		double result;
		result=this.x*this.y*0.5;
		return result;
	}
}