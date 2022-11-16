package p99programLv2;

public class academy102402멀쩡한사각형_notsolve {
    public static void main(String[] args) {
        academy102402멀쩡한사각형_notsolve go = new academy102402멀쩡한사각형_notsolve();

        int w = 13;
        int h = 6;
//        System.out.println(go.solution(w,h));
        System.out.println(go.solution2(w,h));

    }
    public long solution(int w, int h) {
        long answer=0;
        double big =0; double small=0;
        if(w>h){
            big=w; small=h;
        } else{
            big=h; small=w;
        }
        System.out.println(big + " / / " + small);
        double a=big/small;
        if(a!=(long)a){
            long b = (long)a+1;
            System.err.println(b);
            return (long)(big*small-b*small);
        }
        System.out.println(a);

        return (long)(big*small-a*small);
    }

    public long solution2(int w, int h) {
        double big =0; double small=0;
        if(w>h){
            big=w; small=h;
        } else{
            big=h; small=w;
        }
        int i = (int) small;
        for(;i>=1;i--){
            if(w%i==0 && h%i==0){
                break;
            }
        }


        return (long)(big*small-small);
    }
}
