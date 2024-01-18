package main;

import java.util.Scanner;

public class Pr1 {

	public static void start() {
		Scanner sc = new Scanner(System.in);
		String str;
		boolean sw = true;

		while (sw) {
			System.out.println("선택");
			System.out.println("1.구구단");
			System.out.println("2.복권번호");
			System.out.println("3.종료");

			str = sc.nextLine();
			switch (str) {
			case "1":
				System.out.println("단 입력");
				int dan = Integer.parseInt(sc.nextLine());
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + " * " + i + " = " + dan * i);
				}
				System.out.println("다시하시겠습니까?");
				System.out.println("1.네");
				System.out.println("2.아니요");
				String re = sc.nextLine();
				if(re.equals("1")) {
					continue;
				}
				else if(re.equals("2")) {
					sw = false;
				}
				break;
			case "2":
				break;
			case "3":
				sw = false;
				break;
			case "4":
				System.out.println("다시 하시겠습니까?");
				System.out.println("1.네");
				System.out.println("2.종료");
				break;
			}

		}
		System.out.println("종료됐습니다");

	}

	public static void main(String[] args) {
		start();
	}
}
