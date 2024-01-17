package ex09;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
	public static String solution(int[] numLog) {
		String answer = "";

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for (int i = 0; i < numLog.length - 1; i++) {

			if (i == 0) {
				numLog[i] = 0;
				continue;
			} else if (str.charAt(i-1) == 'w') {
				numLog[i] += 1;
				numLog[i] += numLog[i-1];
				continue;
			} else if (str.charAt(i-1) == 's') {
				numLog[i] += -1;
				numLog[i] += numLog[i-1];
				continue;
			} else if (str.charAt(i-1) == 'd') {
				numLog[i] += 10;
				numLog[i] += numLog[i-1];
				continue;
			} else if (str.charAt(i-1) == 'a') {
				numLog[i] += -10;
				numLog[i] += numLog[i-1];
				continue;
			}

		}
		System.out.println(Arrays.toString(numLog));
		answer = Arrays.toString(numLog);
		return answer;
	}

	public static void main(String[] args) {

		int[] numLog = new int[12];

		solution(numLog);

	}

}
