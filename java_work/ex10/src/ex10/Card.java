package ex10;

public class Card {
	String kind;
	int num;
	static int WIDTH;
	static int HEIGHT;

	public static void main(String[] args) {

		System.out.println("카드 넓이 = " + Card.WIDTH);
		System.out.println("카드 높이 = " + Card.HEIGHT);

		Card c1 = new Card();
		c1.kind = "소나무";
		c1.num = 10;

		Card c2 = new Card();
		c2.kind = "세잎클로버";
		c2.num = 5;
		
		Card.WIDTH = 100;
		Card.HEIGHT = 200;

		System.out.println("c1.kind = " + c1.kind + "\n" + "c1.num = " + c1.num);
		System.out.println("c2.kind = " + c2.kind + "\n" + "c2.num = " + c2.num);
		
		System.out.println("카드 넓이 = " + Card.WIDTH);
		System.out.println("카드 높이 = " + Card.HEIGHT);
	}
}
