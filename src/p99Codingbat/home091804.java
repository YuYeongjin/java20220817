package p99Codingbat;

import java.util.*;

public class home091804 {
	public static void main(String[] args) {
		
		String s = "{{11111,32,555,9},{32,555},{9,555,32},{555},{119,11111,32,9,555}}";
		int[] answer = {};
		String a = "";		
		int index1=0;
		int index2=0;
		int count=0;
		String[] find = new String[s.length()];
		
		List<String> word = new ArrayList<>();		
		Set<Integer> test = new HashSet<>();
		List<Integer> ans = new ArrayList<>();		
		
		for(int i = 1 ; i < s.length()-1;i++) {
			word.add(s.substring(i, i+1));
		}		
		for(int i = 0 ; i < word.size();i++) {
			a = word.get(i);
			if(a.equals("{")) {
				index1 = i;
			}
			if(a.equals("}")) {
				index2 = i;				
				find[count]="";
				for(int j = index1+1; j<index2;j++) {
					find[count]+=word.get(j);
				}
				count++;
			}
		}
		find=Arrays.copyOfRange(find, 0, count);		
		Arrays.parallelSort(find, (x,y)->x.length()-y.length());		
		
		for(int i = 0 ; i <find.length;i++) {
			String[] numParts = new String[find.length];
			if(find[i].contains(",")) {
				numParts = find[i].split(",");
				for(int j = 0; j<numParts.length;j++) {
					if(test.add(Integer.valueOf(numParts[j]))==true) {
						ans.add(Integer.valueOf(numParts[j]));
					}					
				}
			} else {
				test.add(Integer.valueOf(find[i]));
				ans.add(Integer.valueOf(find[i]));
			}
		}
		answer = ans.stream().mapToInt(x->x).toArray();
		System.out.println(Arrays.toString(answer));
		
	}
}
