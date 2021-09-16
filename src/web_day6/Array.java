package web_day6;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        // int[] iArr = { 1, 2, 3, 4, 5 };
        // char[] chArr = { 'a', 'b', 'c', 'd', 'e' };

        // // for (int i = 0; i < chArr.length; i++) {
        // // System.out.println(chArr[i]);
        // // }
        // // for (int i = 0; i < iArr.length; i++) {
        // // System.out.println(iArr[i]);
        // // }
        // System.out.println(Arrays.toString(iArr));
        // System.out.println(Arrays.toString(chArr));

        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] tmp = new int[arr.length * 2];
        // // for (int i = 0; i < arr.length; i++) {
        // // tmp[i] = arr[i];
        // // }
        // // System.out.println(Arrays.toString(tmp));
        // System.arraycopy(arr, 0, tmp, 0, arr.length);
        // System.out.println(Arrays.toString(tmp));

        // 1
        // Scanner sc = new Scanner(System.in);
        // int[] score = { 100, 88, 100, 100, 90 };
        // int min = score[0];
        // int max = score[0];
        // for (int i = 1; i < score.length; i++) {
        // if (min > score[i])
        // min = score[i];
        // if (max < score[i])
        // max = score[i];
        // }
        // System.out.println("min:" + min);
        // System.out.println("max:" + max);
        // int sum = 0;
        // for (int i = 0; i < score.length; i++) {
        // sum += score[i];
        // }
        // System.out.printf("총점:%d\n평균:%.2f\n", sum, (double) sum / score.length);
        // Random rand = new Random();
        // int[] lotto = new int[6];
        // boolean flag = true;
        // int i = 0;
        // int num = 0;
        // while (true) {
        // num = rand.nextInt(45) + 1;
        // for (int j = 0; j < lotto.length; j++) {
        // if (num == lotto[j]) {
        // flag = false;
        // }
        // }
        // if (flag) {
        // lotto[i] = num;
        // }
        // if (lotto[5] != 0) {
        // break;
        // }
        // i++;
        // }
        // for (int k = 0; k < lotto.length; k++) {
        // System.out.printf("ball[%d]=%d\n", k+1, lotto[k]);
        // }
        /*
         * 배열...array 같은 타입의 여러 변수들을 하나의 묶음으로 다루는 것을 배열이라고 한다. 예를 들면 100명의 영어성적을 변수로
         * 보관하려면 100개의 변수가 필요하다. 많은양의 데이터를 손쉽게 다룰수 있다. 중요한것은 같은 타입의 데이터들을 하나의 묶음으로 다룬다.
         * 
         * int score1, score2, score3, score4 ....;
         * 
         * int[] score = new int[5]; *** int score[] = new int[5];
         * 
         * 5개의 int 값을 저장할수 있는 배열을 생성 배열은 저장공간이 연속적으로 배치되어야 한다.
         * 
         * 배열 생성시 각 배열의 요소는 자동적으로 0으로 초기화된다.
         * 
         * score[3] = 100; //배열에 넣을때 int a = score[3];//배열에서 꺼낼때
         * 
         */
        // int[] score = new int[5];

        // score[0] = 50;
        // score[1] = 60;
        // score[2] = 70;
        // score[3] = 80;
        // score[4] = 90;

        // int tmp = score[2] + score[4];
        // System.out.println(tmsp);

        // for (int i = 0 ; i < 5 ; i++) {
        // System.out.printf("score[%d]: %d%n" , i , score[i] );
        // }

        // System.out.println(score[5]);

        // 배열의 길이 - 배열을 생성할 때 [] 안에 배열의 길이를 적어야 한다. 배열의 길이는 즉 값을 저장할수 있는 공간의 길이다. 당연히
        // 배열의 길이는 정수로 입력한다. 최대값은 약 20억개이다.

        // 길이가 0인 배열도 생성은 가능하다. 더 중요한 것은 배열을 생성할 때는 반드시 그 길이를 정해주어야만 한다. 한번 생성한 배열의 길이는
        // 수정할 수 없다.

        // int[] score = new int[5];

        // score[0] = 50;
        // score[1] = 60;
        // score[2] = 70;
        // score[3] = 80;
        // score[4] = 90;

        // System.out.println(score.length); //배열의 갯수 구하기

        // for (int i = 0 ; i < score.length ; i++) {
        // System.out.printf("score[%d]: %d%n" , i , score[i] );
        // }

        // 배열의 길이 변경 : 배열은 한번 생성하면 길이를 변경할 수 없다. 사용하다 보면 더 많은 데이터를 저장할 필요성도 발생한다.
        // 원론적으로는 변경을 할수 없으나 더 큰 길이의 새로운 배열을 생성한 다음 기존 배열에 저장된 값들을 새로운 배열로 복사하여 사용한다.
        // 그러나 이러한 작업은 수고와 노력이 필요하기 때문에 처음 부터 배열을 사용할 때는 길이를 넉넉하게 잡아줘서 미연 방지 하자.

        // int[] score = new int[5];

        // for (int i = 0 ; i < score.length ; i++) {
        // System.out.printf("score[%d]: %d%n" , i , score[i] );
        // }

        // for (int i = 0 ; i < score.length; i++) {
        // score[i] = i + 10;
        // }

        // for (int i = 0 ; i < score.length ; i++) {
        // System.out.printf("score[%d]: %d%n" , i , score[i] );
        // }

        // int[] iArr = {1,2,3,4,5};

        // char[] chArr = {'a','b','c','d','e'};

        // System.out.println(Arrays.toString(iArr)); //문자열로 출력

        // System.out.println(Arrays.toString(chArr)); //문자열로 출력

        // 배열의 복사 - 배열은 한번 생성하면 그 길이를 변경할 수 없기 때문에 더 많은 공간 필요해질 경우 새로 큰 배열을 만들고 복사를
        // 해야한다. 배열을 복사하는 2가지 방법을 알아보자.

        // int[] arr = {1,2,3,4,5};
        // int[] tmp = new int[arr.length*2];

        // for (int i = 0 ; i < tmp.length ; i++) {
        // System.out.printf("tmp[%d]: %d%n" , i , tmp[i] );
        // }

        // for (int i = 0 ; i < arr.length; i++) {
        // tmp[i] = arr[i];
        // }

        // for (int i = 0 ; i < tmp.length ; i++) {
        // System.out.printf("tmp[%d]: %d%n" , i , tmp[i] );
        // }

        // System.arraycopy(arg0, arg1, arg2, arg3, arg4);
        // for 대신 System크래스의 arraycopy()매서드를 사용하면 보다 간단하고 빠르게 배열을 복사할 수 있다.
        // for (int i = 0 ; i < arr.length; i++) {
        // tmp[i] = arr[i];
        // }

        // int[] arr = {1,2,3,4,5};
        // int[] tmp = new int[arr.length*2];

        // System.arraycopy(arr, 3, tmp, 1, 2);

        // for (int i = 0 ; i < tmp.length ; i++) {
        // System.out.printf("tmp[%d]: %d%n" , i , tmp[i] );
        // }

        // 1. 총합 평균 ; 배열의 모든 요소를 더해서 총합 평균
        // int[] score = {100, 88, 100, 100, 90};

        // int sum= 0;
        // double avg = 0;

        // for (int a : score ){
        // sum += a;
        // }

        // avg = sum / score.length;

        // System.out.println("총점 : " + sum);
        // System.out.println("평균 : " + avg);

        // 2. 최고점수, 최저점수

        // int[] score = {90, 88, 100, 100, 90};

        // int max = score[0]; // max =90
        // int min = score[0];

        // for (int i = 1 ; i < score.length ; i++) {
        // if (max < score[i]) { // 90 < 88 false 90 < 100 true
        // max = score[i]; // 90 -> 100
        // }
        // if (min > score[i]) {
        // min = score[i];
        // }
        // }

        // System.out.println("최고점수 :" + max);
        // System.out.println("최저점수 :" + min);

        // 로또 번호 6개를 배열로 담아서 출력 (중복 불가)
        // 1 - 45

        // Random rand = new Random();

        // int[] arr = new int[6];

        // for (int i = 0 ; i < 6 ; i ++) {
        // arr[i] = 1 + rand.nextInt(45);

        // for (int j = 0 ; j < i ; j++) {
        // if (arr[i] == arr[j]) {
        // i--;
        // }
        // }
        // }

        // for (int a : arr){
        // System.out.println(a);
        // }

        // String 배열...

        /*
         * 배열의 타입이 String 인 경우에도 int 배열의 선언과 생성 방법은 같다. String[] name = new String[3];
         * 
         * int 기본값이 0으로 생성되었지만 String null로 초기화 된다.
         * 
         * 
         */

        // String[] name = new String[5];
        // name[0] = "Kim";
        // name[1] = "Park";
        // name[2] = "Yi";

        // for ( String n : name ){
        // System.out.println(n);
        // }

        // char배열과 String...
        // 여러 글자 즉 문자열을 저장할때는 String타입의 변수를 사용한다. 사실 문자열이라는 의미는 '문자를 여러개 늘어놓은 것' char
        // 배열이 String이다.
        // 자바에서는 문자열을 char배열이 아닌 String클라스를 사용하여 문자열을 처리하는 이유는 String클래스가 char배열에 여러가지
        // 기능을 추가하여 확장하였기 때문이다. char 를 사용하지 말고 Stirng을 사용하자.
        // C언어에서는 문자열을 char배열로 다룬다.
        // char배열과 String클래스의 한가지 중요한 차이점은 String 객체(문자열)는 읽을 수만 있을 뿐 내용을 변경할 수 없다.
        // immutable

        // 3-15
        Scanner sc = new Scanner(System.in);
        // 4-21
        System.out.print("정방향을 표시합니다.\n단수는:");
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
