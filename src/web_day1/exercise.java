package web_day1;

import java.util.Scanner;

public class exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1-5 한줄에 한 글자씩 자신의 이름을 표시하는 프로그램을 작성
		// 성과 이름 사이에 빈줄을 추
		// 1 단순 출력
//		System.out.println("이\n");
//		System.out.println("정");
//		System.out.println("우");
		// 2 반복 출력
//		String name = "이정우";
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println(name.charAt(i));
//			if (i==0) {
//				System.out.println();
//			}
//		}
		
		// 2-2 2개의 변수 x와 y의 평균을 구하자. x와 y에는 적당한 값을 대입하여 사용
//		int x = 67;
//		int y = 19;
//		int sum = x+y;
//		int avg = sum/2;
//		System.out.printf("x값은 %d입니다.\ny값은 %d입니다."
//				+ "\n합계는 %d입니다.\n평균은 %d입니다.",x,y,sum,avg);
		
		// 2-5 키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자
//		System.out.print("정숫값:");
//		int num = sc.nextInt();
//		System.out.printf("%d를 입력했습니다.",num);
		
		// 2-6 키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력하자
//		System.out.print("정숫값:");
//		int num = sc.nextInt();
//		System.out.printf("10을 더한값은 %d입니다.\n10 뺀 값은 %d입니다.",num+10,num-10);
		
		// 2-7 키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성
		System.out.print("정숫값:");
		String num = sc.next(); // 숫자를 문자열 형태로 저장
		int len = num.length();
		System.out.printf("마지막 자릿수를 제외한 값은 %s입니다.\n",num.substring(0,len-1));
		System.out.printf("마지막 자릿수는 %s입니다",num.charAt(len-1));
		
	}


}
