package org.javaro.lecture;

public class Ex8_4 {
	public static void main(String[] args) {
		Cat4 aCat = new Cat4();
		aCat.setName("�߿���");
		System.out.println(aCat.getName() + "�� ���� = " + aCat.crawling());
		System.out.println(aCat.getName() + "�� " + aCat.identify());
		System.out.println(aCat.getName() + "�� ���� " + aCat.identifyOrigin());
	}
}
class Animal4 {
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
class Cat4 extends Animal4 {
	public String crawling() {
		return "����������";
	}
	@Override
	public String identify() {
		return "�����";
	}
	public String identifyOrigin() {
		String str = super.identify();
		return str;
	}
}