package p99Codingbat;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class academy091401 {
	public static void main(String[] args) {
			String[] id_list = {"muzi", "frodo", "apeach", "neo"};
			String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","apeach muzi","frodo neo","muzi frodo",};
			int k = 2;
			int num=-2;
			
			int[] list = new int[id_list.length];
			int[] answer = new int[id_list.length];
			List<String> cap = new ArrayList<>();
			
			for (int i = 0; i<report.length;i++) {
				if(!cap.contains(report[i])) {
					cap.add(report[i]);				
				}			
			}
			report=cap.toArray(new String[cap.size()]);
			String[][] call = new String[report.length][2];
	       
			for(int i = 0; i<report.length; i++) {
				call[i]=report[i].split(" ");					
				num = Arrays.asList(id_list).indexOf(call[i][1]);
				list[num]+=1;					
			}        
			System.out.println(Arrays.toString(list));
			System.out.println(Arrays.toString(report));
			for(int i = 0; i<list.length;i++) {
				int a=-2;
				if(list[i]>=k) {
//					Arrays.asList(report).stream().filter(s->Pattern.matches(".+\\s"+id_list[i],s)).collect(Collectors.toList());
					/*
					for(int l = 0; l<report.length;l++) {
						if(report[l].matches(".+\\s"+id_list[i])){
							a= Arrays.asList(id_list).indexOf(call[l][0]);
							System.out.println(a);
							answer[a]++;
						}
					}			
					*/
				}
			}
			System.out.println(Arrays.toString(answer));
		
	}
}
