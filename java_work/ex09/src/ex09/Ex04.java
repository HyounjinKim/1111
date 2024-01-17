package ex09;

import java.util.Arrays;

/*
 * 버블정렬
 * 
 * 1회전
 * {100,90,60,40,120}
 * {90,100,60,40,120}
 * {90,60,100,40,120}
 * {90,60,40,100,120}
 * 2회전
 * {60,90,40,100,120}
 * {60,40,90,100,120}
 * 3회전
 * {40,60,90,100,120}
 * 
 * {100,90,60,40,120}
 * 
 * 최대값
 * 최소값
 * 
 * 내림차순
 * 오름차순
 */

public class Ex04 {
	public static void main(String[] args) {

		int[] arr = { 100, 90, 60, 40, 120 };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - j; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
