package ex07;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		// 5
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
