package solution;

import java.util.Arrays;

public class Solution01 {
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];

		int num = ((numer1 * denom2) + (numer2 * denom1));
		int den = ((denom1 * denom2));

		while (num % 2 == 0 && den % 2 == 0) {
			num /= 2;
			den /= 2;
		}

		answer[0] = num;
		answer[1] = den;
		System.out.println(Arrays.toString(answer));

		return answer;
	}

	public static void main(String[] args) {

		int numer1 = 10;
		int denom1 = 3;
		int numer2 = 4;
		int denom2 = 1;

		solution(numer1, denom1, numer2, denom2);

	}
}
