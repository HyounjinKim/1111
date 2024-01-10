package chap04;

import java.util.*;

class FlowEx32 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("(1~3)입력>");

			String tmp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

			if (menu == 0) {
				System.out.println("종료");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("다시 선택");
				continue;
			}
			else {
				System.out.println("제곱 = " + menu * menu);
				System.out.println("루트 = " + Math.sqrt(menu));
				System.out.println("log = " + Math.log10(menu));
			}

		}
	} // main�� ��
}
