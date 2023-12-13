//https://javarush.com/quests/lectures/questsyntaxpro.level08.lecture00
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;

import java.util.Arrays;

public class Task {
	public static void main(String[] args) {
		int[] nums = {-4, -1, 0, 3, 10}; //16,1,0,9,100
		System.out.println(Arrays.toString(sortedSquares(nums)));


	}

	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) Math.pow(nums[i], 2 );
		}
		Arrays.sort(nums);

		return nums;
	}
}
