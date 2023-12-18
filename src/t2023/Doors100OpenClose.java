package t2023;

import java.util.Arrays;

public class Doors100OpenClose {

	public static void main(String[] args) {
		boolean[] door = new boolean[101];
		System.out.println(Arrays.toString(door));

		for (int j = 1; j < 101; j++) {
			for (int i = 1; i < door.length; i++) {
				if (i % j == 0) {
					door[i] = !door[i];
				}
			}
		}
		System.out.println(Arrays.toString(door));


		for (int i = 1; i < door.length; i++) {
			if (door[i]) {
				System.out.print(i + " ");
			}

		}


	}
}