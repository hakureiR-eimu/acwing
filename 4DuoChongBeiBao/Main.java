
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        int n, v;
        String[] line = reader.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        v = Integer.parseInt(line[1]);
        int[] a = new int[100005];      //重量
        int[] b = new int[100005];      //价值
        int count = 0;
        for (int i = 0; i < n; ++i) {
            line = reader.readLine().split(" ");
            for (int j = 0; j < Integer.parseInt(line[2]); ++j) {
                a[count] = Integer.parseInt(line[0]);
                b[count] = Integer.parseInt(line[1]);
                count++;
            }
        }

        int[] dp = new int[100005];
        for (int i = 0; i < count; ++i) {
            for (int j = v; j >= 0; --j) {
                if (j - a[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - a[i]] + b[i]);
                }
            }
        }
        System.out.println(dp[v]);
    }
}
