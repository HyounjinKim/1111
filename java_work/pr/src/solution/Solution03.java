package solution;


public class Solution03 {
	public static int solution(int a, int d, boolean[] included) {
		int answer = 0;
		int[] num = new int[included.length];
		int sum = 0;

		for (int i = 0; i < included.length; i++) {
			if (i != 0) {
				a += d;
				num[i] = a;
			} else {
				num[i] = a;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (included[i]) {
				sum += num[i];
			}
		}
		answer = sum;
		return answer;
	}

	public static void main(String[] args) {

		int a = 7;
		int d = 1;
		boolean[] included = { false, false, false, true, false, false, false };

		solution(a, d, included);
	}

}
