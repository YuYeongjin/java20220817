package p99Codingbat;

public class whynotpull {
	public static void main(String[] args) {
	
	int n = 45;
	int answer = 0;    
    int count = 0;
    int i = 0;
    int three=0;
    String ans = "";
    for(;i<n;i++){
        if(n/Math.pow(3,i)<1){
            count = i-1;
            break;
        }
    }
    for(int j = count; j>0; j--){
    	if(Math.pow(3, j)>n){
    		continue;
    	} else {
	    	if(((Math.pow(3,j)*2))>n){      
	            three+= (int)1*Math.pow(10,j);            
	            n-=(int)(Math.pow(3,j));
	            if(n<=0) {
	            	break;
	            }
	        } else {
	            three+= (int)2*Math.pow(10,j);
	            n-=(int)(2*Math.pow(3,j));
	            if(n<=0) {
	            	break;
	            }
	        } 
	    	count--;
	    }
    }
    if(n!=0&&n<3) {
    	three+=n;
    }
    System.out.println(three);
    String a = ""+three;
    String[] b = new String[i];
    String c = "";
    for (int l =0; l<i;l++) {
    	b[i-l-1]=a.substring(l, l+1);
    }
    for(int k=0;k<i;k++) {
    	c+=b[k];
    }
    System.out.println(c);
    int d = Integer.parseInt(c);	
    System.out.println(d);
    for(int o=i-1;o>=0;o--) {
    	if(Math.pow(10, o)>d){
    		continue;
    	} else {
	    	if(Math.pow(10, o)*2>d) {
	    		answer +=(int)(Math.pow(3, o));
	    		d-=(int)Math.pow(10, o);
	    	} else {
	    		answer +=(int)(Math.pow(3, o)*2);
	    		d-=(int)Math.pow(10, o)*2;
	    	}
	    	if(d==0) {
	    		break;
	    	}
    	}
    }
    System.out.println(answer);
	}
}
