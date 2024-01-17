package solution;

import java.util.Arrays;

public class For03 {
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = arr;

		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j < arr.length; j++) {
				if (j <= queries[i][1] && j % queries[i][2] == 0) {
					answer[j] += 1;
				}
			}

		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 1 }, { 0, 3, 2 }, { 0, 3, 3 } };

		solution(arr, queries);

	}
}
