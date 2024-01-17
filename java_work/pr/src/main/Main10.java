package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main10 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str;
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 0;i < T; i++) {
			str = new StringTokenizer(bf.readLine());
			
			int A = Integer.parseInt(str.nextToken());
			int B = Integer.parseInt(str.nextToken());
			
			bw.write("Case #" + (i + 1) + ": " + 
					 A + " + " + B + " = " + (A + B)
					 + "\n");
		}
		bw.flush();
		bw.close();
	}
}
