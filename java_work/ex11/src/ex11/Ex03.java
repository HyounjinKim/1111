package ex11;

public class Ex03 {

	Ex03() {
		int[] arr = new int[] { 10, 20, 5, 2, 11 };
		
		ArrayU myU = new ArrayU();
		myU.sort(arr);
		myU.print(arr);
		myU.sum(arr);

	}

	public static void main(String[] args) {
		new Ex03();
	}

}
