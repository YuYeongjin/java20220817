package p99programlv1;

import java.util.Arrays;
import java.util.Stack;

public class academy111401과일장수 {
    public static void main(String[] args) {
        academy111401과일장수 go = new academy111401과일장수();
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(go.solution(k, m, score));
    }
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] ans = new int[10];
        Stack<Integer> box = new Stack<>();
        for (int i =0;i<score.length;i++){
            ans[score[i]]++;
        }
        int cnt=9;
        while (cnt!=0){
            for(int i = 0;i<ans[cnt];i++){
                box.push(cnt);
                System.out.println(Arrays.toString(ans)+"현재는 "+ans[cnt]+"그리고 스택은? " + box);
                if (box.size() == m) {
                    answer+=box.size()*box.peek();
                    System.out.println(answer);
                    box.clear();
                }
            }
            cnt--;
        }
        return answer;
    }
}
