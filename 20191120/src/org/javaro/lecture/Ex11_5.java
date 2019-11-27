package org.javaro.lecture;

import java.io.*;

public class Ex11_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\404\\Desktop\\123.txt");
			int c;
			while ((c = fin.read()) != -1) {
				s = s + (char) c;
			}
			System.out.println(s);
			fin.close();
		} catch (IOException ioe) {
			System.out.println("파일없음");
		} catch (Exception e) {
			System.out.println("파일지정 하세요");
		}

	}

}
