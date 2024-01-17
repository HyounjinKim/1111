package main;

import java.util.Scanner;

public class Main16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int tmp1;
		int tmp2;
		
		for(int i = 0; i < N; i++) {
			arr[i] += sc.nextInt();			
		}
		for(int i = 0; i < N; i++) {	
			if(i == N-1) {
				break;
			}
			if(arr[i] > arr[i+1]) {
				tmp1 = arr[i+1];
				tmp2 = arr[i];
			}
			else if(arr[i] < arr[i+1]) {
				tmp1 = arr[i];
				tmp2 = arr[i+1];
				System.out.println(tmp1 + " " + tmp2);
			}			
		}		
	}
}
