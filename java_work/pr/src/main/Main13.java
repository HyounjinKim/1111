package main;

import java.util.Scanner;

public class Main13 {
	private static final boolean EOF = false;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt() != EOF) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            
        }

	}

}
