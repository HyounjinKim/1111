package ex11;

public class ArrayU {
	public void sort(int[] arr) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public void print(int[] arr) {
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	public void sum(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("\n"+sum);
	}
}
