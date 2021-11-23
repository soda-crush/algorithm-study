package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2579 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[301];
        int[] dp = new int[301]; // 배열의 인덱스 = 계단위치, 해당 계단기준으로 얻을 수 있는 최대 점수
                                // 배열의 크기를 n으로 만들면 계단이 3 미만일 경우 따로 조건 분기를 안하면 Array 에러가 발생해서
                                // 그냥 조건에 300이하의 자연수라 해서 최대치인 300으로 생성함
        for(int i = 1; i <= n; i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];

        for(int i = 3; i < n + 1; i++){
            dp[i] = Math.max(dp[i-2], stairs[i-1] + dp[i-3]) + stairs[i];
        }

        System.out.println(dp[n]);
    }
}
