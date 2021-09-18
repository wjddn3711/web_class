package web_day8;

public class Tv {
    // Tv의 속성(멤버변수, 객체변수)
    String color;
    boolean power;
    int channel;

    // 기능 (메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

}
