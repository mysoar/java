package org.javaro.lecture;
public class Ex9_4 {
	public static void main(String [] args) {
		double sum; float x,y,z;
		x=Float.parseFloat(args[0]);
		y=Float.parseFloat(args[1]);
		z=Float.parseFloat(args[2]);
		AreaTest1 object1 =new AreaTest1(x);
		sum=object1.CalArea(x);
		System.out.println("원 면적은 " +sum+"입니다");
		AreaTest1 object2=new AreaTest1(x,y);
		sum=object2.CalArea(x,y);
		System.out.println("직사각형 면적은 " +sum+ "입니다");
		AreaTest2 object3=new AreaTest2(x,y,z);
		sum=object3.CalArea(x,y,z);
		System.out.println("부피는" +sum+ "입니다");
		object3.rtcal(x,y);
		object3.rhcal(x,y);
		object3.cccal(x);
	}
}
class AreaTest1{
	float width,height,depth;
	public AreaTest1(float h) {
		height=h;
	}
	public AreaTest1(float h,float w) {
		height=h;
		width=w;
	}
	public double CalArea(float a) {
		double sum1;
		sum1=a*a*3.14;
		return sum1;
	}
	public float CalArea(float a,float b) {
		float sum2;
		sum2=a*b;
		return sum2;
	}
}
interface RectangleCal{
	//float base=10.0,height=20.0;
	public float rtcal(float b,float h);
}
interface RhombusCal{
	//float diagonal1=.0, dialgonal2=4.5;
	public float rhcal(float d1,float d2);
}
interface AreaCal extends RectangleCal,RhombusCal{
}
interface CircleCal{
	//float radius=10.0;
	double cccal(float r);
}
class AreaTest2 extends AreaTest1 implements AreaCal,CircleCal{
	public AreaTest2(float h,float w, float d) {
		super(h,w);
		depth=d;
	}
	public float CalArea(float a,float b,float c) {
		float sum3;
		sum3=(a*b)*c;
		return sum3;
	}
	public float rtcal(float a,float b) {
		float rtarea;
		rtarea =a*b;
		System.out.println("인터페이스에 의한 사각형면적은 " +rtarea+"입니다");
		return rtarea;
	}
	public float rhcal(float a,float b) {
		float rharea;
		rharea=a*b/2;
		System.out.println("인터페이스에 의한 마름모면적은 " +rharea+"입니다");
		return rharea;
	}
	public double cccal(float a) {
		double ccarea;
		ccarea=a*a*3.14;
		System.out.println("인터페이스에 의한 원면적은" +ccarea+ "입니다");
		return ccarea;
	}
}