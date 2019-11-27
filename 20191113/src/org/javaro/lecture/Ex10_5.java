package org.javaro.lecture;

public class Ex10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			Ex10_5.func(a, b);
		} catch (Exception e) {
			System.out.println("예외처리 루틴:");
			System.out.println(e + "예외 발생");
		} finally {
			System.out.println("예외 처리 후 finally 블럭 수행함");
		}
	}

	public static void func(int a, int b) throws Exception {
		System.out.println("a=" + a + ", b=" + b);
		System.out.println("a/b=" + (a / b));
		System.out.println("나누기 수행됨");
	}
}
