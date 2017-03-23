package pkg10219.find.the.ways;

import java.math.BigInteger;
import java.util.Scanner;

public class FindTheWays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            
            double rst = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            for (long i = n - k + 1; i <= n; i++) {
                
                rst = rst + (double) Math.log10(i);
            }
            for (long i = 1; i <= k; i++) {
                
                rst = rst - (double) Math.log10(i);
            }
            System.out.println((int)(rst + 1));
        }
    }

}
