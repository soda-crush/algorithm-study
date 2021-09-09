package Backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2441 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(j < i){
                    sb.append(" ");
                }else{
                    sb.append("*");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
