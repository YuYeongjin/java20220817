package p99programLv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class academy101901혼자놀기달인 {
	List<Integer>ans = new ArrayList<>();
//	List<Integer> ans = new ArrayList<>();
	int answer = 0;
	public static void main(String[] args) {
		
	academy101901혼자놀기달인 go = new academy101901혼자놀기달인();
//	int[] card = {8,6,3,7,2,5,1,4};
	int[] card = {1,2};
	
	System.out.println("정답 : "+go.solution(card));
	}
	
	public int solution(int[] cards) {
        boolean[] check = new boolean[cards.length];
        for(int i = 0 ; i < cards.length;i++) {
        	if(check[i])continue;

        	answer=0;
        	System.err.println("1바퀴 > " + i + "로 입장");
        	check[i]=true;
        	dfs(cards[i],cards,check);
        	System.out.println(ans);
        }
        ans.sort((a,b)->b-a);
        if(ans.size()>=2) return ans.get(0)*ans.get(1);
        return 0;
    }
	void dfs(int index, int[] card, boolean[] check) {
		System.out.println("현재 = "+ index+ " //" +Arrays.toString(check));
		answer++;
		if(check[index-1]&&answer!=0) {
			ans.add(answer);
			return;
		}
		
		System.out.println(index);
		if(!check[index-1]) {
			check[index-1]=true;
			index=card[index-1];
			dfs(index,card,check);
		}
		
	}
	
}
