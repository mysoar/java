package org.javaro.lecture;

public class Ex8_3 {
	public static void main(String[] args) {
		Cat3 aCat = new Cat3();
		aCat.setName("�߿���");
		System.out.println(aCat.getName() + "�� ���� = " + aCat.crawling());
		System.out.println(aCat.getName() + "�� " + aCat.identify());
	}
}

class Animal3 {
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

class Cat3 extends Animal3 {
	public String crawling() {
		return "����������";
	}

	@Override
	public String identify() {
		return "�����";
	}

}
