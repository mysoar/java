package org.javaro.lecture;

public class Ex8_1 {
	public static void main(String []args) {
		Cat1 aCat = new Cat1();
		aCat.setName("�߿���");
		System.out.println(aCat.getName() + "�� " + aCat.identify());
	}
}
	class Animal1 {
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

	class Cat1 extends Animal1 {

	}

