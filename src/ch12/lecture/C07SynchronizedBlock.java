package ch12.lecture;

public class C07SynchronizedBlock {
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {0};
				
		Thread t1 = new Thread(()->{
			for(int i =0; i<1000000; i++) {
				// 동기화 블럭 ( ) 안에 객체를 넣어주면 됨
				// 객체 획득해야 블럭실행 가능
				// 블럭 실행 후 객체 반납
				synchronized (arr) {
					arr[0]++;					
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i =0; i<1000000; i++) {
				synchronized (arr) {
					arr[0]++;					
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(arr[0]);
	}
}
