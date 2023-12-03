//https://javarush.com/quests/lectures/questsyntaxpro.level08.lecture00
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;


import java.util.Arrays;
import java.util.StringTokenizer;

public class Task {
	public static String[] arr = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("fsdf ds df d dsf adsf", " ");

		printArr(arr);

	}

	public static void printArr(String[] arr) {
		for (String i : arr) {
			System.out.println(i);
		}
	}

}