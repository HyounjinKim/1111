package ex10;

public class Ex04 {
	public static void main(String[] args) {
		// 배열은 기본형 타입의 배열이면 0으로 초기화
		// 참조형 타입은 null 값으로 초기화

		Tv[] tv = new Tv[100];

		// 인스턴스화
		for (int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
		}

		System.out.println(tv[0].channel);
		System.out.println(tv[1].power);
		System.out.println(tv[2].color);

		Integer[] a = new Integer[10];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		String[] c = new String[10];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	}

}
