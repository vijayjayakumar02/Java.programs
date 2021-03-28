import java.util.*;

public class RemovingDuplicates {
    public static HashSet<Integer> remdup(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> n1 = remdup(arr);
        System.out.println(n1.size() + " " + n1);
        sc.close();
    }
}
