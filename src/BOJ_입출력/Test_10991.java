package BOJ_입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_10991 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int k = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - k; j++){
                sb.append(" ");
            }
            for(int j = 1; j < 2 * k; j++){
                if(j%2 == 0) sb.append(" ");
                else sb.append("*");
            }
            sb.append("\n");
            k++;
        }
        System.out.println(sb.toString());
    }
}
