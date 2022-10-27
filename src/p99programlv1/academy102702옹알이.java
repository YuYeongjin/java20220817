package p99programlv1;

public class academy102702옹알이 {
    public static void main(String[] args) {


        academy102702옹알이 go = new academy102702옹알이();

        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(go.solution(babbling));
    }
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible={"aya", "ye","woo","ma"};
        for(int i =0; i<babbling.length;i++){
            int cnt=0;
            boolean[] two = new boolean[4];
            while (true){
                if(babbling[i].startsWith(possible[cnt])&&!two[cnt]){
                    babbling[i]=babbling[i].substring(possible[cnt].length());
                    two=new boolean[4];
                    two[cnt]=true;
                    cnt=0;
                } else{
                    cnt++;
                }
                if(cnt==4){
                    if(babbling[i].length()==0){
                        answer++;
                        System.out.println("현재 인덱스 : " + i);
                        break;
                    } else{
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
