
import java.math.BigInteger;
import java.util.Scanner;

class ImmortalPorpoises {

    public static long fibo(long n) {
        switch ((int) n) {
            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            default: {
                if (n % 2 == 0) {

                    return ((2 * fibo(n / 2 - 1) * fibo(n / 2) + fibo(n / 2) * fibo(n / 2)) % ((long) 1E9));
                } else {
                    return ((fibo(n / 2) * fibo(n / 2) + fibo(n / 2 + 1) * fibo(n / 2 + 1)) % ((long) 1E9));
                }
            }
        }
    }

    public static long[][] longmultMat(long[][] m, long[][] n) {

        long[][] ret = {
            {0, 0},
            {0, 0}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    ret[i][j] = ret[i][j] + m[i][k] * n[k][j];
                    ret[i][j] = ret[i][j] % ((long) (1E9));
                }

            }
        }
        return ret;
    }

    public static void log2powmat(long arr1[][], long n) {
        if (n == 0 || n == 1) {
            return;
        }
        long arr2[][] = {{1, 1}, {1, 0}};
        log2powmat(arr1, n / 2);
        longmultMat(arr1, arr1);
        if (n % 2 != 0) {
            longmultMat(arr1, arr2);
        }
    }

    public static long[][] bestpowmat(long[][] m, long n) {
        if (n == 1) {
            return m;
        }
        long[][] A = {
            {1, 0},
            {0, 1}};
        while (n > 0) {
            if (n % 2 == 1) {
                A = longmultMat(m, A);
                n = n / 2;
            }
            if (n > 0) {
                m = longmultMat(m, m);
            }

        }
        return A;
    }

    public static long[][] longpowMat(long[][] m, long n) {
        long[][] B = {
            {1, 0},
            {0, 1}};
        long[][] M = {
            {1, 1},
            {1, 0}};
        if (n == 1) {
            return m;
        } else {
//            n = n - 1;
            long[][] ret = new long[2][2];
            ret = m;
            while (n-- > 0) {
                B = longmultMat(B, M);
            }
            return B;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[][] M = {
            {1, 1},
            {1, 0}};
        long[][] B = {
            {1, 0},
            {0, 1}};
        int T = sc.nextInt();
        int m = 0;
        while (T-- > 0) {
            m++;

            long i = sc.nextInt();
            long k = sc.nextLong();

            long ans = fibo(k);
            System.out.print(m + " ");
            System.out.println(ans);

        }

    }
}
