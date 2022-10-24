package p99programLv2;

public class academy102402멀쩡한사각형 {
    public static void main(String[] args) {
        academy102402멀쩡한사각형 go = new academy102402멀쩡한사각형();

        int w = 12;
        int h = 8;
        System.out.println(go.solution(w,h));
    }
    public long solution(int w, int h) {
        double big;
        double a = w;
        double b = h;
        if(a>b){
            big = a/b;
        } else {
            big = b/a;
        }
        System.out.println(big);
        long answer = w>h? (long)(w*h-big*w): (long)(w*h-big*h);

        return answer;
    }
}
