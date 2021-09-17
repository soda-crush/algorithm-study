package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_10844 {
    static Long[][] dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Long[n + 1][10];   // n + 1하는 이유는 첫번째(1) 자리, 두번째(2) 자리로 가독성 좋으라고

        for(int i = 0; i < 10; i++){
            dp[1][i] = 1L;
        }

        long result = 0;
        for(int i = 1; i < 10; i++){
            result += recur(n, i);
        }

        System.out.println(result);
    }

    static long recur(int digit, int val){  // digit 자릿수 _ _ _ _ , val 자릿값(0~9)

        if(digit == 1){
            return dp[digit][val];  // 1로 초기화 되어 있어서 탐색할 필요 없음
        }

        if(dp[digit][val] == null){ // null 체크하기 위해서 자료형을 long이 아니라 Long형을 사용
            if(val == 0){
                dp[digit][val] = recur(digit - 1, 1);
            }else if(val == 9){
                dp[digit][val] = recur(digit - 1, 8);
            }else{
                dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }
        }

        return dp[digit][val];
    }
}
