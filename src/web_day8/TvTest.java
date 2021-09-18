package web_day8;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv(); // 객체 생성
        tv.channel = 7; // 객체 변수 사용
        tv.channelDown(); // 메서드 사용
        System.out.println(tv.channel);

        // 같은 클래스로 부터 생성되었을지라도 각 객체의 속성은 서로 다른 값을 유지할 수
        // 있으며 메서드도 모든 객체가 가져다가 사용할 수 있다

        Tv a = new Tv(); // 객체 생성
        a.channel = 7; // 객체 변수 사용
        a.channelDown(); // 메서드 사용
        System.out.println(a.channel);

    }
}
