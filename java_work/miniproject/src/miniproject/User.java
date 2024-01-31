package miniproject;

import java.util.Scanner;

public class User {

	DB db = new DB();
	Scanner sc = new Scanner(System.in);
	static String id = "";
	static String password = "";
	static boolean dupl = true;

	public void createUser() {
		System.out.println("아이디를 입력해주세요.");
		while (dupl) {
			dupl = false;
			id = sc.next();
			db.idCheck(id);
		}

		System.out.println("비밀번호를 입력해주세요.");
		password = sc.next();

		db.cUser(id, password);
		System.out.println("회원가입 완료");
		dupl = true;
	}

	public void login() {
		while (dupl) {
			System.out.println("아이디를 입력해주세요.");
			id = sc.next();
			System.out.println("비밀번호를 입력해주세요.");
			password = sc.next();

			db.userCheck(id, password);
			System.out.println(db.userCheck(id, password));
		}
		dupl = true;
	}

	public void secession() {
		db.userSec(id);
	}

}
