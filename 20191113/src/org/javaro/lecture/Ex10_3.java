package org.javaro.lecture;

public class Ex10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("�Ű������� ���� �� ���� ��");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a=" + a + ",b=" + b);
			System.out.println("a/b=" + (a / b));
			System.out.println("������ �����");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ó����ƾ:");
			System.out.println(e + "���ܹ߻�");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ó����ƾ");
			System.out.println(e + "���ܹ߻�");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException ó����ƾ");
			System.out.println(e + "���ܹ߻�");
		} finally {
			System.out.println("����ó�� �� finally �� ������");
		}

	}

}
