
package pkg10334.ray.through.glasses;

import java.math.BigInteger;
import java.util.Scanner;

class RayThroughGlasses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger fib[] = new BigInteger[1001];
        fib[0] = BigInteger.ONE;
        fib[1] = BigInteger.valueOf(2);
        for (int i = 2; i < 1001; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(fib[n]);
        }
       
    }
    
}
