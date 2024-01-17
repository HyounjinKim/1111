package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Array04 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int index = 0;
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i = 0;i < 9;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			
			if(max < arr[i]) {
				max = arr[i];
				index = (i+1);
			}
			
		}
		System.out.println(max + "\n" + index);
	}

}
