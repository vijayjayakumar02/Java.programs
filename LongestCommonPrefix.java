import java.util.*;

public class LongestCommonPrefix {
    public static String CommonPrefix(String s[]) {
        if (s.length == 0)
            return "Empty";
        for (int i = 0; i < s[0].length(); i++) {
            char ch = s[0].charAt(i);
            for (int j = 1; j < s.length; j++) {
                if (i == s[j].length() || s[j].charAt(i) != ch)
                    return s[0].substring(0, i);
            }
        }
        return s[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        String res = CommonPrefix(s);
        System.out.println(res);
        sc.close();
    }
}
