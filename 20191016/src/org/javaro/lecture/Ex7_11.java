package org.javaro.lecture;

public class Ex7_11 {
	public static void main(String[] args) {
		Studentx stud1 = new Studentx();
		stud1.setStudNo("20151613");
		stud1.setName("±è¹Î¿í");
		System.out.println(stud1.getStudNo());
		System.out.println(stud1.setName());
	}

}

class Studentx {
	String studNo, name;

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudNo() {
		return this.studNo;
	}

	public String setName() {
		return this.name;
	}
}
