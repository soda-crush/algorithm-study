package BOJ_입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_2442 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 2 * n - 1;
        int blank = max/2;
        int star = 1;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < blank; j++){
                sb.append(" ");
            }
            blank--;
            for(int j = 0; j < star; j++){
                sb.append("*");
            }
            star = star + 2;
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
