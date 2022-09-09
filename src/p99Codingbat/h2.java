package p99Codingbat;

import java.util.*;

public class h2 {
	public static void main(String[] args) {		
		
		String[] id_list = {"apeach", "neo","muzi", "frodo"};
		String[] report= {"muzi frodo","apeach frodo","frodo neo","muzi neo","muzi neo","apeach neo","apeach muzi","neo muzi","neo muzi","neo muzi"};
//		String[] id_list = {"con", "ryan"};
//		String[] report= {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 2;
		
		int[] list = new int[id_list.length];
		int[] answer = new int[id_list.length];
		String count="";
		List<String> cap = new ArrayList<>();
		
		Arrays.parallelSort(report);
		for (int i = 0; i<report.length;i++) {
			if(!count.equals(report[i])) {
				cap.add(report[i]);
			}
			count = report[i];
		}
		System.out.println(cap.toString());
		report=cap.toArray(new String[cap.size()]);
		String[][] call = new String[report.length][2];
		for(int i = 0; i<report.length; i++) {
				call[i]=report[i].split(" ");		
				here : for(int l=0; l<id_list.length;l++) {
					if(call[i][1].equals(id_list[l])) {
						list[l]+=1;
						break here; 
					}				
				}
		}
		for(int i = 0; i<list.length;i++) {
			int a=-2;
			if(list[i]>=k) {
				for(int l = 0; l<call.length;l++) {
					if(report[l].matches(".+\\s"+id_list[i])){
						a= Arrays.asList(id_list).indexOf(call[l][0]);
						answer[a]++;
					}
				}			
			}
		}			
		System.out.println("이름 : "+Arrays.toString(id_list));
		System.out.println("신고 : "+Arrays.toString(list));
		System.out.println("메일 : "+Arrays.toString(answer));
	}
}
