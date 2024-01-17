package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array07 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int ch;

		int[] chNum = new int[30];

		for (int i = 0; i < chNum.length; i++) {
			chNum[i] = i + 1;
		}
		for (int i = 0; i < chNum.length - 2; i++) {
			ch = Integer.parseInt(bf.readLine());
			for (int j = 0; j < chNum.length; j++) {
				if (chNum[j] == ch) {
					continue;
				}

			}
		}
	}
}
