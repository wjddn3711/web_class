package web_day8;

public class TvTest2 {
    public static void main(String[] args) {
        // 객체 배열 - 많은 수의 객체를 다뤄야 할때 배열로 다루면 편리하다. 객체 역시 배열로
        // 다룰 수 있다. 그런데 객체 배열안에 객체가 저장되는 것은 아니다. 객체의 주소가 저장된다
        // 사실 객체 배열은 참조 변수들을 하나로 묶은 참조변수 배열인 것이다
        // Tv tv1, tv2, tv3 -> Tv[] tvArr = new Tv[3];
        // 길이가 3인 객체 배열 tvArr를 생성하면 각 요소의 참조 변수의 기본값인 null값으로 자동 초기화
        // 된다. 이 배열은 3개의 객체, 정확히는 객체의 주소들을 저장하게 된다

        Tv[] tvArr = new Tv[3]; // 길이가 3인 객체 배열 생성
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
            System.out.println(tvArr[i].channel);
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.println("i번째 채널: " + tvArr[i].channel);

            // 선언 위치에 따른 변수의 종류
            /*
             * class Variables { int i; // 인스턴스 변수/ 객체 변수 클래스 영역에서 선언되면 클래스의 인스턴스를 생성할 때 만들어
             * 진다 객체는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다 객체 마다 고유한 상태를 유지해야 하는 속성의 경우 객체변수로
             * 선언한다
             * 
             * static int j; //클래스 변수/ 공유 변수 클래스 변수를 선언하는 방법은 static을 붙이기만 하면 된다 객체마다 독립적인
             * 저장공간을 갖는 객체변수와는 달리 모든 객체에게 공통된 저장공간(변수)을 공유하게 된다
             * 
             * void method(){ int k; // 지역 변수 메서드 내에 선언되어 메서드 내에서만 사용된다. 메서드가 종료되면 소멸된다
             * 
             * } }
             */

        }
    }
}
