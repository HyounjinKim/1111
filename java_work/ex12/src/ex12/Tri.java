package ex12;

public class Tri {
	int w;
	int h;

	public Tri() {	};

	public Tri(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double area() {
		
		return w * h * 0.5;
	}

	@Override
	public String toString() {
		return "Tri [w=" + w + ", h=" + h + "]";
	}
}
