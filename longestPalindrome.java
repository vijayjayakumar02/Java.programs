import java.util.*;

public class longestPalindrome {
    public static void print(String s, int start, int end) {
        System.out.println(s.substring(start, end + 1));
    }

    public static void longpal(String s) {
        int maxlength = 1;
        int start = 0;
        int low, high;
        for (int i = 1; i < s.length() - 1; i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxlength) {
                    start = low;
                    maxlength = high - low + 1;
                }
                low--;
                high++;
            }
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high <= s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low > maxlength) {
                    start = low;
                    maxlength = high - low + 1;
                }
                low--;
                high++;
            }
        }
        print(s, start, start + maxlength - 1);
        System.out.println("length:" + " " + maxlength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        longpal(s);
        sc.close();
    }
}
