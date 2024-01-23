package mysqltest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DB db = new DB();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.할일입력");
			System.out.println("2.할일목록");
			System.out.println("3.회원가입");
			System.out.println("3.종료");
			System.out.println("번호 입력");

			String str = sc.nextLine();

			if (str.equals("1")) {
				System.out.println("뭐할래?");
				String id = sc.nextLine();
				String pasword = sc.nextLine();
				db.insert(id, pasword);
			} else if (str.equals("2")) {
				db.selcet();
			} else {
				System.out.println("종료");
				break;
			}
		}

	}
}
