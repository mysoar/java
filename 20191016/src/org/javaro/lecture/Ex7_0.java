package org.javaro.lecture;

class NameX {
	String name;

	void setName(String nm) {
		name = nm;
	}

	String getName() {
		return name;
	}

	String getSName() {
		return "ÀÌ¸§=" + getName();
	}
}

public class Ex7_0 {
	public static void main(String[] args) {
		NameX kdhong = new NameX();
		kdhong.setName("È«±æµ¿");
		System.out.println(kdhong.getSName());
	}

}
