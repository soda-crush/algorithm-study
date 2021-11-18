package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_9465 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][n+1]; // 스티커 위치 별 값을 저장
            int[][] dp = new int[2][n+1];   // 해당 index 부분을 선택했을 때 나올 수 있는 최댓값을 저장 int[0][2]이면 윗줄, 두번째 칸에 있는 값을 선택했을 경우의 최대값

            for(int j = 0; j < 2; j++){ // 스티커판 값 채우기
                String tmp = br.readLine();
                String[] arr = tmp.split(" ");
                for(int k = 0; k < arr.length; k++){
                    stickers[j][k + 1] = Integer.parseInt(arr[k]);
                }
            }

            // 여기서부터 각 자리별 최대값 계산하기

            // n-2 값부터 계산이 가능하므로 0 index값은 초기값 설정
            dp[0][0] = 0;
            dp[1][0] = 0;

            dp[0][1] = stickers[0][1];
            dp[1][1] = stickers[1][1];

            // 0행 -> 1행 순서가 아니라 0열(1행,2행) 1열(1행,2행) 순서로 가야 이전에 계산된 dp값 사용이 가능하다,
            for(int k = 2; k < n + 1; k++){
                for(int j = 0; j < 2; j++){
                    if(j == 0){ // 스티커 윗줄
                        dp[j][k] = stickers[j][k] + Math.max(dp[j+1][k-2], dp[j+1][k-1]);
                    }else{      // 스티커 아랫줄
                        dp[j][k] = stickers[j][k] + Math.max(dp[j-1][k-1], dp[j-1][k-2]);
                    }
                }
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}
