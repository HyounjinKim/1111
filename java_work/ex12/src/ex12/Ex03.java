package ex12;

public class Ex03 {
	public static void main(String[] args) {
		CircleBook c1 = new CircleBook();
		c1.setRad(10);
		
		//System.out.println(c1.rad);
		System.out.println(c1.getArea());
		
		CircleBook c2 = new CircleBook(20);
		System.out.println(c2.getArea());
		
		//c1.rad = -3;
		c1.setRad(-3);
	}
}
