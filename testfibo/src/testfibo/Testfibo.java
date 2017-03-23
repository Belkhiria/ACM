package testfibo;

import java.math.BigInteger;
import java.util.Scanner;

class Testfibo {

    public static void genFib(long n) {
        BigInteger arr1[][] = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        if (n == 0) {
            System.out.println("0");
        } else {
            power(arr1, n - 1);
            System.out.println(arr1[0][0]);
        }
    }

    private static void power(BigInteger arr1[][], long n) {
        if (n == 0 || n == 1) {
            return;
        }
        BigInteger arr2[][] = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        power(arr1, n / 2);
        multiply(arr1, arr1);
        if (n % 2 != 0) {
            multiply(arr1, arr2);
        }
    }

    private static void multiply(BigInteger arr1[][], BigInteger arr2[][]) {
        BigInteger x = ((arr1[0][0].multiply(arr2[0][0])).add(arr1[0][1].multiply(arr2[1][0]))).mod(BigInteger.valueOf((long) 1E9));
        BigInteger y = ((arr1[0][0].multiply(arr2[0][1])).add(arr1[0][1].multiply(arr2[1][1]))).mod(BigInteger.valueOf((long) 1E9));
        BigInteger z = ((arr1[1][0].multiply(arr2[0][0])).add(arr1[1][1].multiply(arr2[1][0]))).mod(BigInteger.valueOf((long) 1E9));
        BigInteger w = ((arr1[1][0].multiply(arr2[0][1])).add(arr1[1][1].multiply(arr2[1][1]))).mod(BigInteger.valueOf((long) 1E9));
        arr1[0][0] = x;
        arr1[0][1] = y;
        arr1[1][0] = z;
        arr1[1][1] = w;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int m = 0;
        while (T-- > 0) {
            m++;
            BigInteger ans = BigInteger.ZERO;
            long i = sc.nextInt();
            long k = sc.nextLong();

            System.out.print(m + " ");
            genFib(k);

        }

    }
}
