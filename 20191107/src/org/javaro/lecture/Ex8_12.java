package org.javaro.lecture;

public class Ex8_12 {
	public static void main(String[]args) {
		smartPhone phone1=new smartPhone();
		phone1.display();
	}
}
abstract class Device{
	String name;
	abstract void display();
}
class smartPhone extends Device{
	void display() {
		System.out.println("����Ʈ�� ���÷���");
	}
}
