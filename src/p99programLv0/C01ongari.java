package p99programLv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01ongari {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		int answer =0;
		List<String> bab = new ArrayList<>();
		bab.add("aya");bab.add("ye");bab.add("woo");bab.add("ma");
		
		System.out.println(bab);
		boolean[] b = new boolean[4];
		
		for(int i=0;i<babbling.length;i++) {
			b = new boolean[4];
			for(int j=0;j<15;j++){
				for(int l=0;l<bab.size();l++) {
					if(babbling[i].startsWith(bab.get(l))&&b[l]!=true){
						babbling[i]=babbling[i].substring(bab.get(l).length(), babbling[i].length());
						b = new boolean[4];
						b[l]=true;
					}
				}
			}
		}
	for(int i = 0 ; i < babbling.length;i++) {
		if(babbling[i].equals("")) {
			answer++;
		}
	}
	System.out.println(Arrays.toString(babbling));
	System.out.println(answer);
	}
}
