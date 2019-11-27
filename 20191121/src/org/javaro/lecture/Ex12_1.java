package org.javaro.lecture;

import java.util.*;

public class Ex12_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println((String) arrayList.get(i));
		}
	}

}
