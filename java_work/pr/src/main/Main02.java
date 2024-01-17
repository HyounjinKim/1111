package main;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int money;
		
		if(num1 == num2 && num1 == num3) {
			money = 10000 + (num1 * 1000);
			
		}
		else if(num1 == num2 || num1 == num3) {
			money = 1000 + (num1 * 100);
			
		}
		else if(num2 == num3){
			money = 1000 + (num2 * 100);
		}
		else {
			int max1 = Math.max(num1, num2);
			int max2 = Math.max(max1, num3);
			money = max2 * 100;
		}
		System.out.println(money);
	}

}
