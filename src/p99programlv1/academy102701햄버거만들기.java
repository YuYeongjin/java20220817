package p99programlv1;

import java.util.Stack;

public class academy102701햄버거만들기 {
    public static void main(String[] args) {
        academy102701햄버거만들기 go = new academy102701햄버거만들기();

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(go.solution(ingredient));

    }
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> bugger = new Stack<>();
        for(int i = 0; i < ingredient.length;i++){
            bugger.push(ingredient[i]);
            if(ingredient[i]==1&&bugger.size()>3){
                if(bugger.get(bugger.size()-2)==3){
                    if(bugger.get(bugger.size()-3)==2){
                        if (bugger.get(bugger.size()-4)==1){
                            bugger.pop();
                            bugger.pop();
                            bugger.pop();
                            bugger.pop();
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
