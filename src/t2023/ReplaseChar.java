//https://javarush.com/quests/lectures/questsyntaxpro.level08.lecture00
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;

public class ReplaseChar {
	public static void main(String[] args) {
		String str = "45385593107843568aaasdsad";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < '5') {
				arr[i] = '0';
			}
			if (arr[i] >= '5') {
				arr[i] = '1';
			}
		}
		String res = String.valueOf(arr);
		System.out.println(res);

		System.out.println(fakeBin(str));
		System.out.println(fakeBin1(str));


	}

	public static String fakeBin(String str) {
		final char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			c[i] = c[i] < '5' ? '0' : '1';
		}
		return new String(c);

	}

	public static String fakeBin1(String numberString) {
		return numberString.replaceAll("[0-4]", "0")
				.replaceAll("[5-9]", "1")
				.replaceAll("[a-z]","*");
	}

}