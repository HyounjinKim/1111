package solution;

public class Solution04 {
	public static int solution(int a, int b, int c) {
		int answer = 0;
		
		if(a != b && a != c && b != c) {
			answer = a + b + c;
		}
		else if(a == b && a == c && b == c ) {
			answer = ((a+b+c) * (a*a + b*b + c*c)) * ((a*a*a) + (b*b*b)+(c*c*c));
		}
		else if(a == b || a == c || b==c) {
			answer = (a+b+c) * (a*a + b*b + c*c);
		}
		
		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		int a = 4;
		int b = 4;
		int c = 4;
		solution(a,b,c);
		
	}

}
