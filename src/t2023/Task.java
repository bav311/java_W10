//https://javarush.com/quests/lectures/questsyntaxpro.level08.lecture00
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;

public class Task {
	public static void main(String[] args) {
		String a = "dermatoglyphics"; //true
		String a1 = "moose"; // false
		String a2 = "abba"; // false
		System.out.println(isIsogram(a));
		System.out.println(isIsogram(a1));
		System.out.println(isIsogram(a2));

	}

	public static boolean isIsogram(String str) {
		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length - 1; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count++;
				}
			}
		}
		return count != 0;
	}


}