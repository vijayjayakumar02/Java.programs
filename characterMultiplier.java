import java.util.*;

public class characterMultiplier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                continue;
            char cur = s.charAt(i);
            int num = findNum(s, i + 1);
            for (int j = 0; j < num; j++) {
                res.append(cur);
            }
        }
        System.out.print(res.toString());
        sc.close();
    }

    public static int findNum(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                res.append(s.charAt(i));
            else
                break;
        }
        return Integer.valueOf(res.toString());
    }
}
