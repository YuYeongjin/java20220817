package p99Codingbat;

import java.util.Arrays;

public class cafe {
	public static void main(String[] args) {
		
		int n = 4;
		int answer = 0;    
	    int i = 0;
	    for(;i<n;i++){
	        if(Math.pow(3,i)>n){
	            break;
	        }
	    }
	    String[] ans = new String[i];
	    if(n<3) {
			ans[0]=""+n;
		}
	    System.out.println(i);
	    for(int j = i-1; j>0; j--) {
	    	System.out.println(j+"번째"+Math.pow(3, j));	    	
	    		if(Math.pow(3, j)<=n&&(Math.pow(3, j)*2)>n) {
	    			ans[j]=""+(Math.pow(10, j));
	    			n-=(int)(Math.pow(3, j));
	    		} else if((Math.pow(3, j)*2)<=n){
	    			ans[j]=""+(Math.pow(10, j)*2);
	    			n-=(int)(Math.pow(3, j)*2);	    			
	    		}
	    		if(n<3) {
    				ans[0]=""+n;
    				break;
    			}
	    }
	    System.out.println(Arrays.toString(ans));
	    String[] b = new String[ans.length];
	    for(int m = 0; m<ans.length;m++) {
	    	if(ans[m]!=null) {
	    		b[ans.length-m-1]=""+(Double.valueOf(ans[m])/(Math.pow(10, m)));	    		
	    	}
	    }
	    System.out.println(Arrays.toString(b));
	    
	    for(int l = 0; l<ans.length; l++) {
	    	if(b[l]!=null) {
	    		if(b[l].equals("1.0")) {
	    			answer +=(int)(Math.pow(3, l));
	    			b[l]=null;
	    		} else if(b[l].equals("2.0")){
	    			answer +=(int)(Math.pow(3, l)*2);
	    			b[l]=null;
	    		}
	    	}
	    }
	    System.out.println(answer);
		}
}
