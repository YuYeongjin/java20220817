package p99Codingbat;

import java.util.*;

public class academy4 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report= {"muzi frodo","muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		String[] alart=new String[2];
		String check="";
		
		String[][] call = new String[report.length][2];
		int[] list = new int[id_list.length];
		int[] answer = new int[id_list.length];
		String me = "";
		
		Arrays.parallelSort(id_list);
		Arrays.parallelSort(report);
		for(int i = 0; i<report.length; i++) {
			if(!check.equals(report[i])) {
				call[i]=report[i].split(" ");				
			} else {
				continue;
			}
			check=report[i];
			System.out.println(Arrays.deepToString(call));
		}		
		
		for(int i = 0; i<call.length;i++) {		
			if(call[i][0]!=null) {
				here : for(int l=0; l<id_list.length;l++) {
					if(call[i][0].equals(id_list[l])) {
						continue;
					} else if(!(call[i][0].equals(alart[0])&&call[i][1].equals(alart[1]))){
						if(call[i][1].equals(id_list[l])) {
							list[l]+=1;
							break here; 
						}
					}
				}
				alart[0] = call[i][0];
				alart[1] = call[i][1];
			}
		}
		
		for(int i = 0; i<list.length;i++) {
			if(list[i]>=k) {
				if(call[i][0]!=null) {
					for(int l = 0; l<call.length;l++) {
						if(call[l][1].equals(id_list[i])) {
							me=call[l][0];
							for(int x=0;x<id_list.length;x++) {
								if(id_list[x].equals(me)) {
									answer[x]+=1;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(id_list));
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(answer));
	}
}
