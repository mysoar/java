package org.javaro.lecture;

public class Ex7_2 {
	public static void main(String[] args) {
		String name, rank, height, weight, service;
		name = "ȫ�浿";
		rank = "1�";
		System.out.println(name);
		System.out.println(rank);
		height = "170";
		System.out.println(height);
		swimming(name);
		firing(name);
	}

	static void swimming(String name) {
		System.out.println(name + " ����ϱ�");

	}

	static void firing(String name) {
		System.out.println(name + " �����߻�");
	}

}
