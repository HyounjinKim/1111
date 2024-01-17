package ex11;

public class Ex11 {
	public static void main(String[] args) {
		hiEveryOne("홍길동", 12, "남자");
		
		Person p1 = new Person("이길동",null,"남자",null,20);
		
		
//		p1.initValue("이길동", 20, "여자");
//		p1.name = "이길동";
//		p1.age = 20;
//		p1.gender = "여자";
		
		hiEveryOne(p1);
	}

	static void hiEveryOne(Person p) {
		System.out.println("안녕하세요 " +p. name + "님");
		System.out.println("저는 " + p.age + "세 입니다");
		System.out.println("성별은 " + p.gender + "입니다");
	}
	
	static void hiEveryOne(String name, int age, String gender) {
		System.out.println("안녕하세요 " + name + "님");
		System.out.println("저는 " + age + "세 입니다");
		System.out.println("성별은 " + gender + "입니다");
	}

}
