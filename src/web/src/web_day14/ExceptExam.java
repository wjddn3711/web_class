package web_day14;

public class ExceptExam {
    public void shouldBeRun() {
        System.out.println("ok thanks...");
    }

    public static void main(String[] args) {
//        int c = 4/0;
//        System.out.println(c);
        // 4를 0으로 나누려고 시도했더니 ArithmeticException 에러가 발생
//        int [] a = {1,2,3};
//        System.out.println(a[3]);
        // 배열의 인덱스를 초과한 수를 출력하려고 했더니 ArrayIndexOutOfBoundsException 발생
        // 자바는 이런 예외들이 발생하면 프로그램을 중단하고 에러메시지를 출력한다
//        int c = 0;
//        try {
//            c = 4/0;
//            System.out.println(c);
//        } catch (Exception e) {
//            c -=1;
//        }finally {
//            System.out.println(c);
//        }
//        ExceptExam exam = new ExceptExam();
//        int c;
//        try {
//            c= 4/0;
//        } catch (Exception e) {
//            System.out.println("0으로 나눌수 없습니다");
//        } finally {
//            exam.shouldBeRun();
//        }
        // finally 는 예외 발생의 유무와는 상관없이 언제나 실행된다



    }
}
