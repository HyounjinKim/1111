package ex04;

public class Ex07 {
	public static void main(String[] args) {
		
		String str1 = "He22oWor2d";
		String str2 = "lloWorl";
		int s = 2;
		char[] cs1;
		char[] cs2;
		
		cs1 = str1.toCharArray(); //10
		cs2 = str2.toCharArray(); //7
		
		for(int i = 0; i < cs2.length + 2; i++) {
			if(i >= s) {
				cs1[i] = cs2[i - s];	
			}			
		}
		String str = new String(cs1);
		System.out.println(str);
		
	}
}
