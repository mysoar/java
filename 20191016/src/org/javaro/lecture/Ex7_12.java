package org.javaro.lecture;

public class Ex7_12 {
	public static void main(String[] args) {
		Animal anim = new Animal();
		anim.setName("�߿���");
		System.out.println(anim.getName() + "�� " + anim.identify());
	}

}

class Animal {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String identify() {
		return "����";
	}
}
