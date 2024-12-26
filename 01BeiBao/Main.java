import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n, v;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();       //物品数量
        v = sc.nextInt();       //总容量
        int[] V = new int[n + 1];   //体积
        int[] W = new int[n + 1];   //价值
        for (int i = 1; i <= n; ++i) {
            V[i] = sc.nextInt();
            W[i] = sc.nextInt();
        }
        sc.close();
//        int[][] dp = new int[n + 1][v + 1];
//        for (int line = 1; line <= n; ++line) {
//            for (int col = 1; col <= v; ++col) {
//                if (col - V[line] >= 0)
//                    dp[line][col] = Math.max(dp[line - 1][col], dp[line - 1][col - V[line]] + W[line]);
//                else dp[line][col] = dp[line - 1][col];
//            }
//        }
//        System.out.println(dp[n][v]);
        int[] dp = new int[v + 1];
        for (int line = 1; line <= n; ++line) {
            for (int col = v; col >= V[line]; --col) {
                dp[col] = Math.max(dp[col], dp[col - V[line]] + W[line]);
            }
        }
        System.out.println(dp[v]);
    }
}
