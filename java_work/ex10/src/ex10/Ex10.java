package ex10;

import java.util.Scanner;

public class Ex10 {

	public int calcu(int num1, int num2, String yon) {
		int result = 0;

		if (yon.equals("+")) {
			result = num1 + num2;
		} else if (yon.equals("-")) {
			result = num1 - num2;
		} else if (yon.equals("*")) {
			result = num1 * num2;
		} else if (yon.equals("/")) {
			result = num1 / num2;
		}

		System.out.println(num1 + " " + yon + " " + num2 + " = " + result);

		return result;
	}

	Ex10() {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 수 입력");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력");
		String yon = sc.next();
		
		calcu(num1,num2,yon);

	}

	public static void main(String[] args) {
		new Ex10();
	}

}
