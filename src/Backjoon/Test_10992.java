package Backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_10992 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int k = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - k; j++){
                sb.append(" ");
            }
            if(i == n - 1){
                for(int j = 0; j < 2 * n - 1; j++){
                    sb.append("*");
                }
            }else{
                for(int j = 0; j < 2 * k - 1; j++){
                    if(j == 0 || j == 2 * k - 2){
                        sb.append("*");
                    }else{
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            k++;
        }
        System.out.println(sb.toString());
    }
}
