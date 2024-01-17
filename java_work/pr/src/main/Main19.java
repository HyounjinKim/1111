package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = 42;
		int result = 0;
		String arr[] = new String[10];

		for (int i = 0; i < 10; i++) {
			int N = sc.nextInt();

			result = N % A;
			arr[i] = Integer.toString(result);
		}

		String[] arrle = Arrays.stream(arr).distinct().toArray(String[]::new);

		System.out.println(Arrays.toString(arrle));

	}

}
