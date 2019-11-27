package org.javaro.lecture;

import java.util.*;

public class Ex12_4 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		for (String str : arrayList) {
			System.out.println(str);
		}
	}
}
