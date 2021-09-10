import java.util.Random;
import java.util.Scanner;

public class Some {
    public static void main(String[] args) {
        // if - else if
        /*
         * if (조건식) { 수행 구문 } else if(조건식) }{ 수행 구문 }.... else:{ 수행 구문 } 첫번째 조건식부터 순서대로
         * 평가해서 참인 조건식을 만나면 그 행당 블럭만 수행하고 벗어난다
         * 
         */
        // int score = 0;
        // String grade = "";
        // Scanner sc = new Scanner(System.in);
        // System.out.print("학생의 점수를 입력하세요:");
        // score = sc.nextInt();

        // if (score >= 90) {
        // grade = "A";
        // } else if (score >= 80) {
        // grade = "B";
        // } else if (score >= 70) {
        // grade = "C";
        // } else {
        // grade = "D";
        // }
        // if (score % 10 >= 8) {
        // grade += "+";
        // } else if (score % 10 < 4) {
        // grade += "-";
        // } else {
        // }
        // System.out.println("학생의 학점은 " + grade + "입니다");

        /*
         * switch if 문은 기본형 자체가 참과 거짓의 두가지 밖에 없기 때문에 경우의 수가 많아 질수록 else if 를 추가해야 하므로
         * 조건식이 만아져 복잡해진다. 처리 시간또한 많아진다
         * 
         */

        /*
         * # switch if문은 기본형 자체가 참ㄱ과 거짓의 두 가지 밖에 없기 때문에 경우의 수가 많아질수록 else if 를 추가해야하므로
         * 조건식 많아서져서 복잡해진다. 처리 시간도 많이걸린다. if와는 달리 switch문은 단 하나의 조건식으로 많은 경우를 처리한다. 표현도
         * 간결하여 알아보기 쉽다. 처리할 경우의 수가 많다면 switch를 사용하는 것이 좋다. 그러나 switch제약조건이 있기 때문에 어쩔수
         * 없이 if를 사용해야 하는 경우도 있다.
         * 
         * 1. 조건식을 계산한다. 2. 조건에 일치하는 case로 점프한다. 3. 그 case 문장들을 수행한다. 4. break문이나
         * switch구문의 끝에서 전체를 빠져나간다.
         * 
         * switch (조건식) { case 1 :
         * 
         * case 2 :
         * 
         * case 3 :
         * 
         * default : //조건식의 결과와 일치하는 경우가 없을 경우 수행 else }
         * 
         */

        // System.out.println("현재월을 입력하세요");

        // Scanner sc = new Scanner(System.in);
        // int month = sc.nextInt();

        // switch(month) {
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("현재 계절은 봄입니다.");
        // break;
        // case 6: case 7: case 8:
        // System.out.println("현재 계절은 여름입니다.");
        // break;
        // case 9: case 10: case 11:
        // System.out.println("현재 계절은 가을입니다.");
        // break;
        // case 12: case 1: case 2:
        // System.out.println("현재 계절은 겨울입니다.");

        // }

        // // # 사람 컴퓨터 의 가위 바위 보 게임을 만드세요
        // // # 컴퓨터는 난수를 발생시켜서 가위 바위 보를 구현하고
        // // 1 2 3
        // 30줄 이하로...
        // 당신은 ? 입니다
        // 컴퓨터는 ? 입니다.

        // 비겼습니다. 당신이 이겼습니다. 컴퓨터가 이겼습니다.

        // switch (key) {
        // case value:

        // break;

        // default:
        // break;

        // }
        // 사람과 컴퓨터의 가위 바위 보 게임
        // 난수를 발생시켜 가위 바위보를 구현
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer = rand.nextInt(3);
        computer += 1; // 컴퓨터는 0~2 까지의 난수이기 때문에 +1 을 하여 1~3 이 되도록 설정한다
        System.out.println("가위:1, 바위:2, 보:3 를 입력하세요: ");
        int user = sc.nextInt();
        // if 나 switch 를 통해 가위 바위 보 인지 문자열을 출력 할 수는 있지만 문제의 요구가 아니라 생각되어 숫자로 표기 하였습니다
        System.out.println("당신은 " + user + " 입니다\n컴퓨터는 " + computer + " 입니다");
        int key = computer - user; // 컴퓨터 가 주체이며 컴퓨터가 더 큰 경우는 차가 1, 2 인 경우인데
        // ex) case 1: com=3, user=1, key=2, user wins case 2: com=2, user=1, key=1, com
        // wins 경우의 수를 보자면 총 다섯가지 경우가 있다

        switch (key) {
            case -1:
                System.out.println("당신이 이겼습니다");
                break;
            case -2:
                System.out.println("당신이 졌습니다");
                break;
            case 0:
                System.out.println("비겼습니다");
                break;
            case 1:
                System.out.println("당신이 졌습니다");
                break;
            case 2:
                System.out.println("당신이 이겼습니다");
                break;
        }

    }
}
