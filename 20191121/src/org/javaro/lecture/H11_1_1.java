package org.javaro.lecture;

import java.io.*;
import java.io.IOException;

public class H11_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] indat = new float[10][3];
		try {
			File csv = new File("C:\\Users\\mysoa\\Desktop\\1.csv");
			BufferedReader br = new BufferedReader(new FileReader(csv));
			FileWriter fin = new FileWriter("C:\\Users\\mysoa\\Desktop\\20191126.csv");
			String line = " ";
			int row = 0, i;
			while ((line = br.readLine()) != null) {
				String[] token = line.split(",", -1);
				for (i = 0; i < 3; i++)
					indat[row][i] = Float.parseFloat(token[i]);
				for (i = 0; i < 3; i++) {
					if (i == 2) {
						System.out.println(indat[row][i]);
						fin.write(indat[row][i] + " ");
					} else {
						System.out.print(indat[row][i] + ",");
						fin.write(indat[row][i] + ",");
					}
				}
				System.out.print("");
				fin.write("\n");
				row++;
			}
			br.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
