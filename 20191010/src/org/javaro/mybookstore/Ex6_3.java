package org.javaro.mybookstore;

public class Ex6_3 {
	public static void main(String args[]) {
		String gender = "female";
		fnGender(gender);
		gender = "male";
		fnGender(gender);
	}

	static void fnGender(String gender) {
		if (gender == "female") {
			System.out.println("����");
		} else if (gender == "male") {
			System.out.println("����");
		}
	}

}
