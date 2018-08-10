package by.it.lanevich.scrstud01;

public class Task1 {

    public static void main(String[] args) {
        int from = 0;
        int to = 1000;
        System.out.println("Числа кратные 3:");
        int j = 0;
        for (int i = from; i < to; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                j++;
                if (j % 20 == 0) System.out.println();
            }
        }
    }
}
