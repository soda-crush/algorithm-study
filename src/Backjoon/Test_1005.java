package Backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test_1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   // 테스트 케이스 수

        while(t-- > 0){
            int n = sc.nextInt();   // 정점 : 건물의 개수
            int k = sc.nextInt();   // 간선 : 건설 순서 규칙
            int[] indegree = new int[n+1];  // 해당 노드를 가리키는 간선 갯수(위상 정렬)

            int[] timeArr = new int[n + 1];    // 건설에 걸리는 시간
            for(int i = 1; i < n + 1; i++){
                timeArr[i] = sc.nextInt();
            }

            int[][] dfsGraph = new int[n+1][n+1];   // 건설 순서 규칙
            for(int i = 0; i < k; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                dfsGraph[x][y] = 1;
                indegree[y]++;
            }

            int w = sc.nextInt();   // 건설해야 할 건물의 번호

            // 정렬
            Queue<Integer> q = new LinkedList<>();
            int[] result = new int[n + 1];  // 걸리는 시간 결과

            // 건물 기본 소요 시간, 조건 필요없는 건물 q에 넣기
            for(int i = 1; i < n + 1; i++){
                result[i] = timeArr[i];
                if(indegree[i] == 0){
                    q.offer(i);
                }
            }

            while(!q.isEmpty()){
                int node = q.poll();    // 현재 건설 가능한 건물

                for(int i = 1; i < dfsGraph[node].length; i++){
                    if(dfsGraph[node][i] == 1){ // 현재 건물 다음에 건설할 수 있는 건물
                        result[i] = Math.max(result[i], result[node] + timeArr[i]); // 건물 건설 시간 = 이전 건물 소요시간 + 현재 건물 소요시간
                        indegree[i] --; // 현재 건물을 이미 지었다 치고, 지우면 해당 노드를 가리키는 간선이 하나 감소

                        if(indegree[i] == 0){
                            q.offer(i); // indegree == 0 이면 건설 가능한 상태 이므로 q에 넣기
                        }
                    }
                }
            }

            System.out.println(result[w]);

        }
    }
}
