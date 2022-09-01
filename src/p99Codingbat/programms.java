package p99Codingbat;

import java.util.Arrays;

public class programms {
	public static void main(String[] args) {
		String s = "try hellll     llllo  worlds";
		String[] a =s.split(" ",-1);
		int count = 0;
		String answer = "";
        System.out.println(Arrays.toString(a));
        for(int i = 0; i<a.length; i++) {
        	for(int j = 0; j<a[i].length(); j++) {
                if(a[i].substring(j,j+1).equals(" ")){
                    answer+=a[i].substring(j,j+1);
                    count++;
                }
        		if(j%2==0) {
        			answer+=a[i].substring(j,j+1).toUpperCase();
                    count++;
        		} else {
        			answer+=a[i].substring(j,j+1).toLowerCase();
                    count++;
        		}
        	}
        	answer +=" ";
            count++;
        }
        System.out.println(answer.substring(0,count-1));
	}
}
