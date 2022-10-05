package p99programLv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class adacemy100501다리를지나는트럭 {
	public static void main(String[] args) {
		adacemy100501다리를지나는트럭 go = new adacemy100501다리를지나는트럭();
		int bridge_length =10;
		int weight =30;
		int[] truck_weights= {9,8,7,6,5,4,3,2,1};
		System.out.println(go.solution(bridge_length, weight, truck_weights));
	
	
	}	
	static class truckTime{
		int truck; int cnt;
		truckTime(int truck, int cnt) {
			this.cnt=cnt; this.truck=truck;
		}
	}
	int answer = 0;
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int[] truck = new int[truck_weights.length];
        List<Integer> finish = new ArrayList<>();
        
        int now = 0;
        int restWeight = weight;
        tictoc(0,now,restWeight,bridge_length,truck_weights);        	
        
        return answer;
    }
	
	void tictoc(int index,int now, int restWeight, int bridge_length, int[] truck_weights) {
		Queue<truckTime> myCar = new LinkedList<>();
		List<truckTime> finish = new ArrayList<>();
		while(finish.size()!=truck_weights.length) {			
			System.out.println((answer+1)+"일 차 도로");
			if(index!=truck_weights.length) {
				
				if(restWeight>=truck_weights[index]&&index<truck_weights.length) {
					myCar.add(new truckTime(truck_weights[index],0));		
					restWeight-=truck_weights[index];
					System.out.println("현재 도로차량 개수 :" + myCar.size()+"잔여 도로 무게 : "+restWeight);
					index++;
				}
				
			}
			myCar.forEach((a)->a.cnt++);
			myCar.forEach((a)->System.out.println("차량들 : "+ a.cnt));
			
			if(myCar.peek().cnt==bridge_length) {
				restWeight +=myCar.peek().truck;
				System.err.println(myCar.peek().truck+"번째 트럭 탈출 : " +myCar.peek().cnt);
				finish.add(myCar.remove());
			}
			answer++;
		}

	}
}
