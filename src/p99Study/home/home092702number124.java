package p99Study.home;

public class home092702number124 {
	public static void main(String[] args) {
		
		int n = 19;
		String answer = "";
		String a = "1";
		String b = "2";
		String c = "4";
		String[] num = new String[n*3/10+1];
		
		for(int i = 0; i<num.length; i++){                       
			if(n%3==1){
				num[i]=a;
			} else if(n%3==2){
				num[i]=b;
			} else if(n%3==0){
				num[i]=c;
			}
			if(n<=3){
				break;
			}
			n=n/3; 
			System.out.println(n);
		}
		for(int i = num.length-1;i>=0;i--){
			if(num[i]!=null){
				answer+=num[i];    
			}            
		}
		System.out.println(answer);
	}
}
