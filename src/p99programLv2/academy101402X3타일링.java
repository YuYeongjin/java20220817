package p99programLv2;

import java.util.Arrays;

public class academy101402X3타일링 {
	
	public static void main(String[] args) {
		academy101402X3타일링 go = new academy101402X3타일링();
		int n = 100;
		System.out.println(go.solution(n));
	}
	public int solution(int n) {
		int[] ans = new int[n/2+1];
        if(n%2==1)return 0;
        int cnt=2;
        ans[0]=1;
        ans[1]=3;
        long a = 0;
        long b = 0;
        long c = 0;
        while(cnt!=ans.length) {
        	a=0;
        	for(int i=0;i<4;i++) {
        		a+=ans[cnt-1];
        	}
        	
        	b=ans[cnt-2];
        	if(a>1000000007) {
        		while(a>1000000007) {
        			a-=1000000007;
        		}
        	}
        	if(a<b) {
        		b-=1000000007;        			
        	}
//        	System.out.println(a + " /////  " + b);
        	c = a-b;
//        	System.out.println(c);
//        	System.err.println(c);
        	ans[cnt]= (int)c;
//        	System.err.println(ans[cnt]);
        	
        	cnt++;
        }     
//        System.out.println(Arrays.toString(ans));
        return ans[cnt-1];
    }
}