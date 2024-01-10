package ex07;

public class Ex07 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		String s = "abcdef";
		System.out.println(s.length());
		
		for(int i=0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		int sum = 0;
		
		for(int temp : arr) {
			System.out.println(temp);
			sum += temp;
		}
		System.out.println(sum);
		
		System.out.println();
		
		String[] arr1 = {"aa","bb","cc","dd"};
		
		String sumstr = "";
		
		for(String temp : arr1) {
			System.out.println(temp);
			sumstr += temp;
		}
		System.out.println(sumstr);
	}
}
