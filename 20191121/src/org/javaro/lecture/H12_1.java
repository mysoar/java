package org.javaro.lecture;

import java.io.*;
import java.util.*;

public class H12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File csv = new File("C:\\Users\\mysoa\\Desktop\\3.csv");
			FileWriter fin = new FileWriter("C:\\Users\\mysoa\\Desktop\\20191126_1.csv");
			BufferedReader br = new BufferedReader(new FileReader(csv));
			String line = "";
			int row = 0, i;
			while ((line = br.readLine()) != null) {
					List<String>list=Arrays.asList(line.split(","));
					for(i=0; i<list.size(); i++) {
						if(i ==(list.size()-1)) {
							System.out.print(list.get(i));
							fin.write(list.get(i)+"");
						}else {
							System.out.print(list.get(i)+",");
							fin.write(list.get(i)+",");
						}
					}
					System.out.println("");
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



