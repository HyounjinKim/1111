package ex08;

public class Ex03 {
	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// for(int i = 0;i < 100;i++) {
		// System.out.println((int)(Math.random() * 45));
		a = (int) (Math.random() * 45) + 1;
		b = (int) (Math.random() * 45) + 1;
		c = (int) (Math.random() * 45) + 1;
		// }

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a==b || a==c || b==c);
	}

}
