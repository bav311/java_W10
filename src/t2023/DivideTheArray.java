/*
Реализуй метод main(String[]), который делит массив array на два подмассива
и заполняет ими двумерный массив result.
Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
При тестировании значения полей класса Solution будут разными, учти это.
* */
package t2023;

import java.util.Arrays;

public class DivideTheArray {
	public static int[][] result = new int[2][];
	public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

	public static void main(String[] args) {

		result[0] = Arrays.copyOfRange(array, 0, array.length / 2 + array.length % 2);
		result[1] = Arrays.copyOfRange(array,array.length /2 + array.length % 2, array.length);


		for (int [] aa: result ) {
			System.out.println();
			for (int aaa : aa) {
				System.out.print(aaa + "\t");
			}
		}

	}
}