package p99programLv2;

import java.util.TreeSet;

public class academy1116숫자카드나누기{
    TreeSet<Integer> ans = new TreeSet<>((a,b) ->b-a);
    int answer = 0;
    public static void main(String[] args) {

        academy1116숫자카드나누기 go  = new academy1116숫자카드나누기();
        int[] arrayA = {14,35,119};
        int[] arrayB = {18,30,102};
        System.out.println(go.solution(arrayA, arrayB));
    }

    public int solution(int[] arrayA, int[] arrayB) {
        ans.add(cheolsoo(arrayA, arrayB));
        ans.add(younghee(arrayA, arrayB));
        return answer;
    }
    int cheolsoo(int[] arrayA, int[] arrayB) {
        int a= 0;

        return a;
    }
    int younghee(int[] arrayA, int[] arrayB) {
        int a= 0;

        return a;
    }
}
