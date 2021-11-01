package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_11057 {
    static Integer[][] dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[1001][10];     // 가독성을 위해 n + 1로 초기화
        int result = 0;

        for(int i = 0; i < 10; i++){
            dp[1][i] = 1;               // 한자리수 일 경우 모든 값 1로 초기화
        }

        for(int i = 0; i < 10; i++){
            result += recur(n, i);
        }

        System.out.println(result % 10007);
    }

    static int recur(int n, int val){
        if(n == 1){
            return dp[1][val];
        }else if(val == 0){
            return 1;
        }else{
            if(dp[n][val] == null){
                dp[n][val] = (recur(n - 1, val) + recur(n, val - 1)) % 10007;
            }
            return dp[n][val];
        }
    }
}
