package p99programLv2;

import java.util.Arrays;
import java.util.TreeSet;

public class academy102101조이스틱 {
	int answer = 0; int count =0;
	class Cursor{Cursor(int x){this.x = x;}int x;}
	Cursor now = new Cursor(0);
	TreeSet<Integer> ans = new TreeSet<>((a,b)->a-b);
	public static void main(String[] args) {
		
		academy102101조이스틱 go = new academy102101조이스틱();
//		String name = "JEROEN";
		String name = "ZAZAZAZ";
//		String name = "ACAAGWEAAAAAAAAZAAAAAAAATYAAAAWEAAGSAAAAAACA";
//		String name = "AAIAPB";
//		String name = "BABAAABB";
		
		System.out.println(go.solution(name));
	}
	public int solution(String name) {
		
		int[] word = new int[name.length()];
		
        for(int i = 0 ; i < name.length();i++) {
        	word[i]=change(name.charAt(i));
        	if(word[i]!=0) count++;
        }
        dfs(0,0,now,word);
        
        System.out.println(ans);
//        System.out.println(Arrays.toString(word)+ " 현재 answer : " + answer);
        return ans.first();
    }
	void dfs(int method,int cnt, Cursor now,int[] word) {
		answer+=method;
		if(cnt==count) {
			ans.add(answer);
			return;
		}
		
		dfs(Front(now,word),cnt+1, now, word);
        dfs(Back(now,word),cnt+1, now, word);
	}
	int Front(Cursor now,int[] word) {
		int a = 0;
		int front =0;
		int where = now.x;
		for(int i = 0 ; i < word.length;i++) {
			if(where==word.length-1) {where=0;}
			else {where++;}
        	if(word[where]==0) {front++;}
        	else {break;}
        }
		now = new Cursor(where);
		a+=front;
		a+=word[now.x];
		word[now.x]=0;
		System.out.println(" 프론트 현재 커서 : " + now.x + Arrays.toString(word));
		return a;
	}
	int Back(Cursor now,int[] word) {
		int a = 0;
        int whereb = now.x;
        int back =0;
        for(int i = 0 ; i < word.length;i++) {
        	if(whereb==0) {whereb=word.length-1;}
        	else {whereb--;}
        	if(word[whereb]==0) {back++;}
        	else {break;}
        }
        now = new Cursor(whereb);
        a+=back;
        a+=word[now.x];
        word[now.x]=0;
        System.out.println(" 백 현재 커서 : " + now.x+ Arrays.toString(word));
        return a;
	}
	int change(int word) {
		if(word-65>=13)	return 26-(word-65);
		return word-65;
	}
}





















/*

class Solution {
    int answer = 0;
    class Cursor{Cursor(int x){this.x = x;}int x;}
    Cursor now = new Cursor(0);
    public int solution(String name) {
        int[] word = new int[name.length()];
		int count =0;        	
        for(int i = 0 ; i < name.length();i++) {
        	word[i]=change(name.charAt(i));
        	if(word[i]!=0) count++;
        }
        while(count!=0) {
        	int front=0; int back =0;
        	int wheref = now.x; int whereb = now.x;
        	for(int i = 0 ; i < word.length;i++) {
        		if(word[wheref]==0) {
        			front++;
        		}
        		else {
        			break;
        		}
        		if(wheref==word.length-1) {
        			wheref=0;
        		} else {
        			wheref++;
        		}
        	}
        	for(int i = 0 ; i < word.length;i++) {
        		if(word[whereb]==0) {
        			back++;
        		}
        		else {
        			break;
        		}
        		if(whereb==0) {
        			whereb=word.length-1;
        		} else {
        			whereb--;
        		}
        	}        	
        	if(back>front) {
        		now = new Cursor(wheref);
        		answer+=front;        		
        		answer+=find(now, word);
        	} else {
        		now = new Cursor(whereb);
        		answer+=back;        		
        		answer+=findRev(now, word);
        	}
        	count--;
        }
        return answer;
    }
	int find(Cursor now,int[] word) {
		int cnt=0;
		cnt+=word[now.x];
		word[now.x]=0;
		return cnt;
	}
	int findRev(Cursor now,int[] word) {
		int cnt=0;
		cnt+=word[now.x];
		word[now.x]=0;
		return cnt;
	}
	int change(int word) {
		if(word-65>=13)	return 26-(word-65);
		return word-65;
	}
}



 
*/