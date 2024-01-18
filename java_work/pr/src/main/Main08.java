package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main08 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer t;

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String T = br.readLine();
			t = new StringTokenizer(T);

			bw.write(Integer.parseInt(t.nextToken()) + Integer.parseInt(t.nextToken()) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
