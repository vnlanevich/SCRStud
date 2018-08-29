package by.it.lanevich.scrstud01;

import java.util.Random;
import java.math.BigInteger;


public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1000);
        int m = random.nextInt(n + 1);
        System.out.println("n= " + n + ", m= " + m + ", Cnk= " + calc(n, m));
    }

    static BigInteger calc(int n, int m) {
        BigInteger Cnk = BigInteger.ONE;
        for (int k = 0; k < m - 1; k++) {
            Cnk = Cnk.multiply(BigInteger.valueOf(n - k - 1)).divide(BigInteger.valueOf(k + 1));
        }
        return Cnk;
    }
}
