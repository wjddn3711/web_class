package web_day7;

public class OOP {
    public static void main(String[] args) {
        /*
         * 객체지향 언어의 특징 1. 코드의 재사용성이 높다 2. 코드의 관리가 용이하다 3. 신뢰성이 높은 프로그래밍을 가능하게 한다
         * 
         * 객체지향언어의 가장 큰 장점은 '코드의 재사용성이 높고 유지보수가 용이하다 ' >> 시간과 비용을 줄여준다
         * 
         * 클래스와 객체 클래스란 객체를 정의해 놓은 설계도, 틀 이라고 정의할 수 있다 객체는 클래스에 정의된 대로 생성된다 - 클래스의 정의:
         * 객체를 정의해 놓은 설계도 - 클래스의 용도: 객체를 생성하는데 사용한다
         * 
         * - 객체의 정의: 클래스를 통해 실제 만들어진 것 - 객체의 용도: 객체의 기능과 속성에 따라 다르다
         * 
         * 클래스 객체 - 제품 설계도 -제품 - TV 설계도 -TV - 붕어빵 기계 -붕어빵 설계도를 잘 설계해야 제품을 쉽게 만든다 클래스를 한번
         * 만 잘 만들어 놓으면 객체를 쉽게 만들 수 있다
         * 
         * JDK (Java Development Kit)는 프로그래밍을 위한 많은 유용한 클래스를 기본적으로 제공한다
         * 
         * 객체와 인스턴스 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 한다 인스턴스는 클래스와의 관계를 얘기할때 사용한다 어떤
         * 클래스로 부터 만들어낸 객체 보다는 어떤 클래스로 부터 만들어낸 인스턴스가 적당한 표현이다 'sc 객체는 입력을 받을 때 사용한다'
         * 'random 객체는 난수를 발생시킬때 사용한다'
         * 
         * 객체의 구성요소 = 속성과 기능
         * 
         * 속성(property) 기능(function) - function : 클래스 밖에서 기능 method(자바) : 클래스 안에서 기능.
         * 자바에서는 메서드 단어만 사용한다 ledTV 라는 객체 - 속성: 크기, 길이, 색상, 채널... 기능: 켠다, 끈다, 소리를 높인다 .
         * 채널을 바꾼다 속성 - (멤버)변수 int channer 기능 - 메서드 channelUP(...)
         */
        Tv ledtv = new Tv();
        ledtv.channel = 7;
        ledtv.channelUp();
        System.out.println(ledtv.channel);

    }
}
