package org.javaro.lecture;

public class Ex8_2 {
	public static void main(String[] agrs) {
		Cat2 aCat = new Cat2();
		aCat.setName("�߿���");
		System.out.println(aCat.getName() + "�� " + aCat.identify());
		System.out.println(aCat.getName() + "�� ���� = " + aCat.crawling());
	}
}

class Animal2 {
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

class Cat2 extends Animal2 {
	public String crawling() {
		return "����������";
	}

}
