package BOJ_입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2440 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int j = n; j > 0; j--){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < j; i++){
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}
