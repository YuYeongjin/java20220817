package p99programLv2;

import java.util.Arrays;

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
        int[][] find = new int[scope.length][2];
        for(int i = 0 ; i < distance;i++) {
            now=new Work(now.time+1,now.where+1);
            System.out.println("현재 거리 : "+now.time);
            time(find, times);
            answer = where(now.where,scope,find);
            System.out.println(Arrays.deepToString(find));
            if(answer!=0){
                return answer;
            }
        }
        return distance;
    }
    static void time(int[][] find, int[][] times) {
        for(int i = 0 ; i < times.length ; i++) {
            find[i][1]++;
            if(find[i][0] ==0&&find[i][1] > times[i][0]) {
                find[i][1]=1;
                find[i][0]=1;
            } else if(find[i][0] ==1&&find[i][1] > times[i][1]){
                find[i][1]=1;
                find[i][0]=0;
            }
        }
    }
    static int where(int where,int[][] scope,int[][] find){
        for(int i =0; i < scope.length;i++) {
            if((scope[i][0]>=where&&scope[i][1]<=where)||(scope[i][1]>=where&&scope[i][0]<=where)){
                if(find[i][0]==0){
                    return where;
                }
            }
        }
        return 0;
    }
}
