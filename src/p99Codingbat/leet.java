package p99Codingbat;
public class leet {
	public static void main(String[] args) {
		String allowed = "fstqyienx";
		String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        int answer =0;
        for(int i=0; i<words.length;i++) {
        	ox:for(int j = 0; j<words[i].length();j++) {
        		if(allowed.contains(words[i].substring(j,j+1))) {
        			continue;
        		} else {
        			answer++;
        			break ox;
        		}
        	}
        }
        
        System.out.println(words.length-answer);
    }
}

