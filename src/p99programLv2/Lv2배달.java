package p99programLv2;

import java.util.*;

public class Lv2배달 {
    Set<Integer> city = new HashSet<>();
    class delevery{
        int x; int y; int distance;
        delevery(int x, int distance){
            this.x = x;
            this.distance = distance;
        }
    }
    public static void main(String[] args) {
        Lv2배달 go = new Lv2배달();
        int N = 6;
        int K = 4;
        int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
        System.out.println(go.solution(N,road,K));

    }
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        delevery now = new delevery(1,0);

        dfs(N,road,K,now);


        return answer;
    }
    void dfs(int N, int[][] road, int K, delevery now){


        city.add(now.x);


    }

}
