package p99Study.cafe;

public class cafe2 {
	public static void main(String[] args) {
		System.out.println((1000*1001)/2);
		String new_id = "=.=";
		String answer= "";
		String test = "";
		new_id = new_id.toLowerCase();
		for(int i = 0; i<new_id.length();i++) {
			if(new_id.charAt(i)>32&&new_id.charAt(i)<45||
					new_id.charAt(i)==47||
					new_id.charAt(i)>57&&new_id.charAt(i)<65||
					new_id.charAt(i)>90&&new_id.charAt(i)<95||
					new_id.charAt(i)==96||
					new_id.charAt(i)>122&&new_id.charAt(i)<127) {
				continue;
			} else {
				answer +=new_id.substring(i, i+1);
			}
		}
		new_id = "";
		for(int i =0 ; i<answer.length(); i++) {
			if(answer.substring(i, i+1).equals(test)&&answer.substring(i, i+1).equals(".")) {
				continue;
			} else {				
				new_id +=answer.substring(i, i+1);
			}
			test = answer.substring(i, i+1);
		}
		if(new_id.substring(0,1).equals(".")) {
			new_id = new_id.substring(1,new_id.length());
		}
		if(new_id.length()>1){
			if(new_id.substring(new_id.length()-1,new_id.length()).equals(".")) {
				new_id = new_id.substring(0,new_id.length()-1);
			}			
		}
		if(new_id.equals("")) {
			new_id = "a";
		}
		if(new_id.length()>15) {
			new_id=new_id.substring(0, 15);
			if(new_id.substring(new_id.length()-1,new_id.length()).equals(".")) {
				new_id = new_id.substring(0,new_id.length()-1);
			}
		}
		for(int i=0; i<3; i++) {
			if(new_id.length()<3&&new_id.length()!=0) {
				new_id+=new_id.substring(new_id.length()-1,new_id.length());
			}			
		}
		answer = new_id;
		System.out.println(answer);
	}
}
