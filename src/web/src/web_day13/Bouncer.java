package web_day13;

public class Bouncer {
    public void barkAnimal(Predator predator){
        System.out.println(predator.barkable());
    }

    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Lion l1 = new Lion();
        Crocodile c1 = new Crocodile();
        Bouncer b = new Bouncer();
        b.barkAnimal(t1);
        b.barkAnimal(l1);
        b.barkAnimal(c1);

    }
    // barkAnimal 메서드는 입력으로 받은 animal 객체가 tiger클래스의 인스턴스인 경우
    // '어흥' lion 클래스 인경우 '으르렁' 이 출력된다
    
    /*
    * t1, l1 객체들은 각각 tiger, lion 객체이기도 하지만 animal 과 bark, preadtor의
    * 객체이기도 하다. 이런 이유로 barkAnimal 메서드의 입력 자료형을 animal 에서 bark로 바꾸어
    * 사용할 수 있다
    *
    * 아렇게 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것을 바로 다형성이라 한다
    *
    * tiger t1 = new tiger();
    * animal a1 = new tiger();
    * predator p1 = new tiger();
    * bark b1 = new tiger();
    *
    * */
}
