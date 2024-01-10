package array;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int v = sc.nextInt();
		int[] A = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(str.split(" ")[i]);
						
			if(A[i] == v) {
				count++;
			}	
			
		}
		System.out.println(count);
	}

}
