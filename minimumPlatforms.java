import java.util.*;

public class minimumPlatforms {
    public static int minpos(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int maxi = 1;
        int needed = 1;
        int i = 1;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                maxi++;
                i++;
            } else if (arr[i] > dep[j]) {
                maxi--;
                j++;
            }
            needed = Math.max(maxi, needed);
        }
        return needed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dep[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            dep[i] = sc.nextInt();
        }
        int res = minpos(arr, dep, n);
        System.out.println(res);
        sc.close();
    }
}
