package by.it.lanevich.scrstud01;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1000);
        int m = random.nextInt(1000);
        int nod;
        if (n > m) nod=fnod(m,n%m);
        else nod=fnod(n,m%n);
        System.out.println(n+" "+m+" НОД="+nod+" НОК="+(n*m)/nod);
     }
  static int fnod (int a, int b){
        return (b==0)?a:fnod(b,a%b);
    }
}
