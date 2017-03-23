package pkg10689.yet.another.number.sequence;

import java.math.BigInteger;
import java.util.Scanner;

class YetAnotherNumberSequence {

    public static BigInteger[][] multMat2(BigInteger[][] m, BigInteger[][] n) {

        BigInteger[][] ret = {
            {BigInteger.ZERO, BigInteger.ZERO},
            {BigInteger.ZERO, BigInteger.ZERO}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    ret[i][j] = (ret[i][j]).add((m[i][k]).multiply(n[k][j]));
                }

                ret[i][j] = (ret[i][j]).mod(BigInteger.valueOf(10000));
            }
        }
        return ret;
    }

    public static BigInteger[][] multMat(BigInteger[][] m, BigInteger[][] n) {
        BigInteger a = (((m[0][0]).multiply(n[0][0])).add((m[0][1]).multiply(n[1][0]))).mod(BigInteger.valueOf(100000));
        BigInteger b = (((m[0][0]).multiply(n[0][1])).add((m[0][1]).multiply(n[1][1]))).mod(BigInteger.valueOf(100000));
        BigInteger c = (((m[1][0]).multiply(n[0][0])).add((m[1][1]).multiply(n[0][1]))).mod(BigInteger.valueOf(100000));
        BigInteger d = (((m[1][0]).multiply(n[0][1])).add((m[1][1]).multiply(n[1][1]))).mod(BigInteger.valueOf(100000));
        BigInteger[][] ret = {
            {a, b},
            {c, d}};
        return ret;
    }

    public static BigInteger[][] powMat(BigInteger[][] m, int n) {
        if (n == 1) {
            return m;
        } else {
            n = n - 1;
            BigInteger[][] ret = new BigInteger[2][2];
            ret = m;
            while (n-- > 0) {
                ret = multMat2(ret, m);

            }
            return ret;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            BigInteger[][] M = {
                {BigInteger.ONE, BigInteger.ONE},
                {BigInteger.ONE, BigInteger.ZERO}};
            M = powMat(M, n);
            BigInteger ans = BigInteger.ZERO;
            ans = ((M[1][0]).multiply(BigInteger.valueOf(b))).add((M[1][1]).multiply(BigInteger.valueOf(a)));
            if (m == 1) {
                System.out.println(ans.mod(BigInteger.valueOf(10)));
            }
            if (m == 2) {
                System.out.println(ans.mod(BigInteger.valueOf(100)));
            }
            if (m == 3) {
                System.out.println(ans.mod(BigInteger.valueOf(1000)));
            }
            if (m == 4) {
                System.out.println(ans.mod(BigInteger.valueOf(10000)));
            }

        }

    }

}
