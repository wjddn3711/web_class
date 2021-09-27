package web_day11;

public class TvTest {
    public static void main(String[] args) {
        CaptionTv ctv= new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
    }
}
