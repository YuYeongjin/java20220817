package p99Codingbat;

import java.util.Arrays;
import java.util.HashSet;

public class academy091405 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","apeach muzi","frodo neo","muzi frodo",};
		int k = 2;
		int num=-2;
		
		int[] list = new int[id_list.length];
		int[] answer = new int[id_list.length];
		HashSet<String> cop = new HashSet<>();		

		for (String lier : report){
            cop.add(lier);
        }
		
		report=cop.toArray(new String[cop.size()]);
		String[][] call = new String[report.length][2];
		
		for(int i = 0; i<report.length; i++) {
			call[i]=report[i].split(" ");
			num = Arrays.asList(id_list).indexOf(call[i][1]);
			list[num]+=1;
		}
		for(int i = 0; i<list.length;i++) {
			int a=-1;
			if(list[i]>=k) {
				for(int l = 0; l<report.length;l++) {
					if(call[l][1].equals(id_list[i])){
						a= Arrays.asList(id_list).indexOf(call[l][0]);
						answer[a]++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
