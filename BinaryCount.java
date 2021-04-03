import java.util.*;

public class BinaryCount {
    public static int binaryCount(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1)
                count++;
            n /= 2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = binaryCount(n);
        System.out.println(count);
        sc.close();
    }
}
