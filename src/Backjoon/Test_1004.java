package Backjoon;

import java.util.Scanner;

public class Test_1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   // 테스트 케이스의 수 T

        while(t-- > 0){
            // 진입/이탈 횟수
            int cnt = 0;

            // 출발점
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            //도착점
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int num = sc.nextInt(); // 행성계의 개수 n

            for(int i = 0; i < num; i++){
                int px = sc.nextInt();
                int py = sc.nextInt();
                int pr = sc.nextInt();

                boolean checkStr = false;       // 출발점 위치 : false 행성계 밖, ture 행성계 안
                boolean checkEnd = false;       // 도착점 위치

                if(Math.pow(px - x1, 2) + Math.pow(py - y1, 2) < Math.pow(pr, 2)){
                    checkStr = true;
                }else{
                    checkStr = false;
                }

                if(Math.pow(px - x2, 2) + Math.pow(py - y2, 2) < Math.pow(pr, 2)){
                    checkEnd = true;
                }else{
                    checkEnd = false;
                }

                if(checkStr != checkEnd) cnt++;
                else continue;
            }

            System.out.println(cnt);
        }
    }
}
