package pr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main09 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str;

		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {
			str = new StringTokenizer(bf.readLine());

			bw.write("Case #" + (i+1) + ": " + (Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()))
					+ "\n");
		}

		bw.flush();
		bw.close();

	}

}
