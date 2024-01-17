package solution;

public class Solution02 {
	public static String solution(String code) {
		String answer = "";
		int mode = 0;
		String ret = "";

		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '1' && mode == 0) {
				mode = 1;
				continue;
			} else if (code.charAt(i) == '1' && mode == 1) {
				mode = 0;
				continue;
			}
			if (i % 2 == 0 && mode == 0) {
				ret += code.charAt(i);
			} else if (i % 2 != 0 && mode == 1) {
				ret += code.charAt(i);
			}

//			System.out.println(i + " " +code.charAt(i)+ " " + mode+ " " + ret);
		}

		answer = ret;
		if (answer == "") {
			answer = "EMPTY";
		}
//		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		String code = "abc1abc1abc";

		solution(code);

	}
}
