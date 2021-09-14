package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_11727 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++){
            dp[i] = dp[i - 1] + 2 * dp[i - 2];
            dp[i] = dp[i] % 10007;
        }

        System.out.println(dp[n]);
    }
}
