package p99programLv2;

import java.util.LinkedList;
import java.util.Queue;

public class academy110101야간전술보행 {
    class Work{
        Work(int time, int where){
            this.time=time;
        this.where=where;
        }
        int time; int where;
        }
public static void main(String[] args) {
        academy110101야간전술보행 go = new academy110101야간전술보행();
        int distance =10;
        int[][] scope ={{3,4},{8,5}};
        int[][] times ={{2,5},{4,3}};
        System.out.println(go.solution(distance,scope,times));
        }
public int solution(int distance, int[][] scope, int[][] times) {
        int answer = 0;
        Work now = new Work(0,0);
        Queue<Work> field = new LinkedList<>();


        return answer;
                }
}
