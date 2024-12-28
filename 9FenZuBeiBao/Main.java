
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 105;
        int[] dp = new int[N]; //价值，某组第几个
        int[] S = new int[N];       //i组的个数
        int[][] V = new int[N][N];    //体积    
        int[][] W = new int[N][N];    //价值
        int n, v;
        n = sc.nextInt();
        v = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            int count = sc.nextInt();
            S[i] = count;
            for (int j = 0; j < count; ++j) {
                V[i][j] = sc.nextInt();
                W[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = v; j >= 0; --j) {
                for (int k = 0; k < S[i]; ++k) {
                    if (j >= V[i][k]) {
                        dp[j] = Math.max(dp[j], dp[j - V[i][k]] + W[i][k]);
                    }

                }
            }
        }
        System.out.println(dp[v]);

    }
}
