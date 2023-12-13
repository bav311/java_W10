//https://javarush.com/quests/lectures/questsyntaxpro.level08.lecture00
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;

import java.util.Arrays;

public class NumberSplitInArray {
	public static void main(String[] args) {
		long x = 35231;
		System.out.println(Arrays.toString(digitize(x)));


	}

	public static int [] digitize (long n) {
		int [] arr = new int[String.valueOf(n).length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (n % 10);
			n /= 10;

		}

		return arr;
}

}