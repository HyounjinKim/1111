package main;

import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;;i++) {
			String tmp = sc.nextLine();
			
			if(tmp.equals("0 0")) {
				break;
			}
			
			int num1 = Integer.parseInt((tmp.split(" ")[0]));
			int num2 = Integer.parseInt((tmp.split(" ")[1]));
			
			System.out.println(num1 + num2);
		}
	}

}
