package Backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2522 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int k = 1;
        for(int i = 0; i < 2 * n - 1; i++){
            for(int j = 0; j < n - k; j++){
                sb.append(" ");
            }
            for(int j = 0; j < k; j++){
                sb.append("*");
            }
            sb.append("\n");

            if(i < n - 1) k++;
            else k--;
        }

        System.out.println(sb.toString());
    }
}
