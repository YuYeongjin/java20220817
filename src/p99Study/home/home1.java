package p99Study.home;

import java.util.*;

public class home1 {
	public static void main(String[] args) {		
	
	String[] id_list = {"muzi", "frodo", "apeach", "neo"};
	String[] report= {"muzi frodo","muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
	int k = 1;
	String[] alart=new String[2];	
	String[][] call = new String[report.length][2];
	int[] list = new int[id_list.length];
	int[] answer = new int[id_list.length];
	int a = 0;	
	String b = "";
	
	Arrays.parallelSort(report);
	for(int i = 0; i<report.length; i++) {
			call[i]=report[i].split(" ");		
		System.out.println(Arrays.deepToString(call));
	}
	for(int i = 0; i<call.length;i++) {
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
	alart[0] = "";
	alart[1] = "";
	for(int i = 0; i<list.length;i++) {
		a=-1;
		if(list[i]>=k) {
			System.err.println("현재는 " + id_list[i]+ "신고 건입니다.");
			for(int j =0; j<k;j++) {
				for(int l = 0; l<call.length;l++) {
					if(report[l].matches(".+\\s"+id_list[i])&&b!=call[l][0]){
						System.out.println("신고자는 "+call[l][0]+" 고발당한자는 "+call[l][1]);
						a= Arrays.asList(id_list).indexOf(call[l][0]);
						answer[a]++;
						b=call[l][0];
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
