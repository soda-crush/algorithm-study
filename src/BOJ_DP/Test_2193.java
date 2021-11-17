package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2193 {
    static long[] dp = new long[91];  // int 자료형은 오버플로우 발생할 수 있음(자료형의 범위를 생각해보기) - 자료형 범위를 초과하여 수가 커지면 답이 음수로 나와서 long형으로 수정

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 반복문, 메모이제이션(시간복잡도 O(n))
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }

    // 재귀함수 : 입력값이 크다면 스택오버플로우를 발생시킬 수 있다(시간복잡도 O(2^n))
//    public static int recur(int n){
//        if(n == 1 || n == 2){
//            return 1;
//        }else{
//            dp[n] = recur(n - 1) + recur(n - 2);
//            return dp[n];
//        }
//    }
}
