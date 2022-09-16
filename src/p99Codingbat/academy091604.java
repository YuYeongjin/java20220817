package p99Codingbat;

import java.util.*;
public class academy091604 {
	public static void main(String[] args) {
//		int[] progresses = {95, 90, 92, 99, 80, 91};
//		int[] speeds = {2,2,1,2,3,1};
		int[] progresses = {55,60,65};
		int[] speeds = {5,10,7};
		
		int[] answer = {};
		List<Integer> ans = new ArrayList<>();
		int count=0;
		List<Integer> game = new ArrayList<>();
		for(int go : progresses) {
			game.add(go);
		}
		List<Integer> run = new ArrayList<>();
		for(int go : speeds) {
			run.add(go);
		}
		
		for(int day = 0; day< 100; day++){
			count=0;
			for(int j= 0; j<game.size();j++){
				game.set(j, game.get(j)+run.get(j));
			}
			System.out.println(game);
			if(game.get(0)>=100) {
				for(int l = 0; l<game.size();l++) {
					if(game.get(0)>=100) {
						game.remove(0);
						run.remove(0);
						count++;
						l--;
					}
				}
			}
			if(count!=0) {
				ans.add(count);				
			}
			if(game.size()==0) {
				break;
			}
		}
		answer = ans.stream().mapToInt(x->x).toArray();
		System.out.println(Arrays.toString(answer));
	}
}
