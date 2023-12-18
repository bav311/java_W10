//https://javarush.com/quests/lectures/questsyntaxpro.level06.lecture05
// помощь https://javarush.com/help
//задачи 7 уровня https://javarush.com/tasks?quest=QUEST_JAVA_SYNTAX&level=7&page=2

package t2023;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        // заменить \ на /
        String str = "E:\\Работа\\Скрипты Illustrator\\includes";
// 1 var
        char[] arrChar = str.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == '\\') {
                arrChar[i] = '/';
            }
        }
        String result = new String(arrChar); // I var - новый экземпляр класса
        String result1 = String.valueOf(arrChar); // II var - новый экземпляр класса
        System.out.println(str);
        System.out.println(result);
        System.out.println(result1);
        System.out.println("********************************");
// 2 var
        String[] arrayString = str.split("\\\\");
        System.out.println(Arrays.toString(arrayString));
        String resultArrayString = String.join("/",arrayString);
        System.out.println(resultArrayString);
        System.out.println("********************************");
// 3 var
        String resultReplase = str.replace("\\", "/"); //resultReplase -новый экземпляр класса
        System.out.println(resultReplase);



    }
}