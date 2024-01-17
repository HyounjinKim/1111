package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ch = new ArrayList<Integer>();

		int arr[] = new int[28];

		for (int i = 0; i < 30; i++) {
			ch.add(i + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(ch.toString());
		System.out.println(Arrays.toString(arr));
	}
}
