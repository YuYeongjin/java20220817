package p99Codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class home092601 {
	Set<String> num = new HashSet<>();	

	public static void main(String[] args) {
		home092601 z = new home092601();
		int[] numbers = { 39, 3, 30, 34, 54, 58, 909, 96, 991, 6, 8, 880 };
		String[] numString = new String[numbers.length];
		String answer="";
		for (int i = 0; i < numbers.length; i++) {
			numString[i] = "" + numbers[i];
		}

		List<Integer> numSetting = new ArrayList<>();
		List<Integer> num2 = new ArrayList<>();

		Arrays.parallelSort(numString, 0, numString.length, (a, b) -> Integer.valueOf(b) - Integer.valueOf(a));
		Arrays.parallelSort(numString, 0, numString.length,
				(a, b) -> Integer.valueOf(b.substring(0, 1)) - Integer.valueOf(a.substring(0, 1)));
		for (int i = 0; i < numString.length; i++) {
			
			num2.add(Integer.valueOf(numString[i].substring(0, 1)));
		}
		System.out.println(num2);
		int nn=num2.get(0);
		int cnt=0;
		int iVal=0;
		for(int i = 1 ; i < numString.length;i++) {
			if(nn==num2.get(i)) {
				cnt++;
				iVal=i;
			} else {
				if(iVal-cnt != iVal) {
					numSetting.add(iVal-cnt);
					numSetting.add(iVal);									
				}
				cnt=0;
			}
			if(i==numString.length-1&&cnt!=0) {
				numSetting.add(i-cnt);
				numSetting.add(i);
			}
			nn=num2.get(i);
		}
		System.out.println(numSetting);
		while(numSetting.size()!=0) {
			int len=0;
			int n1 = numSetting.remove(0);
			int n2 = numSetting.remove(0);
			for(int i = n1; i<=n2;i++) {
				len+=numString.length;
			}
//			z.maxNumber("",len,numString,n1,n2);
		}
		
		System.out.println(z.num);
		
		System.out.println(Arrays.toString(numString));
		for(int i = 0 ; i < numString.length;i++) {
			answer+=numString[i];
		}
		System.out.println(answer);
		
		
	}
	void maxNumber(String a,int len,String[] numString,int index1, int index2) {
		if(a!=null&&a.length()==len) {
			num.add(a);
			return;
		}
		
		System.out.println(a);
		for(int i = index1 ; i <= index2;i++) {
				maxNumber(a+numString[i],len,numString,index1, index2);	
			}
		}
	}
		
		
//		String x = numString[0].substring(0, 1);
//		for(int i = 1 ; i < numString.length;i++) {
//			if(numString[i].substring(0, 1).equals(x)) {
//				Arrays.parallelSort(numString, 0, numString.length, (a,b)->Integer.valueOf(b.substring(1, 2))-Integer.valueOf(a.substring(1, 2)));
//			}
//			
//		}
		
		
/////////////////// 
		
//		System.out.println(Arrays.toString(numbers));
	

	
	/////////////////
	
