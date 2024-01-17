package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array04 {
	public static int[] solution(int[] arr) {
		int[] stk = {};
		List<Integer> list = new ArrayList();
		int i = 0;

		while (i < arr.length) {
			if(list.size() == 0) {
				list.add(arr[i]);
				i++;
			}
			else {
				int last = list.get(list.size()-1);
				if(list.size() != 0 && last < arr[i]) {
					list.add(arr[i]);
					i++;
				}
				else if(list.size() != 0 && last >= arr[i]) {
					list.remove(list.size()-1);
				}
			}
		}
		stk = new int[list.size()];
		for(int j = 0; j < list.size();j++) {
			stk[j] = list.get(j);
		}
		System.out.println(Arrays.toString(stk));
		return stk;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 5, 3 };
		solution(arr);
	}

}
