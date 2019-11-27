package org.javaro.lecture;

import java.util.*;

public class Ex12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		int idx = 0;
		String obj1 = "Korea";
		String obj2 = "Seoul";
		String obj3 = "Daejeon";
		arrayList.add(obj1);
		System.out.println("1=" + arrayList.get(0));
		arrayList.add(idx, obj2);
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println("2=" + arrayList.get(i));
		arrayList.set(idx, obj3);
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println("3=" + arrayList.get(i));
		idx = arrayList.indexOf(obj1);
		arrayList.remove(idx);
		int count = arrayList.size();
		System.out.println(count);
		Object[] str = arrayList.toArray();
		for (int i = 0; i < str.length; i++)
			System.out.println((String) str[i]);
		arrayList.clear();
	}

}
