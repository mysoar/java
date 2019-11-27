package org.javaro.lecture;

import java.io.*;

public class H11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] indat = new float[10][3];
		try {
			File csv = new File("C:\\Users\\404\\Desktop\\2.csv");
			BufferedReader br = new BufferedReader(new FileReader(csv));
			String line = "";
			int row = 0, i;
			while ((line = br.readLine()) != null) {
				// -1 옵션은 마지막 "," 이후 빈 공백도 읽기 위한 옵션
				String[] token = line.split(",", -1);
				for (i = 0; i < 3; i++)
					indat[row][i] = Float.parseFloat(token[i]);
				// CSV에서 읽어 배열에 옮긴자료 확인하기 위한 출력
				for (i = 0; i < 3; i++)
					System.out.print(indat[row][i] + ",");
				System.out.println("");
				row++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
