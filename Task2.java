package by.it.lanevich.scrstud01;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1000);
        System.out.println(n);
        if (n <= 10) System.out.println("Мало");
        else if (n <= 100) System.out.println("Хватит");
            else System.out.println("Много");

    }
}
