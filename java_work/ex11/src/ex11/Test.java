package ex11;

public class Test {
	public static void main(String[] args) {

		System.out.println(doA(5));
	}

	public static int doA(int a) {
		if (a > 0) {
			return 2 * doA(a - 1);
		} else
			return 1;

	}

}
