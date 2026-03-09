package Synergech;
import java.util.*;

public class ProductSerialCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();

        if (st.length() != 7) {
            System.out.print("Invalid Product code");
            return;
        }

        char c1 = st.charAt(0);
        char c2 = st.charAt(1);

        if (!(c1 >= 'A' && c1 <= 'Z' && c2 >= 'A' && c2 <= 'Z') || c2 - c1 == 1) {
            System.out.print("Invalid Product code");
            return;
        }

        int sum = 0;
        boolean zero = false;
        Set<Character> set = new HashSet<>();

        for (int i = 2; i <= 5; i++) {
            char c = st.charAt(i);
            if (!Character.isDigit(c) || set.contains(c)) {
                System.out.print("Invalid Product code");
                return;
            }
            set.add(c);
            int d = c - '0';
            sum += d;
            if (d == 0)
                zero = true;
        }

        if (sum % 2 != 0) {
            System.out.print("Invalid Product code");
            return;
        }

        char sp = st.charAt(6);
        if (sp != '@' && sp != '#' && sp != '$' && sp != '%' && sp != '&') {
            System.out.print("Invalid Product code");
            return;
        }

        if (sp == '$' && zero) {
            System.out.print("Invalid Product code");
            return;
        }

        System.out.print("Valid Product code");
    }
}
