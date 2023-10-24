package t2023;
import java.util.Scanner;

public class GreateMulniArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input rows array ");
        int rows = scan.nextInt();
        multiArray = new int[rows][];
        System.out.println("Input column array ");
        for (int i = 0; i < multiArray.length; i++) {
            int column = scan.nextInt();
            multiArray[i] = new int[column];

        }


        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();

        }


    }
}
