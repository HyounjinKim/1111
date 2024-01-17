package ex12;

public class CircleBook {
	private int rad;
	final double PI = 3.14;

	public CircleBook(){};
	
	public CircleBook(int rad) {
		this.rad = rad;
	}
	
	public void setRad(int r) {
		this.rad = r;
		
		if(r < 0) {
			this.rad = 0; return; 
		}
		this.rad = r;
	}

	public double getArea() {
		return rad * rad * PI;
	}
}
