package chap04;

import java.net.MulticastSocket;
import java.util.*;

class FlowEx7 {
	public static void main(String[] args) {
		int user, com;

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		user = Integer.parseInt(tmp);

		// Math.random()
		// 0<x<1
		// 0<x<3
		// 0.00000001
		// 2.99999999
		// com 1~3 중에 1,2,3 3,2,1
		
		com = (int) (Math.random() * 3) + 1;
		System.out.println(com);

		switch (user - com) {
		case 2: case -1:
			System.out.println("user - com = 2 또는 -1");
			break;
		case 1:	case -2:
			System.out.println("user - com = 1 또는 -2");
			break;
		case 0:
			System.out.println("user - com = 0");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
