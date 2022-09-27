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
	List<String> numAns = new ArrayList<>();
	Set<Integer> check = new HashSet<>();
	public static void main(String[] args) {
		home092601 z = new home092601();
		int[] numbers = { 39, 3, 30, 34};
		String[] numString = new String[numbers.length];
		String answer="";
		for (int i = 0; i < numbers.length; i++) {
			numString[i] = "" + numbers[i];
		}

		List<Integer> numSetting = new ArrayList<>();

		Arrays.parallelSort(numString, 0, numString.length, (a, b) -> Integer.valueOf(b) - Integer.valueOf(a));
		Arrays.parallelSort(numString, 0, numString.length,	(a, b) -> Integer.valueOf(b.substring(0, 1)) - Integer.valueOf(a.substring(0, 1)));
		
		int nn=Integer.valueOf(numString[0].substring(0, 1));
		int cnt=0;
		int iVal=0;
		for(int i = 1 ; i < numString.length;i++) {
			if(nn==Integer.valueOf(numString[i].substring(0, 1))) {
				cnt++;iVal=i;
			} else {
				if(iVal-cnt != iVal) {
					numSetting.add(iVal-cnt);numSetting.add(iVal);		
				}
				cnt=0;
			}
			if(i==numString.length-1&&cnt!=0) {
				numSetting.add(i-cnt);numSetting.add(i);
			}
			nn=Integer.valueOf(numString[i].substring(0, 1));
		}
		while(numSetting.size()!=0) {
			z.num.clear();
			int len=0;
			int n1 = numSetting.remove(0);
			int n2 = numSetting.remove(0);
			for(int i = n1; i<=n2;i++) {
				len+=numString[i].length();
			}
			z.maxNumber("",len,numString,n1,n2);
			System.out.println(z.num);
			long maxxx = 0;
			for(String i : z.num) {
				if(maxxx<Long.valueOf(i)) {
					maxxx=Long.valueOf(i);
				}
				z.numAns.add(i);
			}
			answer+=maxxx;
		}
		System.out.println("정답 "+answer);
	}
	void maxNumber(String a, int len, String[] numString, int index1, int index2) {
		if (!a.equals("") && a.length() == len&&check.size()==(index2-index1+1)) {
			num.add(a);
			check.clear();
			return;
		}
		if (a.length() > len) {
			a="";
			check.clear();
			return;
		}
		for (int i = index1; i <= index2; i++) {
			if(check.add(i)==true) {
				maxNumber(a + numString[i], len, numString, index1, index2);
			}
		}
	}
}
		