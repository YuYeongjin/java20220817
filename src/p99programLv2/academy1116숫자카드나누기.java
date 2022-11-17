package p99programLv2;

import java.util.*;

public class academy1116숫자카드나누기 {
    List<Integer> ans = new ArrayList<>();
    Queue<Integer> firstAnswer = new LinkedList<>();

    public static void main(String[] args) {

        academy1116숫자카드나누기 go = new academy1116숫자카드나누기();
        int[] arrayA = {10, 20};
        int[] arrayB = {5,17};

//        int[] arrayA = {14, 35, 119};
//        int[] arrayB = {18, 30, 102};
        System.out.println(go.solution(arrayA, arrayB));
    }
    public int solution(int[] arrayA, int[] arrayB) {
        int min = Math.max(Arrays.stream(arrayB).min().getAsInt(),Arrays.stream(arrayA).min().getAsInt());

        while(min!=1){
            System.out.println("현재 : " + min);
            int cntA =0; int cntB=0; int cntC=0; int cntD=0;
            for(int i = 0;i<arrayA.length;i++){
                if(arrayA[i]%min==0){
                    cntA++;
                }
                if(arrayB[i]%min!=0){
                    cntB++;
                }
                if(arrayA[i]%min != 0){
                    cntC++;
                }
                if(arrayB[i]%min== 0) {
                    cntD++;
                }
                if((cntA!=cntB) && (cntC!=cntD)){
                    System.out.println("현재 : " +cntA+"+" +cntB+"+"+cntC+"+"+cntD);
                    break;
                }
            }
            if((cntA==cntB&&cntA==arrayA.length)||(cntC==cntD&&cntC==arrayB.length)){
                ans.add(min);
                break;
            }
            min--;
        }
        return ans.size()==0? 0: ans.size()==1? ans.get(0): ans.get(0)>ans.get(1)? ans.get(0): ans.get(1);
    }
}
