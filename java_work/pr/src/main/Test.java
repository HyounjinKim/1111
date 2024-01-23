package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.animal();
	}

	public void animal() {
		Scanner sc = new Scanner(System.in);
		String answer;
		int tscore = 0;

		String[] animal = { "강아지", "고양이", "말", "사자", "코끼리", "원숭이", "곰", "사슴", "돌고래", "기린" };

		List<String> animals = Arrays.asList(animal);
		Collections.shuffle(animals);

		String[][] animalEx = { { "개", "개", "개" }, { "고양이", "고양이", "고양이" }, { "말", "말", "말" }, { "사자", "사자", "사자" },
				{ "코끼리", "코끼리", "코끼리" }, { "원숭이", "원숭이", "원숭이" }, { "곰", "곰", "곰" }, { "사슴", "사슴", "사슴" },
				{ "돌고래", "돌고래", "돌고래" }, { "기린", "기린", "기린" } };

		aa: for (int i = 0; i < animal.length; i++) {

			int score = 3;

			for (int j = 0; j < animalEx[i].length; j++) {

				System.out.println("힌트 : " + animalEx[i][j]);
				System.out.println("정답입력");

				answer = sc.next();
				System.out.println(animal[i] + "" + answer);
				if (animal[i] == answer) {

					System.out.println("정답");
					tscore += score;

					if (i + 1 == animal.length) {
						System.out.println("게임종료");
						System.out.println("현재 점수 : " + tscore);
					} else {
						System.out.println("현재점수 : " + tscore);
						System.out.println("다음 문제");
					}
					continue aa;
				} else if (answer.equals(animal[i]) != animal[i].equals(animal[i])) {
					System.out.println("오답");
					score--;

					if (i + 1 == animal.length) {
						System.out.println("게임종료");
						System.out.println("현재 점수 : " + tscore);
					} else if (j + 1 == animalEx[i].length) {
						System.out.println("다음문제");
						System.out.println("현재 점수 : " + tscore);
					} else {
						System.out.println("다음힌트");
					}
					continue;

				}
			}
		}
	}
}
