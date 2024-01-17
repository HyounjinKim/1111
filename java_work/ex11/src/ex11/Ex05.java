package ex11;

public class Ex05 {
	public static void main(String[] args) {

		Data d1 = new Data();
		Ex05 ex05 = new Ex05();
		Data d2 = ex05.copy(d1);

		d2.x = 100;
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
	}

	Data copy(Data d) {
		Data data = new Data();
		return data;
	}
}

class Data {
	int x = 10;

	@Override
	public String toString() {
		return "Data [x=" + x + "]";
	}

}
