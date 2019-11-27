package org.javaro.lecture;

import java.io.*;

public class Ex11_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//WRITE
			FileOutputStream fout = new FileOutputStream("C:\\Users\\404\\Desktop\\t.out");
			for (int i = 0; i < 5; i++)
				fout.write(i);
			fout.close();
//READ
			FileInputStream fin = new FileInputStream("C:\\Users\\404\\Desktop\\t.out");
			InputStreamReader in = new InputStreamReader(fin);
			int c;
			while ((c = in.read()) != -1) {
				System.out.println(c);
			}
			fin.close();
		} catch (IOException ioe) {
			System.out.println("파일없음");
		}

	}

}
