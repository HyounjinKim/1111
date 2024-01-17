package solution;

import java.util.Arrays;

public class Array02 {
	public static int[] solution(int l, int r) {
		int[] answer = { -1 };
		int arr[] = new int[r];
		int k = 0;
		int num = 0;

		for (int i = l; i <= r; i++) {
			int count = 0;

			for (int j = 0; j < Integer.toString(i).length(); j++) {
				if (Integer.toString(i).charAt(j) == '0') {
					count++;

					if (Integer.toString(i).length() == count) {
						arr[k] = i;
						k++;
						num++;
					}

				} else if (Integer.toString(i).charAt(j) == '5') {
					count++;
					if (Integer.toString(i).length() == count) {
						arr[k] = i;
						k++;
						num++;
					}
				}

			}

		}

		if (num != 0) {
			answer = new int[num];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {

		int l = 10;
		int r = 20;

		solution(l, r);

	}
}
