package org.javaro.lecture;

public class Ex7_1 {
	public static void main(String [] args) {
		NavySoldier kdhong;
		kdhong = new NavySoldier("ȫ�浿", "1�");
		System.out.println(kdhong.name);
		System.out.println(kdhong.rank);
		kdhong.setHeight("170");
		System.out.println(kdhong.getHeight());
		kdhong.swimming();
		kdhong.firing();
	}

}
class NavySoldier{
	String name,rank,height,weight,service;
	NavySoldier(String name, String rank){
		this.name=name; this.rank=rank;
	}
	void swimming() {
		System.out.println(this.name+" ����ϱ�");
	}
	void firing() {
		System.out.println(this.name+" �����߻�");
	}
	void setHeight(String height) {
		this.height=height;}
	String getHeight() {
		return this.height;
	}
}
