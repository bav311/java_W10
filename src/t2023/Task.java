//https://javarush.com/quests/lectures/questsyntaxpro.level09.lecture02
package t2023;

import java.util.Random;

public class Task {

    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(6)+1;

        switch (answer) {
            case 1:System.out.println("Бесспорно1"); break;
            case 2:System.out.println("Бесспорно2"); break;
            case 3:System.out.println("Бесспорно3"); break;
            case 4:System.out.println("Бесспорнo4"); break;
            case 5:System.out.println("Бесспорно5"); break;
            case 6:System.out.println("Бесспорно6"); break;



        }


    }
}