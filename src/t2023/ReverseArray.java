package t2023;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the size the array");
        int size = scan.nextInt();
        if (size < 0) {
            System.out.println("archive cannot be negative");
        } else {
            int[] array = new int[size];
            if (size > 0) {
                System.out.println("Input the " + size + " numbers for write in array");
                for (int i = 0; i < array.length; i++) {
                    array[i] = scan.nextInt();
                }
                for (int j : array) {
                    if (j % 2 == 0) {
                        System.out.print(j + " ");
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 != 0) {
                        System.out.print(array[array.length - i - 1] + " ");
                    }
                }

            } else {
                System.out.println("archive cannot be empty");
            }
        }

    }
}
