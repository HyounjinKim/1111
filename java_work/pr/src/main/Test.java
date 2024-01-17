package main;


import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] arr = { "H", "E", "L", "L", "O" };

		String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new);
		
		System.out.println(Arrays.toString(resultArr));
	}
}
