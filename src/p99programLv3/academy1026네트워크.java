package p99programLv3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class academy1026네트워크 {
    class Com{
        Com(int x, int cnt){
            this.x=x; this.cnt=cnt;
        }
        int x, cnt;
    }
    int answer = 0;
    public static void main(String[] args) {
        academy1026네트워크 go = new academy1026네트워크();

        int n = 5;
        int[][] computers = {{1, 1, 1,1,1}, {1, 1, 1,1,1}, {1, 1, 1,1,1},{1, 1, 1,1,1},{1,1, 1,1,1}};
        System.out.println(go.solution(n,computers));
    }
    public int solution(int n, int[][] computers) {
        boolean[][] check = new boolean[n][n];
        for(int i = 0 ; i <n;i++){
                if(computers[i][i]==0)continue;
                if(!check[i][i]){
                	check[i][i]=true;
                    answer++;
//                    System.out.println(Arrays.deepToString(check));
                    System.out.println(Arrays.deepToString(computers));                    
                    bfs(n,i,computers,check);
                }
        }
        return answer;
    }
    void bfs(int n , int idx, int[][] computers,boolean[][] check){
        Queue<Com> Q = new LinkedList<>();
        Com now = new Com(idx,0);
        Q.add(now);
        computers[idx][idx]=0;
        System.out.println("시작 좌표 : > " +now.x + " , " + now.x );
        while (!Q.isEmpty()){
            System.out.println(Arrays.deepToString(check));
            now = Q.remove();
            for(int j=now.x;j<check.length;j++){
                if(now.x==j)continue;
                if(check[now.x][j])continue;
                if(1!=computers[now.x][j])continue;
                check[now.x][j]=true; check[j][j]=true;
                computers[now.x][j]=0;
                System.out.println("현재 좌표 : > " +now.x + " , " + j );
                Q.add(new Com(j,now.cnt+1));
            }
        }
    }
}
