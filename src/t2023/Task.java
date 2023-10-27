//https://javarush.com/quests/lectures/questsyntaxpro.level05.lecture07
//https://javarush.com/groups/posts/mnogomernye-massivy#%D0%94%D0%B2%D1%83%D0%BC%D0%B5%D1%80%D0%BD%D1%8B%D0%B5-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D1%8B
package t2023;
/*
Реализуй статический метод main(String[]), который заполняет массив array значениями
valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart,
а вторую — valueEnd. Если длина массива нечётная, то первую большую часть заполнить значениями valueStart,
вторую меньшую — valueEnd.
Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса Solution будут разными, учти это.
*/

import java.util.Arrays;

public class Task {
    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        Arrays.fill(array, 0, array.length / 2 + (array.length % 2), valueStart);
        Arrays.fill(array, array.length / 2 +(array.length % 2), array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}