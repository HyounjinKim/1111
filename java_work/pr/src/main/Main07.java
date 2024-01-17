package pr;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if (N % 4 == 0) {
			N /= 4;
			for (int i = 0; i < N; i++) {
				System.out.print("long ");
			}

			System.out.print("int");
		}

	}

}
