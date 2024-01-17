package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int[] arrx = new int[N];
		int[] arry = new int[N];
		int xx = 0;
		int yy = 0;
		int result = 0;

		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			int x = Integer.parseInt(str.split(" ")[0]);
			int y = Integer.parseInt(str.split(" ")[1]);

			arrx[i] = x;
			arry[i] = y;
		}
		Arrays.sort(arrx);
		Arrays.sort(arry);

		xx = arrx[arrx.length - 1] - arrx[0];
		yy = arry[arry.length - 1] - arry[0];
		result = xx * yy;
		System.out.println(result);

	}

}
