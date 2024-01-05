package ex05;

import java.util.Scanner;
/*
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 n " is even"
 * 홀수이면 n " is odd"를 출력하는 코드를 작성해 보세요.
 */
class A{
	public void doA() {	
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		int b = 10;		
		A a = new A();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		String result = n % 2 == 0 ? n +" is even" : n + " is odd";
		System.out.println(result);
 		
//		if(n%2 == 0) {
//			System.out.println(n + " is even");
//		}
//		else {
//			System.out.println(n + " is odd");
//		}
		
	}

}
