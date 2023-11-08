//https://javarush.com/quests/lectures/questsyntaxpro.level09.lecture03
package t2023;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner("wqewqe/qwewqeqwe/qwewqeqe/a");
		String path = scan.nextLine();
		// var 1
		char[] chars = path.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '/') {
				chars[i] = '\\';
			}
		}
		String pathNew = new String(chars);
		System.out.println(pathNew);
		System.out.println();

		// var 2
		String[] array = path.split("/");
		String pachNew2 = String.join("\\", array);
		System.out.println(pachNew2);
		System.out.println();

		//var 3
		String pachNew3 = path.replace('/','\\');
		System.out.println(pachNew3);


	}
}