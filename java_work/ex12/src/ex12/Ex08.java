package ex12;

class Point {
	int xPos, yPos;

	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void showPointInfo() {
		System.out.println("[ xPos = " + xPos + "] [ yPos = " + yPos + " ]");
	}
}

class Circle {
	Point p;
	int rad;

	Circle(Point p, int rad) {
		this.p = p;
		this.rad = rad;
	}

	public void showCircleInfo() {
		p.showPointInfo();
		System.out.println("[ rad = " + rad + " ] ");
	}
}

public class Ex08 {
	public static void main(String[] args) {
		Point p1 = new Point(5, 10);
//		p1.showPointInfo();

		Circle c = new Circle(p1, 5);

		c.showCircleInfo();
		
		int d = 20;
		Point p3 = new Point(10,2);
		
		Circle cte = new Circle(p3,d);
	}
}
