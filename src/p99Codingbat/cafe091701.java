package p99Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Fidelity;

public class cafe091701 {
	public static void main(String[] args) {
//		int n =3;
//		int[] works = {1,1};
		int n =4;
		int[] works = {4,3,3};
		
//		int n = 1000;
//		int[] works = {11,11,11,11,11,100,550,111,1111,1};
		long answer = 0;
		
		
		List<Integer> find = Arrays.stream(works).boxed().collect(Collectors.toList());
	
        while(n!=0){
        	find.sort((a,b)->b-a);
        	find.removeIf(a->a<=0);
        	if(find.size()<=1) {
        		break;
        	}
        	System.out.println(find);
        	int min = find.get(find.size()-1);
	        int d = find.get(0);
	        int count = -1;
	        int gap =-1;
	        //갭차이가 있다면
	        System.out.println(d);
	        System.out.println(find.get(1));
	        here:for(int i = 1; i<find.size();i++) {
	        	if(d-find.get(i)>=1) {
	        		gap = d-find.get(i);
	        		count = i-1;
	        		System.out.println("ok");
	        		break here;
	        	}
	        	d = find.get(i);
	        }
	        System.out.println("카운트 값은 ? "+count);
	        if(count!=-1) {
	        	int partN=(int)n/(count+1);
	        	if(gap*(count+1)<n) {
	        		for(int i = 0; i<=count;i++) {
	        			find.set(i, find.get(i)-gap); 
	        			n-=gap;
	        		}
	        		System.out.println("1 실행");
	        		System.out.println(n);
			        System.out.println(find);
	        	}else if (gap*(count+1)>=n){
	        		for(int i = 0; i<=count;i++) {
	        			find.set(i, find.get(i)-partN); 
	        			n-=partN;
	        		}
	        		System.out.println("1-2 실행 후 나감");
	        		System.out.println(n);
			        System.out.println(find);
	        		break;
	        	}
	        	System.out.println("1번 실행");
	        	System.out.println(n);
		        System.out.println(find);
	        } else {  // 갭차이 없이 동일한 값들이라면
	        	
	        	if(n > (find.size()*min)) {
	        		for(int i = 0; i<find.size();i++) {
	        			find.set(i, find.get(i)-min);
	        		}
	        		n-=find.size()*min;
	        	} else {
	        		int val = (int)n/find.size();
	        		for(int i = 0; i<find.size();i++) {
	        			find.set(i, find.get(i)-val);
	        			n-=val;
	        		}
		        	System.out.println("2-2 실행하고 나감");
		        	System.out.println(n);
			        System.out.println(find);
	        		break;
	        	}
	        	
	        	System.out.println("2번 실행");
	        	System.out.println(n);
		        System.out.println(find);
	        }
	        System.out.println(n);
	        System.out.println(find);
        }
        while(n!=0&&find.size()!=0) {
        	find.sort((a,b)->b-a);
        	find.set(0, find.get(0)-1);
        	n--;
        }
        find.re
        for(int k=0; k<find.size();k++){
        	answer += Math.pow(find.get(k),2);
        }
        System.out.println(answer);
        
	}
}