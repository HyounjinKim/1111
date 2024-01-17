package solution;

import java.util.Arrays;

public class Collatz {
	public static int[] solution(int n) {
		int[] answer = {};
		int[] arr = new int[1000];
		int count = 0;

		for (int i = 0;; i++) {
			arr[i] = n;
			if (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
					count++;

				} else {
					n = 3 * n + 1;
					count++;
				}

			} else
				break;

		}
		answer = new int[count + 1];
		for (int i = 0; i <= count; i++) {

			answer[i] = arr[i];
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {

		int n = 10;
		solution(n);
	}
}
