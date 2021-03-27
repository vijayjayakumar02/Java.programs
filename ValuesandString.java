import java.util.*;

public class ValuesandString {
    public static int sumOf(String[][] s, int n, int m) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(s[i][j]);
            }
        }
        int sum = 0;
        for (String element : list) {
            try {
                int num = Integer.parseInt(element);
                sum += num;
            } catch (Exception e) {
                continue;
            }
        }
        return sum;
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static String letterIn(String[][] s, int n, int m) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(s[j][i]);
            }
        }
        String str = " ";
        for (String element : list) {
            if (isInteger(element)) {
                str += element;
            }

        }
        str = str.trim();
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s[][] = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s[i][j] = sc.next();
            }
        }
        int res = sumOf(s, n, m);
        String res1 = letterIn(s, n, m);
        System.out.println(res);
        System.out.println(res1);
        sc.close();
    }
}