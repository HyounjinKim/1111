package ex10;

public class Ex01 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int[][] brr = new int[5][5];
		
		doPointArr(arr);
		System.out.println(3);
		doPointArr(brr);
	}

	public static void doPointArr(int[][] arr) {
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = (int) (Math.random() * 100) + 1;
			}

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = (int) (Math.random() * 100) + 1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
