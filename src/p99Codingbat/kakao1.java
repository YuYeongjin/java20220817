package p99Codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class kakao1 {
	public static void main(String[] args) {
		int cap = 4;
		int n = 5;
		int[] deliveries = {1,0,3,1,2,4926};
		int[] pickups = {0,3,0,4,0,4264};
		boolean ok = false;
		kakao1 a = new kakao1();
		a.answer = 0;
		List<Integer> del = Arrays.stream(deliveries).boxed().collect(Collectors.toList());
		List<Integer> pic = Arrays.stream(pickups).boxed().collect(Collectors.toList());
		a.go(0,cap,n,del,pic,ok);
		System.out.println("정답"+a.answer);
	}
	long answer=0;
	void go (int index,int cap, int n, List<Integer> del, List<Integer> pic, boolean ok) {
		
		System.out.println("go");
		index = 0;
		
		for(int i = 0 ; i < n;i++) {
			if(del.get(del.size()-1)==0) {
				del.remove(del.size()-1);
			}
			if(pic.get(pic.size()-1)==0) {
				pic.remove(pic.size()-1);
			}
		}
		
		if(del.size()!=0) {
			if(del.get(del.size()-1) >=cap) {
				index+=cap;
				del.set(del.size()-1,del.get(del.size()-1)-cap);
				if(del.size()>pic.size()) {
					answer+=del.size()*2;
				} else {
					answer+=pic.size()*2;
				}
			} else {
				if(del.size()>pic.size()) {
					answer+=del.size()*2;
				} else {
					answer+=pic.size()*2;
				}
				index += del.remove(del.size()-1);
				while(index!=cap) {
					if(del.size()==0) {
						break;
					} else {
						if(del.get(del.size()-1)==0) {
							del.remove(del.size()-1);
						} else if(del.get(del.size()-1)!=0) {
							del.set(del.size()-1, del.get(del.size()-1)-1);
							index++;
						}
					}
				}			
			}
		} else {
			System.out.println("ok");
			ok = true;
		}
		System.out.println("이동거리 = "+answer);
		System.out.println(del);
		back(index,cap,n,del,pic,ok);
	}
		
	void back(int index, int cap, int n, List<Integer> del, List<Integer> pic, boolean ok) {
		
		//탈출
		System.out.println("back");		
		if(del.size()==0) {
			index=cap;
		}
		if(ok==true) {
			answer+=pic.size()*2;
		}
		if(pic.size()!=0) {
			if(pic.get(pic.size()-1) >index) {
				pic.set(pic.size()-1,pic.get(pic.size()-1)-index);
				index-=cap;
			} else {
				index -= pic.remove(pic.size()-1);
				while(index!=0) {
					if(pic.size()==0) {
						break;
					} else {
						if(pic.get(pic.size()-1)==0) {
							pic.remove(pic.size()-1);
						} else if(pic.get(pic.size()-1)!=0) {
							pic.set(pic.size()-1, pic.get(pic.size()-1)-1);
							index--;
						}
					}
				}
			}
		}
		System.out.println("수거 도착 후 남은 수거리스트 " + pic);
		System.out.println("이동거리 = "+answer);
		if(del.size()==0&&pic.size()==0) {
			return;
		}
		go(index,cap,n,del,pic,ok);
		
	}
}
