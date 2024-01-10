package chap04;

import java.util.*;

class FlowEx2 {
	public static void main(String[] args) {
		int input;

		System.out.print("입력>");

		Scanner scanner = new Scanner(System.in);
		input = Integer.parseInt(scanner.nextLine()); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		if (input == 0) {
			System.out.println("0입력");
		}

		if (input != 0)
			System.out.println("0이 아님");
	}
}
