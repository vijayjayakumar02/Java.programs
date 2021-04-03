import java.util.*;
import java.util.Map.Entry;

public class valuesByFrecuency {
    public static void arrangeArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        List<Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Entry<Integer, Integer> entry : list) {
            int frequency = entry.getValue();
            while (frequency >= 1) {
                System.out.print(entry.getKey() + " ");
                frequency--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arrangeArray(arr);
        sc.close();
    }
}