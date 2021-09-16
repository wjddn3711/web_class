package web_day7;

import java.util.Scanner;

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
        // Tv ledtv = new Tv();
        // ledtv.channel = 7;
        // ledtv.channelUp();
        // System.out.println(ledtv.channel);
        // 4-22
        Scanner sc = new Scanner(System.in);
        // System.out.print("왼쪽 아래가 직각인 삼각형을 표시합니다.\n단수는?:");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // for (int j = n - i; j < n + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // System.out.print("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.\n단수는?:");
        // int n1 = sc.nextInt();
        // for (int i = 0; i < n1; i++) {
        // for (int j = i; j < n1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // System.out.print("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다.\n단수는?:");
        // int n2 = sc.nextInt();
        // for (int i = 0; i < n2; i++) {
        // for (int j = 1; j < n2 - i; j++) {
        // System.out.print(" ");// 공백 출력
        // }
        // for (int j = n2 - i; j < n2 + 1; j++) {
        // System.out.print("*");// 나머지 별 출력
        // }
        // System.out.println();
        // }
        // System.out.print("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.\n단수는?:");
        // int n3 = sc.nextInt();
        // for (int i = 0; i < n3; i++) {
        // for (int j = n3 - i; j < n3; j++) {
        // System.out.print(" ");// 처음에 공백 출력
        // }
        // for (int j = i; j < n3; j++) {
        // System.out.print("*");// 이후 별 출력
        // }
        // System.out.println();
        // }
        // System.out.println("==========4-22==========");
        // 4-25
        // int num = 0;
        // while (true) {
        // System.out.print("2이상의 정숫값:");
        // num = sc.nextInt(); // 2이상의 정수
        // if (num >= 2)
        // break;
        // else
        // System.out.println("2이상의 정수를 입력하세요!");
        // }
        // int cnt = 0;
        // for (int i = 1; i < num + 1; i++) {
        // if (num % i == 0)
        // cnt++;// num 이 i 로 나누어떨어진다면. 즉, i가 약수라면 cnt+1
        // }
        // if (cnt == 2)
        // System.out.println("소수입니다.");// 1과 자신으로 밖에 나누어떨어지지 않으면 소수이다
        // else
        // System.out.println("소수가 아닙니다.");
        // System.out.println("==========4-25==========\n");

        // System.out.print("정수를 더합니다.\n몇 개를 더할까요?:");
        // int cases = sc.nextInt();
        // int target = 0, sum = 0, cnt = 0;
        // for (int i = 0; i < cases; i++) {
        // System.out.print("정수(0으로 종료):");
        // target = sc.nextInt();
        // if (target == 0)
        // break;
        // sum += target;
        // cnt++;
        // }
        // System.out.printf("합계는 %d입니다.\n평균은 %d입니다.\n", sum, sum / cnt);
        // System.out.println("==========4-26==========\n");
        // System.out.print("정수를 더합니다.\n몇 개를 더할까요?:");
        // int tcase = sc.nextInt();
        // int total = 0, shu = 0, count = 0;
        // for (int i = 0; i < tcase; i++) {
        // System.out.print("정수:");
        // shu = sc.nextInt();
        // if (total + shu > 1000) {
        // System.err.println("합계가 1,000을 넘었습니다.\n마지막 값은 무시합니다.");
        // break;
        // } else {
        // total += shu;
        // count++;
        // }
        // }
        // System.out.printf("합계는 %d입니다.\n평균은 %d입니다.\n", total, total / count);
        // System.out.println("==========4-27==========\n");
        System.out.print("정수를 더합니다.\n몇 개를 더할까요?:");
        int caseNum = sc.nextInt();
        int numTotal = 0, posNum = 0, counted = 0;
        for (int i = 0; i < caseNum; i++) {
            System.out.print("정수:");
            posNum = sc.nextInt();
            if (posNum < 0)
                System.out.println("음수는 더하지 않습니다.");
            else {
                counted++;
                numTotal += posNum;
            }
        }
        System.out.printf("합계는 %d입니다.\n평균은 %d입니다.\n", numTotal, numTotal / counted);
        System.out.println("==========4-28==========\n");
    }
}
