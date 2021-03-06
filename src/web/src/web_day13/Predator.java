package web_day13;

public abstract class Predator {
    public abstract String getFood(); // 아무 몸통이 없다. 메서드
//     인터페이스와 메서드는 이름과 정의만 있다. 그 내용은 구현하지 않는다
//     그 이유는 인터페이스는 그냥 규칙이기 때문이다
//     인터페이스에 메서드명을 추가하면 구현하고 있는 클래스들에 에러가 전부 발생한
//     인터페이스에 정의된 메서드는 명령서 처럼 인터페이스를 상속받는 클래스에서 따로 정의해야한다
    public abstract String barkable();
    public boolean isPredator() {
        return true;
    }

    // 추상 메서드로 변경
    // 추상 메서드도 인터페이스의 메소드와 같은 역할을 하는 메서드이다
    // 마찬가지로 몸통이 없다
}
