package ex09;

public class Ex02 {
	public static int solution(int[] num_list) {
		int answer = 0;
		
		int rhq = 1;
		int sum = 0;
		
		for(int i = 0;i < num_list.length;i++) {
			rhq *= num_list[i];
			sum += num_list[i];
		}
		if(rhq < sum*sum) {
			answer = 1;
		}
		else {
			answer = 0;
		}
		System.out.println(answer);
		
		return answer;
	}

	public static void main(String[] args) {
		int[] num_list = { 3, 4, 5, 2, 1 };
//		int[] num_list = { 5, 7, 8, 3 };

		solution(num_list);
	}

}
