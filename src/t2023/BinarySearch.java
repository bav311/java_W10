//https://javarush.com/quests/lectures/questsyntaxpro.level06.lecture05
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 8, 35, 40, 41, 44, 56, 65, 94};

        printArr(arr);
        System.out.println();
        System.out.println(binarySearch(arr,94));



    }

        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid; // Найден, возвращаем индекс
                } else if (arr[mid] > target) {
                    right = mid - 1; // Целевой элемент находится в левой половине
                } else {
                    left = mid + 1; // Целевой элемент находится в правой половине
                }
            }

            return -1; // Элемент не найден
        }





    private static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
