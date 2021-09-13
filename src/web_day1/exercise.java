package web_day1;

import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1-5 한줄에 한 글자씩 자신의 이름을 표시하는 프로그램을 작성
		// 성과 이름 사이에 빈줄을 추
		// 1 단순 출력
		// System.out.println("이\n");
		// System.out.println("정");
		// System.out.println("우");
		// 2 반복 출력
		// String name = "이정우";
		// for (int i = 0; i < name.length(); i++) {
		// System.out.println(name.charAt(i));
		// if (i==0) {
		// System.out.println();
		// }
		// }

		// 2-2 2개의 변수 x와 y의 평균을 구하자. x와 y에는 적당한 값을 대입하여 사용
		// int x = 67;
		// int y = 19;
		// int sum = x+y;
		// int avg = sum/2;
		// System.out.printf("x값은 %d입니다.\ny값은 %d입니다."
		// + "\n합계는 %d입니다.\n평균은 %d입니다.",x,y,sum,avg);

		// 2-5 키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자
		// System.out.print("정숫값:");
		// int num = sc.nextInt();
		// System.out.printf("%d를 입력했습니다.",num);

		// 2-6 키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력하자
		// System.out.print("정숫값:");
		// int num = sc.nextInt();
		// System.out.printf("10을 더한값은 %d입니다.\n10 뺀 값은 %d입니다.",num+10,num-10);

		// 2-7 키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성
		System.out.print("정숫값:");
		String num = sc.next(); // 숫자를 문자열 형태로 저장
		int len = num.length();
		System.out.printf("마지막 자릿수를 제외한 값은 %s입니다.\n", num.substring(0, len - 1));
		System.out.printf("마지막 자릿수는 %s입니다", num.charAt(len - 1));
		// System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>");
		// Scanner sc = new Scanner(System.in);
		// int user = sc.nextInt();

		// int com = (int)(Math.random() * 3) + 1; // 1,2,3 중 하나 생성

		// System.out.println("당신은 " + user + "입니다.");
		// System.out.println("컴은 " + com + "입니다.");

		// //math.random() 0.0 ~ 1.0미만 사이의 double로 난수를 생성한다.

		// // 0.0 <= 난수 < 1.0 1,2,3
		// //양변변에 3을 곱한다.

		// switch(user-com) {
		// case 1: case -2:
		// System.out.println("당신이 이겼습니다.");
		// break;
		// case 2: case -1:
		// System.out.println("컴이 이겼습니다.");
		// break;
		// case 0:
		// System.out.println("무승부 입니다.");

		// }
		// 컴 1가위 2바위 3보
		// 사람
		// 1 가위 무승부 컴승 사람승 사람 - 컴 0 무승부
		// 2 바위 사람승 무승부 컴승 사람 - 컴 2-1 1 사람승
		// 3 보 컴승 사랑승 무승부 1-3 -2 사람승
		// 1-2 -1 컴승
		// 3-1 2 컴승

		// 반복문 - for / while / do-while
		// 어떤 작업을 반복적으로 수행시킬 때 사용한다.
		// for while 은 한번도 실행되지 않을 수 있다.
		// do~while 무조건 최소한 한번 실행되는 것을 보장한다.
		// for 와 while은 구조나 기능이 매우 유사사여 서로 변환이 가능하다.
		// 주로 for는 반복횟수가 정확할 때 사용 while 반복횟수를 정확히 모를때

		// for(start ; stop ; step) 시작 끝 스텝 / 초기화 조건식 증감식

		// for (int i = 1 ; i <= 10 ; i++) {
		// System.out.println("Hello World");
		// }

		// start int i = 1 int i = 0 i =1, j=0
		// stop i <= 100 조건이 참일동안 계속 반복
		// step i++ , i-- , i += 2, i += 3

		// for (int i = 1, j = 10 ; i <=10 ; i++, j--)

		// start ; stop ; step) 시작 끝 스텝 전부 생략 가능

		// for (;;) -> 무한반복...

		// 1부터 10까지 쭉 인쇄
		// for ( int i = 1 ; i <= 10 ; i++){
		// System.out.println(i);
		// }

		// 1부터 10까지 누적 합계 계산

		// int sum = 0;

		// for ( int i = 1 ; i <= 10 ; i++){
		// sum = sum + i;
		// }

		// System.out.println("1부터 10까지의 합은 : " + sum);

		// for(int i = 1, j = 10 ; i <= 10 ; i++, j--) {
		// System.out.println(i + "\t" + j);

		// }

		// for(int i = 1 ; i <= 10 ; i++) {
		// System.out.println(i + "\t" + (11-i));

		// }
		// for 문에 사용되는 변수의 수가 적은 것이 더 효율적이고 간단하므로
		// 변수들의 관계를 잘 파악하여 불필요한 변수의 사용을 줄이는게 좋다.

		// 중첩 for문 - for 안에 또다른 for 문 사용

		// *****
		// *****
		// *****
		// *****
		// *****

		// for ( int i = 1 ; i <= 5 ; i++) {
		// for ( int j = 1 ; j <= 5; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

		// *
		// **
		// ***
		// ****
		// *****

		// for ( int i = 1 ; i <= 5 ; i++) {
		// for ( int j = 1 ; j <= i; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

		// 숫자를 입력을 받아서 그 줄 수만큼의 꺼구로 직각삼각형.

		// *****
		// ****
		// ***
		// **
		// *

		// for ( int i = 1 ; i <= 5 ; i++) {
		// for ( int j = 5 ; j >= i; j--) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

		// 이중 for문을 사용해서 구구단을 출력하세요
		// 2 * 1 = 2
		// 2 * 2 = 4
		// .
		// .
		// .
		// .
		// 9 * 9 = 81

		// for (int i = 2 ; i <= 9 ; i++) {
		// for (int j = 1 ; j <= 9 ; j++) {
		// System.out.println(i + " * " + j + " = " + i*j);
		// }
		// System.out.println();
		// }

		// 고급 for

		// for(start ; stop ; step) -> for (변수명 : 배열)

		// int[] arr = {1,2,3,4,5};

		// for (int i = 0 ; i <arr.length ; i++) {
		// System.out.println(arr[i]);
		// }

		// for (int t : arr) {
		// System.out.println(t);
		// }

		// 고급 for문은 일반 for문과는 달리 배열의 요소를 하나씩
		// 읽어오는 용도로만 사용된다. 제약이 있다.

		// while...for문에 비해서 간단하다. 조건이 하나이며 조건을
		// 만족하는 동안 반복한다.
		// for문과 while문은 항상 서로 변환이 가능하다.
		// for문이 더욱 간결하다. 반복횟수가 정확하지
		// 않을때 주로 사용된다.
		// while문은 조건 생략이 불가능

		// int i = 5;
		// while (i-- != 0) { // 0이 아닌 동안만 참
		// System.out.println(i);
		// }

		// int i = 5;
		// while (i != 0) { // 0이 아닌 동안만 참
		// i--;
		// System.out.println(i);
		// }

		// 숫자를 입력받아서 각 자리수들의 합계를 계산
		// 12345 => 1+2+3+4+5 => 15 를 출력하는 프로그램 while

		int sum = 0;

		System.out.print("숫자를 입력하세요 >");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 12345

		while (num != 0) {
			sum = sum + num % 10; // 5 4 3 2 1
			System.out.println(sum);

			num = num / 10;
			System.out.println(num);

		}

		System.out.println(sum);
	}

}
