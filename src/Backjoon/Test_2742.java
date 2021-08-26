package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test_2742 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = n; i >= 1; i--){
            bw.write(Integer.toString(i) + "\n");
        }

        /**
         *  reader/writer 는 문자열을 다루는 클래스
         *  여기에 정수값을 넣게 되면 기본적으로 ascii 타입으로 인코딩
         *  그래서 숫자를 출력하려면 String 형으로 변환해서 출력해야함.
          */


        bw.flush();
        bw.close();
    }
}
