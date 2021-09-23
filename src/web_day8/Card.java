package web_day8;

public class Card {
    String kind;
    int number;
    static int width = 100; // 클래스 변수
    static int height = 250; // 클래스 변수
    public void which(){
    	System.out.println("Your card is" + this.kind + this.number);
    }

    // 기본 생성자
    Card(){
    	kind = "Joker";
        number = 0;
    }
}
