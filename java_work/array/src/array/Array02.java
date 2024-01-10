package array;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int N = 0;
		int X = 0;

		N = Integer.parseInt(str.split(" ")[0]);
		X = Integer.parseInt(str.split(" ")[1]);

		int[] A = new int[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
			if (A[i] < X) {
				System.out.print(A[i] + " ");

			}

		}
	}

}
