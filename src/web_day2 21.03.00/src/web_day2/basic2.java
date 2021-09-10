package web_day2;

import java.util.Scanner;
import java.util.Random;

public class basic2 {
	public static void main(String[] args) {
		// 연산자... operator + - / * .....
		// 피연산자 operand(변수,상수,수식...)
		
		// x+3;  -> + 연산자 , (x,3) 피연산자
		// 연산자와 피연산자를 조합하여 계산한다
		
		/* 산술 연산자 + - / *... 사칙연산 등 연산
		 * 비교 연산자 >, <, >=, <= 크고 작음을 비교
		 * 논리 연산자 & | ! and or 
		 * 대입 연산자 int a = 10;
		 * 연산자 우선 순위 * > + 
		 * 연산자 결합 규칙 x = y = 3  ( 3 이 먼저 y 로 그다음 y 가 x 로 ) 뒤에서 부터 앞으로
		 * 산술 변환 : 이항 연산은 두 피연산자의 타입이 일치해야 연산이 가능하다. 피연산자의 타입이 서로다르면 연산전에 타입을 일치 시켜야 한다 
		 *   
		 
		 */
		
//		int a = 1275;
//		float f = 20.0f;
		
//		float result = f + (float)a;
		// 보통은 두 피연산자 타입 중에서 더 큰 타입으로 일치 시킨다. 그 이유는 형변환하면 원래의 값이 손실이 될 가능성이 있기 때문이다. 작은 타입에서 큰 타입으로 형변환하는 경우에는
		// 자동으로 형변환 된다. 형 변환 연산자를 생략할 수도 있다 
//		float result = f + a;
//		System.out.println(result);
		
//		int 5 / int 2  -> int 2 결과는 2.5 가 아닌 2 가 나온다 
//		int 5 / (float) int 2 -> 2.5 
		
		// 산술 계산시....
		// 두 피연산자 의 타입을 같게 일치시켜야 한다 
		// 피연산자의 타입이 작은 타입이면 int 변환된다 
		
		// 증감연산자 ++, --
		// ++ 하나씩 증가 
		// -- 하나씩 감소 
		
		
//		int i = 5;
//		i++; // i = i+1, i+=1
//		System.out.println(i); //6
		
		
//		i = 5;
//		++i;
//		System.out.println(i); //6
		
		
//		int i=5,  j = 0;
//		j=i++; //대입하고 증가
//		System.out.println(j);
//		System.out.printf("j=i++ 실행후, i = %d j= %d\n",i,j); //j=i++ 실행후, i = 6 j= 5
//		
//		i = 5;
//		j=0;
//		j=++i; //증가하고 대입
//		System.out.printf("j=++i 실행후, i = %d j= %d",i,j); //j=++i 실행후, i = 6 j= 6
		
//		int i = 5, j=5;
//		System.out.println(++i);
//		System.out.println(j++);
//		System.out.printf("%d %d",i,j);
		
		Scanner sc = new Scanner(System.in);
				
//		System.out.print("성 : ");
//		String xing=sc.next();
//		System.out.print("이름 : ");
//		String name = sc.next();
//		System.out.printf("당신의 이름은: %s",xing+name);
		
//		System.out.print("변수 A:");
//		int a = sc.nextInt();
//		System.out.print("변수 B:");
//		int b = sc.nextInt();
//		
//		if (a % b==0) {
//			System.out.println("B는 A의 약수입니다");
//		}
//		else {
//			System.out.println("B는 A의 약수가 아닙니다");			
//		}
		
		// 정수 값을 입력 받아서 그 수가 양수인지 음수인지 0 인지를 판단하는 프로그램 
//		System.out.print("정수값: ");
//		int target = sc.nextInt();
//		if (target>0) {
//			System.out.println("값이 양수입니다");
//		}
//		else if (target<0) {
//			System.out.println("값이 음수입니다");
//		}
//		else if (target==0) {
//			System.out.println("값이 0입니다");
//		}
//		System.out.print("변수 A:");
//		int a = sc.nextInt();
		
		// 세개의 정수를 입력 받아서 그중에서 최소 값을 구하는 프로그램 
//		System.out.println("정수 a:");
//		int a = sc.nextInt();
//		System.out.println("정수 b:");
//		int b = sc.nextInt();
//		System.out.println("정수 c:");
//		int c = sc.nextInt();
//		int min = a;
//		if (b<min) min=b;
//		if (c<min) min=c;
//		System.out.println(min);
//		if (a<b && a<c) {
//			System.out.println("최소값은 a 입니다");
//		}
//		else if(b<c && b<a) {
//			System.out.println("최소값은 b 입니다");
//		}
//		else if (c<a && c<b) {
//			System.out.println("최소값은 c 입니다");
//		}
		
		Random rd = new Random();
//		int n1 = rd.nextInt(10);  // 10 미만 까지의 정수 난수 발생
////		System.out.println(n1);
//		int n2 = 10+rd.nextInt(90); // 10~100
//		int n3 = -10-rd.nextInt(100); // -10~-110
//		System.out.println(n3);

		// 삼항 연산자 
		// 세개의 피연산자를 사용하여 if 없이 if 를 구현한다 
		// 조건식 ? 식1(true) : 식2(false)
		// result = (x>)?x : y
		
		// 형 변환 casting
		/*
		 * 모든 변수에는 타입이 있다 (int, double,...) 프로그램을 작성하다 보면 같은 타입뿐 아니라 다른 타입간에도 연산을 수행하는 경우가 많이 발생한다 
		 * 연산을 수행할 때에는 타입을 일치 시켜야 한다 
		 * 다른 타입으로 변환하는 것을 casting 이라고 한다 
		 * 	(type) 피연산자 
		 * 	double d = 3.14;
		 * 	int number = (int)d;
		 * 피연산자 d 의 값은 형 변환 뒤에도 아무런 변화가 없다 
		 * 
		 * 변수가 저장할 수 있는 값의 범위보다 더 큰값을 저장하려는 경우에는 형 변환을 생략하면 에러가 난다
		 */
		
//		double d = 3.14;
//		int number = (int)d;
//		System.out.println(number);
//		System.out.println(d);
		
//		byte b = 1000; 에러가 발생한다. byte 범위: -128~127 
//		명시적으로 형변환을 해주면 형변환이 프로그래머의 실수가 아닌 의도적인 것으로 간주하고 에러를 발생시키지 않는다 
		char ch = (char)1000;
//		System.out.println(ch);
		
//		또 다른 예로 계산식에서 자주 형변환이 생략 되는데 서로 다른 두 타입의 연산에서는 먼저 타입을 일치 시킨 다음에 연산을 수행해야 하므로 연산 과정에서 형변환이 자동적으로 이루어 진다 
		
		
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);
		
		// pi 값의 소수점 네째 자리인 5에서 반올림을 해서 3.142 가 출력됬다 
		// round 메서드는 매개변수로 받은 값을 소수점 첫째자리에서 반올림하고 그 결과를 정수로 돌려준다 
	}
}
