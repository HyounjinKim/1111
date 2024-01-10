package chap04;
import java.util.*;

class FlowEx8 {
	public static void main(String[] args) { 
		char gender;
		String regNo = "";

		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		gender = regNo.charAt(6); 

		switch(gender) {
			case '1':
				//System.out.println("1111");
			case '3':
				System.out.println("남자");
				break;
			case '2':
				//System.out.println("2222");
			case '4':
				System.out.println("여자");;
				break;
			default:
				System.out.println("5555");;
		}
	} // main�� ��
}
