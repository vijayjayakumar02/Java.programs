import java.util.Scanner;

public class ToeplitzMatrix {
    public static boolean isDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[0].length - 1; j++) {
                if (i > 0 && j > 0 && arr[i + 1][j + 1] == arr[i][j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean res = isDiagonal(arr);
        System.out.println(res);
        sc.close();
    }
}
