package org.javaro.mybookstore;

public class Ex5_4 {
	public static void main(String[] args) {
		System.out.println("김민욱" + "-" + "20151613" + "-" + "변수");
		int temp;
		int[] a = new int[] { 8, 5, 2, 3, 6 };
		for (int i = 0; i < a.length - 1; i++) { // (데이터 수-1) 만큼 for 문 실행
			for (int j = i + 1; j < a.length; j++) { // 미정리된 수에 대해 반복 비교
				if (a[i] > a[j]) { // a[i]>a[j] 이면 상호 교체
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) { // 데이터 수 만큼 for문 실행 //
			System.out.print(a[i] + " ");
		}
	}

}
