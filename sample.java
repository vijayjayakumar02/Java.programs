import java.util.*;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String str[] = S.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(Integer.valueOf(str[i]));
        }
        System.out.print(list);
        sc.close();
    }
}
