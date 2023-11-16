//https://javarush.com/quests/lectures/questsyntaxpro.level06.lecture05
// задача https://javarush.com/help?quest=QUEST_JAVA_SYNTAX&level=7&order=OLD&taskKey=com.javarush.task.pro.task06.task0605

/**
 * Правильный порядок **
 * Напишем утилиту для работы с массивами.
 * Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
 * Тебе осталась мелочь: реализовать метод reverseArray().
 * Он должен менять порядок элементов массива на обратный.
 */
package t2023;


public class Task {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printArray(array);
		reverseArray(array);
		printArray(array);
	}

	public static void reverseArray(int[] array) {
		int j = array[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			array[i] = j;
			j--;
		}


	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}


}
