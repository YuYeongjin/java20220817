package p99programLv0;

import java.util.HashMap;
import java.util.Map;

public class C최빈값 {
    public static void main(String[] args) {
        C최빈값 go = new C최빈값();
        System.out.println(go.solution(new int[]{1, 2, 3, 3, 3, 4}));
    }

    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> apple = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(apple.containsKey(array[i])) {
                apple.put(array[i], apple.get(array[i])+1);
            } else {
                apple.put(array[i], 1);
            }
        }
        // Map의 전체 탐색하며 최대값을 찾기  >> 찾은 최대값을 다시한번 전체 탐색하며 갯수가 1개면 return 아니면 -1을 리턴
        return answer;
    }

}
