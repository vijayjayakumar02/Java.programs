import java.util.*;

public class transposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int[][] arr = new int[C][R];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int arr[][] = transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(arr));
        sc.close();
    }
}
