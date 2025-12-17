package set1;
import java.util.Scanner;

class helpfuulmath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') c1++;
            else if (s.charAt(i) == '2') c2++;
            else if (s.charAt(i) == '3') c3++;
        }

        String r = "";

        for (int i = 0; i < c1; i++) r += "1+";
        for (int i = 0; i < c2; i++) r += "2+";
        for (int i = 0; i < c3; i++) r += "3+";

        if (r.length() > 0)
            r = r.substring(0, r.length() - 1);

        System.out.print(r);
    }
}
