package p99programLv2;

import java.util.Arrays;

public class academy101801숫자블록 {
	public static void main(String[] args) {
		academy101801숫자블록 go = new academy101801숫자블록();
		long begin=1; long end=1000;
		System.err.println(Arrays.toString(go.solution(begin,end)));
	}

	private int[] solution(long begin, long end) {
		int start = (int) begin;
		int finish = (int) end;
		
		int[] answer= new int[(int)(end-begin)+1];
		int cnt=0;
		for(int i = start;i<=finish;i++) {
			answer[cnt]=1;
			int find = i;
			
			if(i>10000) {
				find=(int)Math.sqrt(i);
			}
			for(int l=2;l<find;l++) {
				if(i%l==0) {
					if(i/l>10000000)continue;
					answer[cnt]=i/l;
					break;
				}
			}			
			cnt++;
		}
		if(begin==1) answer[0]=0;
		return answer;
	}		
}

/*
for(int i = start;i<=finish;i++) {
			boolean check=false;
			int j = i-1; int find=i-1;
            if(i>10000000) {
				j = 10000000;
                find = (int) Math.sqrt(j);
			}
			for(;find>=2;find--) {
				if(i%find==0) {
					check=true;
					break;
				}
			}
			if(!check) {
				answer[cnt]=1;
			} else {
				for(int l = j;l>=2;l--) {
					if(i%l==0) {
						answer[cnt]=l;
						break;
					}
				}
			}
			cnt++;
		}
*/









	/*
	int start = (int) begin;
		int finish = (int) end;
		
		boolean[] num = new boolean[(int)end+1];
		int[] numi = new int[(int)end+1];
		
		num[0]=false; num[1]=false; numi[1]=1;
		
		for(int l =2;l<num.length;l++) {
			for(int z = l-1;z>=2;z--) {
				if(l%z==0) {
					numi[l]=z;
					num[l]=true;
					break;
				}
			}
			if(!num[l]) {
				numi[l]=1;
				for(int i = l*2;i<num.length; i+=l) {
					System.out.println(i + " 인덱스에 // + l 값 " + l);
					numi[i]=l;
					num[i]=true;
				}				
			}			
		}		
		int[] answer= Arrays.copyOfRange(numi, start, finish+1);	
		if(begin==1) answer[0]=1;
		return answer;
	}
	*/