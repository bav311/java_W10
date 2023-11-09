//https://javarush.com/quests/lectures/questsyntaxpro.level06.lecture02
package t2023;

import java.util.Arrays;

public class Task {
	public static void fillArray (int[] [] data, int value) {
		for (int[] datum : data) {
			Arrays.fill(datum, value);
		}
	}

	public static void main(String[] args) {


		int[][] months = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
		System.out.println(Arrays.deepToString(months));
		fillArray(months,88);
		System.out.println(Arrays.deepToString(months));
	}
}