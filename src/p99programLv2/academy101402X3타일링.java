package p99programLv2;

import java.util.Arrays;

public class academy101402X3타일링 {
	
	public static void main(String[] args) {
		academy101402X3타일링 go = new academy101402X3타일링();
		int n = 8;
		System.out.println(go.solution(n));
	}
	public int solution(int n) {
        int answer = 0;
        int[] ans = new int[n/2+1];
        if(n%2==1)return 0;
        int cnt=3;
        ans[0]=1;
        ans[1]=3;
        ans[2]=11;
        while(cnt!=ans.length) {
        	ans[cnt]= 4*(ans[cnt-1]%1000000007)-ans[cnt-2];
        	if(ans[cnt]>1000000007)ans[cnt]-=1000000007;
        	cnt++;
        }
        System.out.println(Arrays.toString(ans));
        return ans[cnt-1];
    }
	
}
