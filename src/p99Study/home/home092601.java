package p99Study.home;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class home092601 {
	public static void main(String[] args) {
//		int[] numbers = {3, 319,30, 34, 380,32,300,309,39, 5, 9,91,330};
		int[] numbers = {70,0,0,0,0,0};
		
		String answer="";
		TreeSet<String> set = new TreeSet<>();
		List<String> numAns = new ArrayList<>();
		List<String> check = new ArrayList<>();


		for(int i = 0;i<numbers.length;i++) {
			set.add(""+numbers[i]);
		}
		for(String item :set) {

			if(item.length()==1) {
				check.add(item);
			}
		}
		for(int i =0;i<check.size();i++) {
			set.add(check.get(i)+check.get(i)+check.get(i));
			set.remove(check.get(i));
			check.set(i,check.get(i)+check.get(i)+check.get(i));
		}

		System.out.println(check);
		System.out.println("set : "+set);
	
		numAns = set.stream().collect(Collectors.toList());
		for(int i=0;i<numAns.size();i++) {
			for(int l = 0; l<check.size();l++) {
				if(numAns.get(i).equals(check.get(l))) {
					numAns.set(i, numAns.get(i).substring(0, 1));
				}
			}
		}
		System.out.println("수정 list로"+numAns);
		
		for(int i = numAns.size()-1;i>=0;i--) {
			answer+=numAns.get(i);
		}
		
		System.out.println(answer);
	}
		/*
		int nn=Integer.valueOf(numString[0].substring(0, 1));
		int cnt=0;
		int iVal=0;
		for(int i = 1 ; i < numString.length;i++) {
			if(nn==Integer.valueOf(numString[i].substring(0, 1))) {
				cnt++;iVal=i;
			} else {
				numSetting.add(iVal-cnt);numSetting.add(iVal);		
				cnt=0;
			}
			if(i==numString.length-1&&cnt!=0) {
				numSetting.add(i-cnt);numSetting.add(i);
			}
			nn=Integer.valueOf(numString[i].substring(0, 1));
		}
		System.out.println(numSetting);
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
	*/
}
		