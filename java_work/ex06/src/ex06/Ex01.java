package ex06;

import java.util.Scanner;

public class Ex01 {
	
	/*
	 * int -> double
	 * double -> int
	 * 
	 * string -> int
	 * Integer.parseInt(변수명)
	 * 
	 * string -> double
	 * Double.parsedouble(변수명)
	 * 
	 * string -> float
	 * float.parsefloat(변수명)
	 * 
	 */
	
	public static int solution(int a, int b) {
		int result1 = Integer.parseInt(a+""+b);
		int result2 = Integer.parseInt(b+""+a);
		
		if(result1<result2) {
			return result2;
		}
		else {
			return result1;
		}	
	}
	
	public static void main(String[] args) {
		String ac = "100";
		Integer.parseInt(ac);
		int a = 12;
		int b = 3;
		
		int result = solution(a,b);
		System.out.println(result);
	}

}
