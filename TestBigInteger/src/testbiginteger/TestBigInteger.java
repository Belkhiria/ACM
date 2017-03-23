package testbiginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class TestBigInteger {

    static public BigInteger ans(String sh, BigInteger fib[]) {
        BigInteger rst = BigInteger.ZERO;
        for (int i = 0; i < sh.length(); i++) {
            if (sh.charAt(i) == '1') {
                rst = rst.add(fib[sh.length() - 1 - i]);
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 103;
        BigInteger fib[] = new BigInteger[n];
        fib[0] = BigInteger.ONE;
        fib[1] = BigInteger.valueOf(2);
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        int test = 1;
        
        while (sc.hasNext()) {
            if (test == 2) {
                System.out.println("");
            }
            BigInteger ans = BigInteger.ZERO;

            String a = sc.nextLine();
            ans = ans(a, fib);
            a = sc.nextLine();
            ans = ans.add(ans(a, fib));
            test = 2;
            int test2 = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (ans.compareTo(fib[i]) >= 0) {
                    System.out.print("1");
                    ans = ans.subtract(fib[i]);
                    test2 = 1;
                } else if (test2 == 1) {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}
