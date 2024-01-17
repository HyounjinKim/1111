package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array05 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str1 = bf.readLine();

		int N = Integer.parseInt(str1.split(" ")[0]);
		int M = Integer.parseInt(str1.split(" ")[1]);
		int[] basket = new int[N + 1];

		for (int i = 0; i < M; i++) {
			String str2 = bf.readLine();

			int a = Integer.parseInt(str2.split(" ")[0]);
			int b = Integer.parseInt(str2.split(" ")[1]);
			int c = Integer.parseInt(str2.split(" ")[2]);

			for (int j = a; j <= b; j++) {
				basket[j] = c;
			}
		}
		for (int i = 1; i < basket.length; i++) {
			System.out.print(basket[i] + " ");
		}
	}

}
