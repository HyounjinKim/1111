package ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 참조 변수 선언
		Scanner scan = new Scanner(System.in);
		
		// 문자열 입력
//		System.out.println("문자열 입력");
		// next 함수는 빈공백도 포함
//		String str = scan.next();
//		System.out.println("반복횟수 입력");
//		int n = scan.nextInt();
		
//		System.out.println("str = " + str);
//		System.out.println("n = " + n);
		
		for (int i = 0; i < 5; i+=2) {
			System.out.println(i);
		}
		System.out.print("끝");
	}

}
