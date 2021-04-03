import java.util.*;
import java.io.*;

public class positiveInteger {
    static int res = 0;
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        int arr[] = { 0, 5, 6 };
        findnum(arr, 0, n);
        System.out.println(res);
    }

    public static void findnum(int[] arr, int curValue, int n) {
        if (len(curValue) == 3)
            return;
        for (int i = 0; i < arr.length; i++) {
            curValue = curValue * 10 + arr[i];
            if (set.contains(curValue))
                continue;
            set.add(curValue);
            if (curValue <= n)
                res++;
            findnum(arr, curValue, n);
            curValue -= arr[i];
            curValue /= 10;
        }
    }

    public static int len(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
