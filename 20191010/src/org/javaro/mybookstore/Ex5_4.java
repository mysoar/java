package org.javaro.mybookstore;

public class Ex5_4 {
	public static void main(String[] args) {
		System.out.println("��ο�" + "-" + "20151613" + "-" + "����");
		int temp;
		int[] a = new int[] { 8, 5, 2, 3, 6 };
		for (int i = 0; i < a.length - 1; i++) { // (������ ��-1) ��ŭ for �� ����
			for (int j = i + 1; j < a.length; j++) { // �������� ���� ���� �ݺ� ��
				if (a[i] > a[j]) { // a[i]>a[j] �̸� ��ȣ ��ü
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) { // ������ �� ��ŭ for�� ���� //
			System.out.print(a[i] + " ");
		}
	}

}
