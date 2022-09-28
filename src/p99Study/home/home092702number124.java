package p99Study.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class home092702number124 {
	public static void main(String[] args) {
		int n =22;
		String answer = "";
		int numThree = 0;
		int numSet = 0;
		int i =0;
		double nn=n;
		
		for(i = 1 ; i<=16;i++) {
			numSet+=(int)Math.pow(3, i);
			if(n<=numSet) {
				numThree=numSet-(int)Math.pow(3, i);
				System.out.println("자리수 찾기 : " + numThree+"보다 크니까 -> " +(i)+"자리 숫자");
				break;
			}
		}
		String[] num = new String[i];
		for(int j = num.length-1; j>=0; j--){ 

			i--;
			System.out.println("현재 n = " + nn + "현재 numthree = "+ numThree + "현재 i = "+i + "연산 = "+((nn-numThree)/(int)Math.pow(3, i)));
			if((nn-numThree)/(int)Math.pow(3, i)<=1&&(nn-numThree)/(int)Math.pow(3, i)!=0) {
				num[j]="1";				
				nn-=(int)Math.pow(3, i);
			} else if ((nn-numThree)/(int)Math.pow(3, i)<=2&&(nn-numThree)/(int)Math.pow(3, i)>1) {
				num[j]="2";
				nn-=(int)Math.pow(3, i)*2;
			} else {
				num[j]="4";
				nn-=(int)Math.pow(3, i)*3;
			}
			numThree-=(int)Math.pow(3, i);
			
			System.out.println(nn);
			
			
//			System.out.println("현재 : "+nn/(int)Math.pow(3, i));
//			if(nn/(int)Math.pow(3, i)>1&&nn/(int)Math.pow(3, i)<=2){
//				num[j]="1";
//				nn-=(int)Math.pow(3, i);
//	        } else if(nn/(int)Math.pow(3, i)>2&&nn/(int)Math.pow(3, i)<=3){
//	           	num[j]="2";
//	           	nn-=(int)Math.pow(3, i)*2;
//	        } else {
//	          	num[j]="4";
//	          	nn%=(int)Math.pow(3, i);
//	        }
//			System.out.println("n 줄인 후 " +nn);
//			
		}
	
		System.out.println(Arrays.toString(num));
		for(int j = num.length-1;j>=0;j--){
            if(num[j]!=null){
                answer+=num[j];    
            }
        }
		System.out.println("정답 = "+answer);
	}
}
