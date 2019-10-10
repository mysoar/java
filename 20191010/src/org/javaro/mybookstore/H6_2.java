package org.javaro.mybookstore;

public class H6_2 {
	public static void main(String args[]) {
		float tempC = temp_convert(70.0f);
		System.out.println("temp C=" + tempC + "C");
	}

	static float temp_convert(float farenheit) {
		float celsius = (farenheit - 32) * (5.0f / 9.0f);
		return celsius;
	}

}
