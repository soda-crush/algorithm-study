package Backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_1003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] list = new int[41][2];
        list[0][0] = 1;
        list[0][1] = 0;
        list[1][0] = 0;
        list[1][1] = 1;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int num = Integer.parseInt(br.readLine());

            for(int j = 2; j <= num; j++){
                list[j][0] = list[j - 1][0] + list[j - 2][0];
                list[j][1] = list[j - 1][1] + list[j - 2][1];
            }
            System.out.println(list[num][0] + " " + list[num][1]);
        }
    }
}
