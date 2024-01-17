package solution;

import java.util.Scanner;

public class Pra {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			for (int j = N; j > i-1; j--) {
				System.out.print("1");
			}

			System.out.println("");
		}

	}

}
