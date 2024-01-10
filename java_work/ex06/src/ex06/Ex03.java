package ex06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 성적을 입력받아 90점 이상이면 A
 *             80점 이상이면 B
 *             70점 이상이면 C
 *             그외 D
 */

public class Ex03 {

	public static void solution(int a) {

		if (a >= 90) {
			System.out.println("90점 이상 A입니다.");
		} else if (a >= 80) {
			System.out.println("80점 이상 B입니다.");
		} else if (a >= 70) {
			System.out.println("70점 이상 C입니다.");
		} else
			System.out.println("70점 미만 D");
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("src/abc.text"));

		int a = sc.nextInt();
		System.out.println("a = " + a);
		int b = sc.nextInt();
		System.out.println("b = " + b);
		
		solution(a);
		solution(b);

	}

}
