package miniproject;

import java.util.Scanner;

public class WordGame {

	public static void Menu() {
		boolean exit = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.뒤로가기" + "\n" + "2.랜덤" + "\n" + "3.동물" + "\n" + "4.색깔" + "\n" + "5.음식");
		String num = sc.nextLine();

		while (exit) {
			switch (num) {
			case "1":
				System.out.println("뒤로가기");
				exit = false;
				break;
			case "2":
				exit = false;
				break;
			case "3":
				exit = false;
				break;
			case "4":
				exit = false;
				break;
			case "5":
				exit = false;
				break;
			case "6":
				System.out.println("종료합니다.");
				exit = false;
				break;
			default:
				System.out.println("다시 선택해 주세요.");
				num = sc.nextLine();
				continue;
			}
		}
	}

	public static void main(String[] args) {

		Menu();
		
	}
}
