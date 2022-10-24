package p99programLv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class academy102401n2배열자르기 {
    public static void main(String[] args) {
        academy102401n2배열자르기 go = new academy102401n2배열자르기();
        int n = 10000000;
        int left = 600000;
        int right = 800000;
        System.out.println(Arrays.toString(go.solution(n, left, right)));
    }

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];
        long cnt = 0;
        int a = (int)left/n;
        int b = (int)left%n;

        for(int i =0;i<answer.length;i++){
            if(b<a){
                answer[i]=a;
            } else{
                answer[i]=b;
            }
            if(b==n-1){
                b=0;a++;
            } else{
                b++;
            }
        }
        return answer;
    }
}
/*

 public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];
        long cnt = 0;
        int count = 0;
        int i=(int)(left/n);
        cnt=n*(left/n);
        for (; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(cnt>=left&&cnt<=right){
                    if(j < i) {
                        answer[count] = i+1;
                    } else{
                        answer[count] =
                                j+1;
                    }
                    count++;
                }
                cnt++;
                if(count>right) return answer;
            }
        }
        return answer;
    }
 */