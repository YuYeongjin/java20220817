package p99Study.academy;

import java.util.Arrays;

public class academy2 {
	public static void main(String[] args) {
		String[] survey ={"AN", "CF", "MJ", "RT", "NA"};
		int[] choices= {5, 3, 2, 7, 5};	
		String answer = "";
        int[] ans = new int[4];
        int point = 0;
        for(int i =0; i<survey.length;i++){
            point = 4-choices[i];
            next : switch (survey[i].substring(0,1)){
                case "R":
                	ans[0]+= point;
                	point=0;
                	break next;
                case "T":
                	ans[0]-= point;
                	point=0;
                	break next;
                case "C":
                	ans[1]+= point;
                	point=0;
                	break next;
                case "F":
                	ans[1]-= point;
                	point=0;
                	break next;
                case "J":
                	ans[2]+= point;
                	point=0;
                	break next;
                case "M":
                	ans[2]-= point;
                	point=0;
                	break next;
                case "A":
                	ans[3]+= point;
                	point=0;
                	break next;
                case "N":
                	ans[3]-= point;
                	point=0;
                	break next;
            }   
        }
        if(ans[0]>=0) {
        	answer +="R";
        } else {
        	answer+="T";
        }
        
        if(ans[1]>=0) {
        	answer +="C";
        } else {
        	answer+="F";
        }
        if(ans[2]>=0) {
        	answer +="J";
        } else {
        	answer+="M";
        }
        if(ans[3]>=0) {
        	answer +="A";
        } else {
        	answer+="N";
        }
        System.out.println(Arrays.toString(ans));
	System.out.println(answer);
	}
}