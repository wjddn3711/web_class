package web_day8;

public class CardTset {
    public static void main(String[] args) {
        // System.out.println(Card.width);
        // System.out.println(Card.height);
        // 클래스 변수(static 변수는 객체 생성없이 직접 사용 가능하다)
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 2;

        Card c2 = new Card();
        c2.kind = "Clover";
        c2.number = 7;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ( " + c1.width + "," + c1.height + " )");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 ( " + c2.width + "," + c2.height + " )");
        c1.width = 50;
        c1.height = 80;
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ( " + c1.width + "," + c1.height + " )");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 ( " + c2.width + "," + c2.height + " )");
        /*
         * card 클래스의 클래스 변수(static) 변수인 width height는 card 클래스의 인스턴스를 생성 하지 않고도
         * 클래스명.변수명으로 접근해서 사용할 수 있다
         * 
         * card 클래스의 인스턴스인 c1과 c2는 클래스 변수인 width height을 공유하기 때문에 c1의 width height을 변경하면
         * c2의 width, height 모두 같이 바뀌는 것을 볼수 있다. 같은 저장공간을 참조함으로 항상 같은 값을 갖게 된다
         * 
         * 객체 변수는 객체가 생성될때 마다 생성되므로 객체마다 각기 다른 값을 유지한다 클래스 변수는 모든 객체가 하나의 저장공간을 공유하므로 항상
         * 같은 값을 갖는다
         * 
         * 메서드: 특정 작업을 수행하는 문장들이다. 기본적으로 수학에서의 함수와 유사하다 어떤 값을 입력 하면 작업을 수행하여 그 결과를 반환한다
         * 
         * 메서드 사용 이유 1 높은 재사용성 - 한번 만들어 놓은 메서드는 몇번이고 호출할 수 있다. 다른 프로그램에서도 사용 가능 2 중복된 코드
         * 제거 - 프로그램을 작성하다보면 같은 내용을 여러곳에서 똑같이 반복해서 사용하는 일이 많다 이런 반복되는 문장들을 묶어서 하나의 메서드로
         * 만들면 단 한줄의 메서드 호출만으로 몇 십줄을 입력하는 동일한 효과를 낼 수 있다 3 프로그램의 구조화 -
         * 
         * return 타입을 void 로 설정하면 리턴값, 반환값이 없는 경우 사용된다 return은 메서드의 반환타입이 void 아닌 경우 반드시
         * 있어야 하며 항상 return은 1번만 반환된다
         * 
         * int add(int a, int b){ 선언부 void 리턴이 없다 return a+b }
         * 
         */
    }
}
