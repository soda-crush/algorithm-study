package BOJ_DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 동적계획법 : O(NlogN), 이분탐색 활용
public class Test_11053_2 {
    static int n;
    static int[] arr, dp;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];

        String tmp = br.readLine();
        String[] tmpArr = tmp.split(" ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(tmpArr[i]);
        }

        int result = 0;

        for(int i = 0; i < n; i++){
            int idx = BinarySearch(arr[i], 0, result); // low와 high의 인덱스는 만들어지는 dp 수열의 길이

            if(idx == -1){
                dp[result++] = arr[i];
            }else{
                dp[idx] = arr[i];
            }
        }
        System.out.println(result);
    }

    // 이분탐색
    private static int BinarySearch(int key, int low, int high){
        int mid = 0;
        while(low <= high){
            mid = (low + high)/2;

            if(key <= dp[mid]){
                return mid;
            }else if(key < dp[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
