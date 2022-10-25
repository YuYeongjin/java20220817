package p99programLv2;


import ch06.book.s061301.package2.C;

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
		String name = "JAN";
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
		System.out.println(Arrays.toString(word));
        dfs("",now,word,name);
        return ans.first();
    }
	int Front(Cursor now,int[] word) {
		int a = 0;
		int front =0;
		int where = now.x;
		System.out.println(now.x);
		for(int i = 0 ; i < word.length;i++) {
			if(word[where]==0) {
				front++;
			}else {
				break;
			}
			if(where==word.length-1) {
				where=0;
			}else {
				where++;
			}
        }
		now.x=where;
		a+=front;
		a+=word[now.x];
		word[now.x]=0;
		System.out.println(" 프론트 현재 커서 : " + now.x +  " 움직인 거리 " + front + ">" +Arrays.toString(word));
		return a;
	}
	int Back(Cursor now,int[] word) {
		int a = 0;
        int whereb = now.x;
        int back =0;
        for(int i = 0 ; i < word.length;i++) {
			if(word[whereb]==0) {back++;}
			else {break;}
        	if(whereb==0) {whereb=word.length-1;}
        	else {whereb--;}

        }
        now.x=whereb;
        a+=back;
        a+=word[now.x];
        word[now.x]=0;
        System.out.println(" 백 현재 커서 : " + now.x+  " 움직인 거리 " + back + ">" +Arrays.toString(word));
        return a;
	}
	int change(int word) {
		if(word-65>=13)	return 26-(word-65);
		return word-65;
	}
	void  dfs (String a,Cursor now, int[] word,String name){
		if(a.length()== count){
			wordSet(name,word);
			System.out.println(a);
			dfsgo(a,now,word);
			return;
		}
		dfs(a+"F", now, word,name);
		dfs(a+"B", now, word,name);
	}
	void  dfsgo(String a, Cursor now, int[] word){
		int sum =0;
		now = new Cursor(0);
		for(int i =0;i<a.length();i++){
			if(a.substring(i,i+1).equals("F")){
				sum+=Front(new Cursor(0),word);
			} else{
				sum+= Back(new Cursor(0),word);
			}
			System.out.println("현재 ans = " + sum);
		}
		System.out.println(" 진행은 : " + a + " 결과는 ? " + sum );
		ans.add(sum);
	}
	void wordSet(String name,int[] word){
		for(int i = 0 ; i < name.length();i++) {
			word[i]=change(name.charAt(i));
		}
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