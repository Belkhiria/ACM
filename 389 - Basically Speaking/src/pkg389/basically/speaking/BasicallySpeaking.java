package pkg389.basically.speaking;

import java.math.BigInteger;
import java.util.Scanner;

public class BasicallySpeaking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String SBI = sc.next();

            int cb = sc.nextInt();
            int nb = sc.nextInt();
            BigInteger BI = new BigInteger(SBI, cb);
            String BIC = BI.toString(nb);

            if (BIC.length() > 7) {
                System.out.println("  ERROR");
            } else {
                StringBuffer rst = new StringBuffer("       ");
                for (int i = BIC.length() - 1; i >= 0; i--) {
                    rst.setCharAt(rst.length() - 1 - (BIC.length() - i - 1), BIC.charAt(i));
                }
                System.out.println(rst.toString().toUpperCase());
            }

        }
    }
}
