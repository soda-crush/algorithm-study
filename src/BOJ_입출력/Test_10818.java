package BOJ_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] tmpArr = br.readLine().split(" ");
        int max = Integer.parseInt(tmpArr[0]);
        int min = Integer.parseInt(tmpArr[0]);

        // Arrays.sort를 사용안하고 최솟값, 최댓값을 구하는 법(복잡도 N)
        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(tmpArr[i]);

            if(number > max) max = number;
            if(number < min) min = number;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("*");
        sb.toString();

        System.out.println(min + " " + max);
    }
}
