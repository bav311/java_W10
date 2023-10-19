package t2023;

import java.util.Arrays;
import java.util.Scanner;

public class MinInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input size array");
		int size = scan.nextInt();
		if (size > 0) {
			int[] array = new int[size];
			int min = array[0];
			System.out.println("Input the " + size + " numbers for write in array");
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
				if (array[i] < min) {
					min = array[i];
				}
			}
			System.out.println(Arrays.toString(array));
			System.out.println("Minimal number array >> " + min);

		} else {
			System.out.println("array cannot be less than 1");
		}

	}
}
