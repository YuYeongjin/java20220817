package p99programLv0;

import java.util.HashMap;
import java.util.Map;

public class academy110901푸드파이터 {

    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        academy110901푸드파이터 b = new academy110901푸드파이터();
        System.out.println(b.solution(food));
    }

    private String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i = 1; i < food.length; i++) {
            if(food[i]>1){
                if(food[i]%2==1){
                    ans.put(i,(food[i]-1)/2);
                } else{
                    ans.put(i,(food[i]/2));
                }
            }
        }
        System.out.println(ans);
        int cnt=0;
        for(int i = 0 ; i <ans.size(); i++) {
            System.out.println("현재의 i = " + i);
            if(!ans.containsKey(cnt)) {
                while(!ans.containsKey(cnt)){
                    cnt++;
                }
            }
            System.out.println(ans.get(cnt));
            System.out.println("탈출의 cnt = " + cnt);
            for(int j = 0 ; j < ans.get(cnt);j++) {
                System.out.println("실행"  + i );
                answer.append(""+cnt);
            }
            cnt++;
        }
        answer.append("0");
        for(int i=answer.length()-2;i>=0;i--){
            answer.append(""+answer.substring(i,i+1));
        }
        return  answer.toString();
    }
}
