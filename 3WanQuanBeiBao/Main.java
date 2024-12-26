import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N, V;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        V = sc.nextInt();
        int[] volume = new int[N + 1];
        int[] weight = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            volume[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        sc.close();

        int[] dp = new int[V + 1];
        for (int line = 1; line <= N; ++line) {
            for (int col = volume[line]; col <= V; ++col) {
                dp[col] = Math.max(dp[col], dp[col - volume[line]] + weight[line]);
            }
        }
        System.out.println(dp[V]);
    }
}
