

import java.util.*;

public class binaryString {

    static List<String> result = new ArrayList<>();

    public static void generate(char[] curr, int pos, int n) {

        if (pos == n) {
            result.add(new String(curr));
            return;
        }

        curr[pos] = '0';
        generate(curr, pos + 1, n);

        curr[pos] = '1';
        generate(curr, pos + 1, n);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char curr[] = new char[n];
        generate(curr, 0, n);

        System.out.println("get result: " + result);
    }
}