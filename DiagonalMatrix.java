import java.util.*;

public class DiagonalMatrix {
    public static boolean isSameDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (i == j && arr[i][j] == arr[i + 1][j + 1])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean res = isSameDiagonal(arr);
        System.out.println(res);
        sc.close();
    }
}
