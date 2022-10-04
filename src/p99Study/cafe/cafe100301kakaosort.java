package p99Study.cafe;

import java.util.*;

public class cafe100301kakaosort {
	public static void main(String[] args) {
		cafe100301kakaosort go = new cafe100301kakaosort();
//		String[] files={"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "f-9 Tomcat","F-1214 Tomcat","f-07 Tomcat","g-07 Tomcat"};
		String[] files={"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		
		System.out.println(Arrays.toString(go.solution(files)));
	}
	
	public String[] solution(String[] files) {
        String text = "";
        List<Integer> numberL= new ArrayList<>();
        int[] head = new int[files.length];
        System.out.println(Arrays.toString(files));
        for(int i = 0; i < files.length;i++) {
        	text="";
        	for(int j = 0; j< files[i].length();j++) {
        		if(files[i].charAt(j)>=48&&files[i].charAt(j)<58) {
        			head[i]= j;
       				break; 
        		}
        	}
        	for(int l =head[i]; l<files[i].length();l++) {
        		if(files[i].charAt(l)>47&&files[i].charAt(l)<58) {
        			text+=files[i].substring(l, l+1);
        		} else {
        			break;
        		}
        	}
        	numberL.add(Integer.valueOf(text));
        }
        
        String word = "";
        List<Integer> nnn = new ArrayList<>();
        for(int i = 0 ; i < files.length;i++) {
        	nnn.add(i);
        	if(files[i].substring(0, head[i]).equalsIgnoreCase(word)) {
        		nnn.set(i, nnn.get(i-1));
        	}
        	word = files[i].substring(0, head[i]);
        }
        System.out.println(Arrays.toString(head));
        System.out.println(numberL);
        System.out.println(nnn);
        System.out.println("실행");
        Arrays.sort(files, (a,b)->a.substring(0, head[Arrays.asList(files).indexOf(a)])
        			.compareToIgnoreCase(b.substring(0, head[Arrays.asList(files).indexOf(b)])));        	
        
        
        for(int i = 0 ; i < files.length;i++) {
        	if(nnn.indexOf(i)!=-1) {
        		Arrays.parallelSort(files, nnn.indexOf(i),nnn.lastIndexOf(i)+1, 
        				(a,b)->Integer.valueOf(numberL.get(Arrays.asList(files).indexOf(a)))
        				-Integer.valueOf(numberL.get(Arrays.asList(files).indexOf(b))));        		
        	}
        }
        return files;
    }
}

