package p99programLv2;

import java.util.*;

public class Lv2배달 {
    Set<Integer> city = new HashSet<>();
    class delevery{
        int x; int distance;
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
//        int N = 5;
//        int K = 3;
//        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        System.out.println(go.solution(N,road,K));

    }
    public int solution(int N, int[][] road, int K) {

        bfs(N,road,K);
        System.out.println(city);
        return city.size();
    }
    void bfs(int N,int[][] road, int K) {
        delevery now = new delevery(1,  K);
        Queue<delevery> run = new LinkedList<>();
        int[] check = new int[N+1];
        boolean[] b = new boolean[N+1];
        for(int i =0; i < check.length; i++) {
            check[i] = 10001;
        }
        run.add(now);

        while (!run.isEmpty()) {
            now = run.remove();
//            System.out.println("시작함 현재의 위치는 ? " + now.x + " , 거리는 : " +now.distance);
                city.add(now.x);
                for (int i = 0; i < road.length; i++) {
                    if (road[i][0] != now.x&& road[i][1] != now.x) continue;
                    if (now.distance < road[i][2]) continue;

                    if(now.x==road[i][1]){
                        if (check[road[i][0]]<road[i][2]) continue;
                        if(b[road[i][0]]) continue;
                        System.out.println("현재 : " + now.x + " 에서" + road[i][0]+ " 갈거임 잔여 distance는 " + (now.distance- road[i][2]));
                        run.add(new delevery(road[i][0],  now.distance - road[i][2]));
                        check[road[i][0]] = road[i][2];
                        b[road[i][0]] = true;
                    } else if (now.x==road[i][0]){
                        if (check[road[i][1]]<road[i][2]) continue;
                        if(b[road[i][1]]) continue;
                        System.out.println("현재 : " + now.x + " 에서" + road[i][1]+ " 갈거임 잔여 distance는 " + (now.distance- road[i][2]));
                        run.add(new delevery(road[i][1],  now.distance - road[i][2]));
                        check[road[i][1]] = road[i][2];
                        b[road[i][1]] = true;
                    }


                }
        }
    }
}