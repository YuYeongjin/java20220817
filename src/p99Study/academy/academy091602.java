package p99Study.academy;
import java.util.*;
public class academy091602 {
	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
	 int answer =0;
	 Set<String> set = new HashSet<>();
     
     for(int i = 0 ; i <allowed.length();i++){
         set.add(allowed.substring(i,i+1));
     }
     for(int i=0;i<words.length;i++){
       here:for(int j=0;j<words[i].length();j++){
             if(set.add(words[i].substring(j,j+1))==true){
            	 set.remove(words[i].substring(j,j+1));
                 answer++;
                 System.out.println(" i = "+i + "j = " + j + "글자 : " + words[i].substring(j, j+1));
                 break here;
             }
         }
       System.out.println(set);
     }
     System.out.println(answer);
	}
}
