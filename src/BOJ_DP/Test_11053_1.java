package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 동적계획법 : O(N^2)
public class Test_11053_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        String tmp = br.readLine();
        String[] tmpArr = tmp.split(" ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(tmpArr[i]);
        }

        int max = 1;

        for(int i = 0; i < n; i++){
            dp[i] = 1;  // 해당 위치를 1로 초기화
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
