package ex08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int productCnt = 4;
		int check = 0;
		
		total = sc.nextInt();
		productCnt = sc.nextInt();
		sc.nextLine();
		
		int[] itemPrice = new int[productCnt];
		int[] itemCnt = new int[productCnt];
		
		for(int i = 0; i < productCnt; i++) {
			String temp = sc.nextLine();
			
			itemPrice[i] = Integer.parseInt(temp.split(" ")[0]);
			itemCnt[i] = Integer.parseInt(temp.split(" ")[1]);
		}
		for(int i = 0; i < productCnt; i++) {
			check += (itemPrice[i] * itemCnt[i]);
		}
		if(total == check) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
