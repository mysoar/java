package org.javaro.lecture;

import java.io.*;

public class Ex11_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("�̸� �Է�");
			String name = br.readLine();
			System.out.println("�̸��� " + name + "�Դϴ� ");
		} catch (IOException ioe) {
			System.out.println("���� ����");
		}

	}

}
