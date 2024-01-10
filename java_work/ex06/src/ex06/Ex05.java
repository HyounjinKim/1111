package ex06;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String hm = sc.nextLine();

		int h = Integer.parseInt(hm.split(" ")[0]);
		int m = Integer.parseInt(hm.split(" ")[1]);

		int t = sc.nextInt();

		m = m + t;

		if (m >= 60) {
			h += m / 60;
			m = m % 60;
		}
		if (h >= 24) {
			h %= 24;
		}
		System.out.println(h + " " + m);
	}

}
