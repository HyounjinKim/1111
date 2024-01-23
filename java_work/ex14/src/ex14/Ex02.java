package ex14;

public class Ex02 {
	public static void main(String[] args) {
		
		AA a1 = new AA();
		a1.doA();
		a1.doA(3, 4);
		a1.doA("zzzz");
		
		AA.doB();
		AA.doB(5,6);
		AA.doB("xxxx");
	}
}
