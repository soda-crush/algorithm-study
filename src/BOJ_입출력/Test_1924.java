package BOJ_입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_1924 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int month = Integer.parseInt(arr[0]);
        int day = Integer.parseInt(arr[1]);

        String monthStr = "";
        String dayStr = "";

        if(month < 10){
            monthStr = "0" + month;
        }else{
            monthStr = Integer.toString(month);
        }
        if(day < 10){
            dayStr = "0" + day;
        }else{
            dayStr = Integer.toString(day);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date newDay = sdf.parse("2007/01/01");
        Date target = sdf.parse("2007/" + monthStr + "/" + dayStr);

        // month, day - 1월 1일 = 날짜 계산

        long diff = (target.getTime() - newDay.getTime())/(1000*60*60*24); // 초 - 분 - 시 - 일자수
        int result = (int)diff%7;

        if(result == 0) System.out.println("MON");
        else if(result == 1) System.out.println("TUE");
        else if(result == 2) System.out.println("WED");
        else if(result == 3) System.out.println("THU");
        else if(result == 4) System.out.println("FRI");
        else if(result == 5) System.out.println("SAT");
        else System.out.println("SUN");

    }
}
