package org.javaro.lecture;

public class Ex10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a=" + a + ",b=" + b);
			System.out.println("a/b=" + (a / b));
			System.out.println("나누기 수행됨");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 처리루틴:");
			System.out.println(e + "예외발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 처리루틴");
			System.out.println(e + "예외발생");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 처리루틴");
			System.out.println(e + "예외발생");
		} finally {
			System.out.println("예외처리 후 finally 블럭 수생함");
		}

	}

}
