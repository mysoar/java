package org.javaro.mybookstore;

public class H6_1 {
	public static void main(String[] args) {
		int[] g = new int[30];
		int count = 0;
		for (int i = 0; i < g.length; i++) {
			g[i] = i + 2;
		}
		for (int i = 0; i < g.length; i++) {
			if (g[i] != -1) {
				for (int j = i; j <= g.length; j += g[i]) {
					if (j + g[i] >= g.length) {
						break;
					} else {
						g[j + g[i]] = -1;
						count++;
					}
				}
			}
		}

		for (int i = 0; i < g.length; i++) {
			if (g[i] == -1) {
				continue;
			} else {
				System.out.println(g[i] + "");
			}
		}
	}
}
