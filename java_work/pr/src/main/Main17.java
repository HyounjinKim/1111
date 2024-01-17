package main;

import java.util.Scanner;

public class Main17 {
	public static class Solution {
		public String solution(int[] numLog) {
			String answer = "";
			return answer;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int i = sc.nextInt();
		
		aa:while(true) {
			switch (i) {
			case -10: {
				count += 1;
				break;
			}
			case 0: {
				count -= 1;
				break;
			}
			case 1: {
				count += 10;
				break;
			}
			case -1: {
				count -= 10;
				break;
			}
			default:
				
				break aa;
			}
		}		
		

	}
}
