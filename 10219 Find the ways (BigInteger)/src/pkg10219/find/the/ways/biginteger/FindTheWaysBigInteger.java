package pkg10219.find.the.ways.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

class FindTheWaysBigInteger {

    private static long memo[][] = new long[10000][10000];

    public static BigInteger nCk(BigInteger n, BigInteger k) {
        if (n.compareTo(k) == 0) {
            return BigInteger.ONE;
        }
        if (k.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ONE;
        }
        return (nCk(n.subtract(BigInteger.ONE), k.subtract(BigInteger.ONE))).add(nCk(n.subtract(BigInteger.ONE), k));
    }

    public static long longnCk(long n, long k) {
        if (n == k) {
            return 1;
        }
        if (k == 0) {
            return 1;
        }
        
        return (longnCk(n - 1, k - 1) + longnCk(n - 1, k));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println((int) (Math.log10(longnCk(n, k))) + 1);
        }
    }

}
