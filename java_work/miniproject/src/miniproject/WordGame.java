package miniproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class WordGame {
	Scanner sc = new Scanner(System.in);
	DB db = new DB();
	User user = new User();
	String answer = "";
	int score = 0;
	
	public void total(int i, int j) {
		int scoreF = 5;
		int scoreS = 3;
		int scoreT = 1;

		switch (j) {
		case 0:
			score += scoreF;
			break;
		case 1:
			score += scoreS;
			break;
		case 2:
			score += scoreT;
			break;
		}
	}

	public void color() {

		List<String> word = new ArrayList<String>();
		List<String> cHint1 = new ArrayList<String>();
		List<String> cHint2 = new ArrayList<String>();
		List<String> cHint3 = new ArrayList<String>();
		List<String> cHint4 = new ArrayList<String>();
		List<String> cHint5 = new ArrayList<String>();
		List<String> cHint6 = new ArrayList<String>();
		List<String> cHint7 = new ArrayList<String>();
		List<String> cHint8 = new ArrayList<String>();
		List<String> cHint9 = new ArrayList<String>();
		List<String> cHint10 = new ArrayList<String>();

		word.addAll(db.wordList("색상"));
		db.hintList(cHint1,"빨간색");
		db.hintList(cHint2,"주황색");
		db.hintList(cHint3,"노란색");
		db.hintList(cHint4,"초록색");
		db.hintList(cHint5,"분홍색");
		db.hintList(cHint6,"갈색");
		db.hintList(cHint7,"보라색");
		db.hintList(cHint8,"흰색");
		db.hintList(cHint9,"검은색");
		db.hintList(cHint10,"회색");


		Collections.shuffle(word);
		Collections.shuffle(cHint1);
		Collections.shuffle(cHint2);
		Collections.shuffle(cHint3);
		Collections.shuffle(cHint4);
		Collections.shuffle(cHint5);
		Collections.shuffle(cHint6);
		Collections.shuffle(cHint7);
		Collections.shuffle(cHint8);
		Collections.shuffle(cHint9);
		Collections.shuffle(cHint10);

		aa: for (int i = 0; i < word.size(); i++) {
			System.out.println(i + 1 + "번 문제");
			for (int j = 0; j < 3; j++) {
				if (word.get(i).equals("빨간색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint1.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}

				} else if (word.get(i).equals("주황색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint2.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("노란색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint3.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("초록색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint4.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("분홍색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint5.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("갈색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint6.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("보라색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint7.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("흰색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint8.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("검은색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint9.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				} else if (word.get(i).equals("회색")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint10.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i, j);
						continue aa;
					} else {
						System.out.println("오답");
						continue;
					}
				}

			}
		}
		if(score > 0){
			System.out.println("점수 : " + score);
			db.rankInsert(score, "색상",user.id);
			score = 0;
		}
		else {
			System.out.println("0점 랭킹 미등록");
		}
	}

	public void animal() {

		List<String> word = new ArrayList<String>();
		List<String> cHint1 = new ArrayList<String>();
		List<String> cHint2 = new ArrayList<String>();
		List<String> cHint3 = new ArrayList<String>();
		List<String> cHint4 = new ArrayList<String>();
		List<String> cHint5 = new ArrayList<String>();
		List<String> cHint6 = new ArrayList<String>();
		List<String> cHint7 = new ArrayList<String>();
		List<String> cHint8 = new ArrayList<String>();
		List<String> cHint9 = new ArrayList<String>();
		List<String> cHint10 = new ArrayList<String>();

		word.addAll(db.wordList("동물"));
		db.hintList(cHint1,"강아지");
		db.hintList(cHint2,"고양이");
		db.hintList(cHint3,"말");
		db.hintList(cHint4,"사자");
		db.hintList(cHint5,"코끼리");
		db.hintList(cHint6,"원숭이");
		db.hintList(cHint7,"곰");
		db.hintList(cHint8,"사슴");
		db.hintList(cHint9,"고래");
		db.hintList(cHint10,"새");


		Collections.shuffle(word);
		Collections.shuffle(cHint1);
		Collections.shuffle(cHint2);
		Collections.shuffle(cHint3);
		Collections.shuffle(cHint4);
		Collections.shuffle(cHint5);
		Collections.shuffle(cHint6);
		Collections.shuffle(cHint7);
		Collections.shuffle(cHint8);
		Collections.shuffle(cHint9);
		Collections.shuffle(cHint10);

		aa: for (int i = 0; i < word.size(); i++) {
			System.out.println(i + 1 + "번 문제");
			for (int j = 0; j < 3; j++) {
				if (word.get(i).equals("강아지")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint1.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
					
				}
				else if (word.get(i).equals("고양이")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint2.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				}
				else if (word.get(i).equals("말")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint3.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				}
				else if (word.get(i).equals("사자")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint4.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("코끼리")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint5.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("원숭이")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint6.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("곰")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint7.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("사슴")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint8.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("고래")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint9.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("새")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint10.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				
			}
		}
		if(score > 0){
			System.out.println("점수 : " + score);
			db.rankInsert(score, "동물",user.id);
			score = 0;
		}
		else {
			System.out.println("0점 랭킹 미등록");
		}
	}
	
	public void food() {

		List<String> word = new ArrayList<String>();
		List<String> cHint1 = new ArrayList<String>();
		List<String> cHint2 = new ArrayList<String>();
		List<String> cHint3 = new ArrayList<String>();
		List<String> cHint4 = new ArrayList<String>();
		List<String> cHint5 = new ArrayList<String>();
		List<String> cHint6 = new ArrayList<String>();
		List<String> cHint7 = new ArrayList<String>();
		List<String> cHint8 = new ArrayList<String>();
		List<String> cHint9 = new ArrayList<String>();
		List<String> cHint10 = new ArrayList<String>();

		word.addAll(db.wordList("음식"));
		db.hintList(cHint1,"피자");
		db.hintList(cHint2,"파스타");
		db.hintList(cHint3,"치킨");
		db.hintList(cHint4,"초밥");
		db.hintList(cHint5,"햄버거");
		db.hintList(cHint6,"라면");
		db.hintList(cHint7,"스테이크");
		db.hintList(cHint8,"떡볶이");
		db.hintList(cHint9,"샐러드");
		db.hintList(cHint10,"아이스크림");


		Collections.shuffle(word);
		Collections.shuffle(cHint1);
		Collections.shuffle(cHint2);
		Collections.shuffle(cHint3);
		Collections.shuffle(cHint4);
		Collections.shuffle(cHint5);
		Collections.shuffle(cHint6);
		Collections.shuffle(cHint7);
		Collections.shuffle(cHint8);
		Collections.shuffle(cHint9);
		Collections.shuffle(cHint10);

		aa: for (int i = 0; i < word.size(); i++) {
			System.out.println(i + 1 + "번 문제");
			for (int j = 0; j < 3; j++) {
				if (word.get(i).equals("피자")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint1.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
					
				}
				else if (word.get(i).equals("파스타")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint2.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				}
				else if (word.get(i).equals("치킨")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint3.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				}
				else if (word.get(i).equals("초밥")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint4.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("햄버거")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint5.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("라면")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint6.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("스테이크")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint7.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("떡볶이")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint8.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("샐러드")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint9.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				else if (word.get(i).equals("아이스크림")) {
					System.out.print(j + 1 + "번 힌트 ");
					System.out.println(cHint10.get(j));
					answer = sc.next();
					if (word.get(i).equals(answer)) {
						System.out.println("정답");
						total(i,j);
						continue aa;
					}
					else {
						System.out.println("오답");
						continue;
					}
				} 
				
			}
		}
		if(score > 0){
			System.out.println("점수 : " + score);
			db.rankInsert(score, "음식",user.id);
			score = 0;
		}
		else {
			System.out.println("0점 랭킹 미등록");
		}
	}

}
