
import java.util.Scanner;

class Sums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();

            run(x);
        }

    }

    public static void run(int x) {
        double p;
        StringBuffer str = new StringBuffer();
        boolean test = false;
        if((x & (x - 1)) == 0){
            System.out.println("IMPOSSIBLE");
        }else{
        for (p = 2; p <= x / 2; p++) {
            double n = (x - (p * p - 1) / 2) * (1 / p);

            int nn = (int) (n + 1);

            if ((int) (p * nn + (((p * (p + 1)) / 2) - p)) == x) {

                str.append(x);
                str.append(" = ");
                for (int i = 0; i < p; i++) {
                    if (i < p - 1) {
                        str.append(nn + i);
                        str.append(" + ");
                    } else {
                        str.append(nn + i);
                    }

                }
                test = true;
                System.out.println(str);
                str.delete(0, str.length());

                break;
            }
        }

        }
        
    }

}
