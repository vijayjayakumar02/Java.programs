import java.util.*;

public class searchInsertPosition {
    public static int SearchandInsert(int arr[], int target) {
        if (target <= 1)
            return 0;
        int res = 0;
        if (target > arr[arr.length - 1])
            return res = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                res = i;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < target && arr[i + 1] > target) {
                res = i + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = SearchandInsert(arr, target);
        System.out.println(res);
        sc.close();
    }

}
