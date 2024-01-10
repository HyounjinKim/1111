package array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		int min = 0;
		int max = 0;

		for (int i = 0; i < N; i++) {
			A[i] += sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (i+1 == N) {
				break;
			}
			else if(A[i] > A[i+1]) {
				max = A[i];
			}
			else if(A[i] < A[i+1]) {
				min = A[i];
			}
			
		}
		System.out.print(min + " " + max);

	}
}
