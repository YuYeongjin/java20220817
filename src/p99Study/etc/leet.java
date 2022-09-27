package p99Study.etc;
public class leet {
	public static void main(String[] args) {
//		String allowed = "fstqyienx";
//		String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		int answer =0;
        for(int i=0; i<words.length;i++) {
        	if(words[i].matches(".*[^"+allowed+"]+.*")) {
        		answer++;
        		System.out.println(words[i]);
        	}
        }        
        System.out.println(answer);
        
    }
}

