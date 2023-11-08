package t2023;

public class MultiTable {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table.length; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println("\t");

        }

    }


}
