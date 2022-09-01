package p99Codingbat;

public class programms {
	public static void main(String[] args) {
		String dartResult = "1S*2T*3S";
		 int answer = 0;
	        String[] a = new String[9];
	        int score=0;
	        int bonus=1;
	        int optCheck =0;
	        char numCheck=0;
	        char check=9;
	        
	        for(int i = 0; i<dartResult.length();i++){
	            numCheck =dartResult.charAt(i);
	            if(numCheck>47&&numCheck<58){
	            	if((check==49)&&numCheck==48) {
	            		a[score-3]="10";
	            	} else {
	            		a[score]=dartResult.substring(i,i+1);
	            		score+=3;
	            	}	            	
	            }
	            check= dartResult.charAt(i);
	            if(dartResult.substring(i,i+1).equals("S")||dartResult.substring(i,i+1).equals("s")||
	               dartResult.substring(i,i+1).equals("D")||dartResult.substring(i,i+1).equals("d")||
	               dartResult.substring(i,i+1).equals("T")||dartResult.substring(i,i+1).equals("t")){
	                a[bonus]=dartResult.substring(i,i+1);
	                bonus+=3;
	            }
	            if (dartResult.substring(i,i+1).equals("*")||
	               dartResult.substring(i,i+1).equals("#")){
	                optCheck = i;
	            }
	            if(optCheck<=3&&optCheck>0) {
	            	a[2]= dartResult.substring(optCheck,optCheck+1);
	            }
	            if(optCheck>3&&optCheck <(dartResult.length()-1)) {
	            	a[5]= dartResult.substring(optCheck,optCheck+1);
	            }
	            if(optCheck ==dartResult.length()-1) {
	            	a[8]= dartResult.substring(optCheck,optCheck+1);
	            }
	        }
	        
	        int[] bonusArray = new int[3];		
	        int bonusCount=0;
      		for (int i = 0; i<a.length; i++) {
      			if(a[i]!=null) {
	      			if(a[i].equals("d")||a[i].equals("D")) {
	      				bonusArray[bonusCount]=2;
	      				bonusCount++;
	      			} else if(a[i].equals("t")||a[i].equals("T")) {
	      				bonusArray[bonusCount]=3;
	      				bonusCount++;
	      			} else if(a[i].equals("s")||a[i].equals("S")){
	      				bonusArray[bonusCount]=1;
	      				bonusCount++;
	      			}
	      		}      	
      		}
	        int x = (int)Math.pow(Integer.valueOf(a[0]), bonusArray[0]);
	        int y = (int)Math.pow(Integer.valueOf(a[3]), bonusArray[1]);
	        int z = (int)Math.pow(Integer.valueOf(a[6]), bonusArray[2]);
	        if(a[2]!=null){
	        	if(a[2].equals("*")){
	        		x*=2;
	        	} else if(a[2].equals("#")) {
	        		x*=-1;
	        	}
	        }
	        if(a[5]!=null){
	        	if(a[5].equals("*")){
	        		x*=2;
	        		y*=2;
	        	} else if(a[5].equals("#")) {
	        		y*=-1;
	        		
	        	}
	        }
	        if(a[8]!=null){
	        	if(a[8].equals("*")){
	        		y*=2;
	        		z*=2;
	        	} else if(a[8].equals("#")) {
	        		z*=-1;
	        	}
	        }
	        answer = x+y+z;
        System.out.println(answer);
	}
}
