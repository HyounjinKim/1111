package ex04;

public class Ex111 {
	public static void main(String[] args) {
		
		String str1 = "aaaaa";
		String str2 = "bbbbb";		
		String answer = "";
		char ch3 = ' ';
		char ch4 = ' ';
		char[] ch1;
		char[] ch2;
		
		ch1 = str1.toCharArray();
		ch2 = str2.toCharArray();		
		
		//조건식 어떻게하지
		for(int i = 0; i < 5; i++) {
				ch3 = ch1[i];
				answer += String.valueOf(ch3);
				ch4 = ch2[i];
				answer += String.valueOf(ch4);
			}
		
		System.out.println(answer);
	}

}
