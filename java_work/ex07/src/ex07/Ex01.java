package ex07;


/*
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

	"He11oWor1d"		"lloWorl"	2	"HelloWorld"
	"Program29b8UYP"	"merS123"	7	"ProgrammerS123"
	
 */
public class Ex01 {
	
	// length 길이를 구하는 함수
	// subString 문자열을 자르는 함수, 
	// 매개변수 start 시작점부터 짤ㄹ라
	// 매개변수 start,end start부터 end까지
	// abcdef.subString(3) cdef
	// abcdef.subString(3,5) cd
	public static String solution(String my_string,
								  String overwrite_string,
								  int s) {
		// my_string = He11oWor1d 길이 = 10
		// over
		
		String temp = my_string.substring(0, s) + overwrite_string;
		System.out.println(temp);
		String result = temp + my_string.substring(temp.length());

		System.out.println(my_string.substring(temp.length()));
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		solution("He11oWor1d", "lloWorl", 2);
		solution("Program29b8UYP", "merS123", 7);
	}
}
