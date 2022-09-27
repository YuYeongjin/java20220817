package p99Study.academy;

import java.util.*;

public class academy091902 {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		int count=0;
		List<String> get = new ArrayList<>();
		for(int i = 0; i<skill.length();i++) {
			get.add(skill.substring(i, i+1));
		}
		
		for(int i = 0 ; i < skill_trees.length;i++) {
			int[] find = new int[skill.length()];
			count=0;
			here : for(int j=0; j < skill_trees[i].length();j++) {
				if(get.contains(skill_trees[i].substring(j, j+1))) {
					count++;
					find[get.indexOf(skill_trees[i].substring(j, j+1))]=count;
					
					if(find[count-1]!=count){
						answer--;
						break here;
					}
				}
			}
			answer++;
			
		}
		System.out.println(answer);
		
	}
	
}
