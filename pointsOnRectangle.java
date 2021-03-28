import java.util.*;

public class pointsOnRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N * 2];
        for (int i = 0; i < N * 2; i++) {
            arr[i] = sc.nextInt();
        }
        int r1, r2, c1, c2;
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int count = 0;
        int minRow = r1 > r2 ? r2 : r1;
        int minCol = c1 > c2 ? c2 : c1;
        int maxRow = r1 > r2 ? r1 : r2;
        int maxCol = c1 > c2 ? c1 : c2;
        for (int i = 0; i < N * 2; i += 2) {
            int row = arr[i];
            int col = arr[i + 1];
            if (row >= minRow && row <= maxRow && col >= minCol && col <= maxCol) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
