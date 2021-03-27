import java.util.*;

public class InterchangingTheStrings {
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                || c == 'U') {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (isVowel(s1.charAt(i))) {
                count++;
                int count1 = 0;
                for (int j = 0; j < s2.length(); j++) {
                    if (isVowel(s2.charAt(j))) {
                        count1++;
                        if (count == count1) {
                            char temp = ch1[i];
                            ch1[i] = ch2[j];
                            ch2[j] = temp;
                        }
                    }
                }
            }
        }
        System.out.print(ch1);
        sc.close();
    }
}
