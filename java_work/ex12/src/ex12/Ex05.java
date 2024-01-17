package ex12;

class CapA {
	public void take() {
		System.out.println("CapA 약 기침 나옴");
	}
}

class CapB {
	public void take() {
		System.out.println("CapA 약 콧물 나옴");
	}
}

class CapC {
	public void take() {
		System.out.println("CapA 약 열 안남");
	}
}

class ColdPatient {
	void takeA(CapA a) {
		a.take();
	}

	void takeB(CapB b) {
		b.take();
	}

	void takeC(CapC c) {
		c.take();
	}

	void takeAll(CapA a, CapB b, CapC c) {
		a.take();
		b.take();
		c.take();
	}
}

public class Ex05 {
	public static void main(String[] args) {

		ColdPatient cp = new ColdPatient();

		cp.takeAll(new CapA(), new CapB(), new CapC());
	}
}
