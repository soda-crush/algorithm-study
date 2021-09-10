package BOJ_입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2445 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 삼각형
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                sb.append("*");
            }
            for(int j = 2 * (n - i - 1); j > 0; j--){
                sb.append(" ");
            }
            for(int j = 0; j < i + 1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        // 역삼각형
        for(int i = 0; i < n - 1; i++){
            for(int j = n - i; j > 1; j--){
                sb.append("*");
            }
            for(int j = 0; j < 2 * (i + 1); j++){
                sb.append(" ");
            }
            for(int j = n - i; j > 1; j--){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
