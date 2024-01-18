package ex13;

public class Ex02 {
	public static void main(String[] args) {
		InstClass ic = new InstClass();
		
		System.out.println(ic.num++);

		System.err.println(InstClass.num++);

		System.err.println(InstClass.num);
	}
}
