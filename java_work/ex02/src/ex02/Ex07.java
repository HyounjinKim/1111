package ex02;

import java.util.Scanner;

class AA{
	public void doA() {
		System.out.println("AA.doA()");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		
		//참조형 타입 변수 선언
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 하세요");
		String inpuString = scan.nextLine();
		System.out.println(inpuString);
		
		//참조형 타입 변수 선언
		AA aa = new AA();
		aa.doA();
		
	}

}
