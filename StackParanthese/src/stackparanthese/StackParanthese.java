package stackparanthese;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.Scanner;
import java.util.Stack;

public class StackParanthese {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        while (true) {
            Stack<Character> p = new Stack<>();
            String st = sc.nextLine();
            if ((st.length()) % 2 == 1) {
                GOTO T;
            }

            if (st.charAt(0) == ')' | st.charAt(0) == ']' | st.charAt(0) == '}') {
                GOTO T;
            }
            if (st.charAt(st.length() - 1) == '(' | st.charAt(st.length() - 1) == '[' | st.charAt(st.length() - 1) == '{') {
                GOTO T;
            }
            p.push(st.charAt(0));
            for (i = 1; i < st.length(); i++) {
                p.push(st.charAt(i));
                if (st.charAt(i) == ')') {
                    p.pop();
                    if (p.pop() == '(') {
                        continue;
                    } else {
                        break;
                    }
                }
                if (st.charAt(i) == ']') {
                    p.pop();
                    if (p.pop() == '[') {
                        continue;
                    } else {
                        break;
                    }
                }
                if (st.charAt(i) == '}') {
                    p.pop();
                    if (p.pop() == '{') {
                        continue;
                    } else {
                        break;
                    }
                }
            }

            if (p.pop() == 'a') {
                System.out.println("Good");
            } else {
                T:
                System.out.println("Wrong");
            }
        }
    }
}
