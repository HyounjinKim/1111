package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array06 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str1 = bf.readLine();

		int N = Integer.parseInt(str1.split(" ")[0]);
		int M = Integer.parseInt(str1.split(" ")[1]);

		int num = 1;
		int tmp = 0;

		int[] basket = new int[N];

		for (int i = 0; i < N; i++) {
			basket[i] = num + i;
		}
		for (int i = 0; i < M; i++) {
			String str2 = bf.readLine();

			int a = Integer.parseInt(str2.split(" ")[0]);
			int b = Integer.parseInt(str2.split(" ")[1]);

			 tmp = basket[a-1];
			 basket[a-1] = basket[b-1];
			 basket[b-1] = tmp;
		}

		for(int i = 0; i < basket.length; i++) {
			System.out.print(basket[i] + " ");
		}		
	}

}
