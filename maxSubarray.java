import java.util.*;

public class maxSubarray {
    public static void subArray(int[] arr, int n) {
        int current = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            int num = arr[i];
            current = Math.max(num, current + num);
            max = Math.max(max, current);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        subArray(arr, n);
        sc.close();
    }
}
