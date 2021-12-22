package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2156 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wines = new int[10001];
        int[] dp = new int[10001];
        for(int i = 1; i < n + 1; i++){  // 포도주의 양
            wines[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wines[1];
        dp[2] = wines[1] + wines[2];

        for(int i = 3; i < n + 1; i++){
            dp[i] = Math.max((Math.max(dp[i-2], dp[i-3] + wines[i-1]) + wines[i]), dp[i-1]);
        }

        System.out.println(dp[n]);


    }
}
