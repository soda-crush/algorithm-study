package BOJ_입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_1924_2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int month = Integer.parseInt(arr[0]);
        int day = Integer.parseInt(arr[1]);

        int sum = 0;

        int[] monthArr = {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < month -1; i++){
            sum += monthArr[i];
        }
        sum += day;

        switch (sum % 7){
            case 1 :
                System.out.println("MON"); break;
            case 2 :
                System.out.println("TUE"); break;
            case 3 :
                System.out.println("WED"); break;
            case 4 :
                System.out.println("THU"); break;
            case 5 :
                System.out.println("FRI"); break;
            case 6 :
                System.out.println("SAT"); break;
            case 0 :
                System.out.println("SUN"); break;
        }
    }
}
