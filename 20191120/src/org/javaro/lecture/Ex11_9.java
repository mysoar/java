package org.javaro.lecture;

import java.util.Scanner;

public class Ex11_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��:1, �����:2 ?");
		int select = sc.nextInt();
		if (select == 1) {
			System.out.println("�� ����");
		} else if (select == 2) {
			System.out.println("����� ����");
		}
		sc.close();
	}

}
