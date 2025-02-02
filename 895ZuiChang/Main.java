import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; ++i) {
            input[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        Arrays.fill(dp, 1);
        int max = 0;
        for (int i = 0; i < N; ++i) {
            //int max = 0;
            int num = input[i];
            for (int j = i; j >= 0; --j) {
                if (input[j] < num && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
            //dp[i] = max;
        }
        System.out.println(max);
    }
}
