import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class diamondPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = reader.read();
        int space = n - 1;
        for (int i = 0; i < n; i++) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }
        space = 1;

        // run loop (parent loop)
        // till number of rows
        for (int i = n - 1; i > 0; i--) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }
    }
}
