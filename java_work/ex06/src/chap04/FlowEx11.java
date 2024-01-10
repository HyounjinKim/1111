package chap04;

import java.util.*;

class FlowEx11 {
	public static void main(String[] args) {
		char gender;
		String regNo = "";
		System.out.print("(011231-1111222)>");

		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		gender = regNo.charAt(6);

		if (gender == '1' || gender == '3') {
			if (gender == '1')
				System.out.println("2000년 이전 남자");

			else
				System.out.println("2000년 이후 남자");

		}

		switch (gender) {
		case '1':
		case '3':
			switch (gender) {
			case '1':
				System.out.println("2000년 이전 남자.");
				break;
			case '3':
				System.out.println("2000년 이후 남자");
			}
			break; // �� break���� ������ �ʵ��� ����
		case '2':
		case '4':
			switch (gender) {
			case '2':
				System.out.println("2000년 이전 여자");
				break;
			case '4':
				System.out.println("2000년 이후 여자");
				break;
			}
			break;
		default:
			System.out.println("디폴트");
			;
		}
	} // main�� ��
}
