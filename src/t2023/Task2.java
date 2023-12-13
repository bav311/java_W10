package t2023;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int [] array = new int[6];
		System.out.println(Arrays.toString(array));
		int length = 0;
		for (int i = 0; i < 4; i++) {
			array[length] = i;
			length++;
		}
		System.out.println(Arrays.toString(array));




	}
}