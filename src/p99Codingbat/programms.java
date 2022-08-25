package p99Codingbat;

public class programms {
	public static void main(String[] args) {
		int n =4;
	    int answer = 0;
	    
	    
	    for (int i = 1; i<n; i++){ 	 // 전체 갯수
	    	int a =0;			
	    	for(int j=1; j<n; j++) {  // n까지의 소수 찾기
	    		on:if(n%j==0) {
		        	a++;
		    		if(a>2) {
			    		break on;
			    	}
	    		}
	    	}	    	
	    	if(a==1) {
	    		answer++;
	    	}
	    		    	
	    	
	    }
	    System.out.println(answer);
	    
	
	    
	    
	    
	}
}        