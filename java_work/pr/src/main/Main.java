package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int h = 24;
		int m = 60;
		
		/*if(m - B <= 0 ) {
			
		}*/
		//System.out.println(A + " " + (m - 45));
		System.out.println(((B-75) * -1) - m);
	}
}
