package ex06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int num = (60 + m - 45);
		
		if (m < 45) {			
			if(h == 0) {
				h = 23;
			}
			else if(m == 45){
				h = h;
			}
			else {
				h -= 1;
			}
		}		
		if((60 + m - 45) == 60) {
			num = 0;
		}
		System.out.println(h + " " + num);
	}

}
