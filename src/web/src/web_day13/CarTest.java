package web_day13;

public class CarTest {
    public static void main(String[] args) {
        Car c = null;
        Sonata s1 = new Sonata();
        Sonata s2 = null;

        s1.convert();
        c = s1; // car = (car)s1; 형변환이 생략된 형태
//        c.convert(); // 에러발생. 부모 car 타입의 참조변수로는 convert()를 호출할 수 없다


//        s2 = Sonata(c); // 자식 <- 부모
        s2.convert();

    }
}
