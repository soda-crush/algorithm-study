package BOJ_입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2439 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(" ");
        }

        for(int i = 1; i <= n; i++){
            int idx =  n - i;
            sb.setCharAt(idx, '*');
            System.out.println(sb.toString());
        }
    }
}
