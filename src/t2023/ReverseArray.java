package t2023;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

		for (int j : array) {
			if (j % 2 == 0) {
				System.out.print(j + " ");
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[array.length - i -1] + " ");
			}
		}
	}
}
