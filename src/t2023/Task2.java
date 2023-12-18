package t2023;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int x = 92;
		System.out.println(Arrays.toString(reverse(x)));


	}

	public static int[] reverse(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n -i;
		}
		return arr;
	}


}