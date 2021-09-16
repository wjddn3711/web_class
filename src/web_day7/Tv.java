package web_day7;

public class Tv {

    // Tv 의 속성
    String color;
    boolean power;
    int channel;

    // Tv 의 기능(메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channeDown() {
        channel--;
    }
}
