package p99Codingbat;
import java.util.*;
public class academy091508 {
	public static void main(String[] args) {
		int[] people = {70,50,80,50};
		int limit = 100;
		
		int answer = 0;
        int man=0;
        List<Integer> safe = new ArrayList<>();
        Arrays.parallelSort(people);
        for(int i = 0; i<people.length;i++){
            safe.add(people[i]);
        }
        System.out.println(safe);
        for(int i = 0; i<people.length;i++){
            man = safe.remove(0);
            if(safe.size()!=0) {
            	if(man+safe.get(0)<=limit) {
            		safe.remove(0);
            	}            	
            }
            answer++;
            if(safe.size()==0) {
            	break;
            }
        }
        System.out.println(answer);
	}
}
