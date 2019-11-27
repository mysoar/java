package org.javaro.lecture;

import java.io.*;

public class Ex11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fout = new FileWriter("C://Users//404//Desktop//write.txt");
			int a = 10, b = 5;
			fout.write("더하기 a+b=" + (a + b) + "\n");
			fout.write("빼기 a-b=" + (a - b) + "\n");
			fout.close();
			System.out.println("파일작성 완료");
		} catch (Exception e) {
			System.out.println("파일지정 하세요");
		}

	}
}
