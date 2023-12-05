//https://javarush.com/quests/lectures/questsyntaxpro.level08.lecture00
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;

import java.util.Arrays;

public class Task {
	public static void main(String[] args) {
		String str = "но все же интересное решение";
		int x = str.indexOf("же");//7 - первое вхожение "же"
		String [] arrray = str.split("е", 9); //Разделние строки по букве е в массив
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		int sum = 0; // сумма всеx е в строке
		for (int i = 0; i < str.length(); i++) { // Возвращает символ, который стоит на index-позиции в строке.
			if (str.charAt(i) == 'е') {
				sum++;
			}
		}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



//		for (int i : str) {
//			if (str.charAt(i) == 'e') {
//				sum++;
//			}
//		}

		System.out.println("Repeat symbl \"e\" in string " + "\"" + str + "\" ---> " + sum);
		char[] word = str.toCharArray();
		printArr(word);


	}


	public static void printArr(String[] arr) {
		for (String i : arr) {
			System.out.print(i + ",");
		}
	}

	public static void printArr(char[] arr) {
		for (char i : arr) {
			System.out.print(i + ",");
		}
	}


}