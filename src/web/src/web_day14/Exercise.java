package web_day14;


import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static int med(int a, int b, int c){
        int mid;
        if(a<b&&a>c||a<c&&a>b) mid=a;
        else if(b<a&&b>c||b<c&&b>a) mid=b;
        else mid=c;
        return mid;
    }

    public static int sumUp(int n){
        int sum=0;
        for (int i = 1; i < n+1; i++) {
            sum+=i;
        }
        return sum;
    }

    public static void printSeason(int m){
        String season;
        switch (m){
            case 3: case 4: case 5:
                season = "봄";
                break;
            case 6: case 7: case 8:
                season = "여름";
                break;
            case 9: case 10: case 11:
                season = "가을";
                break;
            default: season = "겨울";
        }
        System.out.print("해당 월의 계절은 "+season+"입니다.");
    }

    public static void putChar(char c, int n, int index){
        for (int i = 0; i < index+1; i++) {
            System.out.print(c);
        } // 문자 c를 n개 표시하는 메서드
    }

    public static void putStart(int n){
        for (int i = 0; i < n; i++) {
            putChar('*',n,i);
            System.out.println();
        }
    }

    public static int random(int a, int b){
        Random rand = new Random();
        int randInt;
//        rand.nextInt(boundary) 는 0~boundary-1 까지의 값이다
        // 10 ~ 99 라고 하면 nextIn(89)+10을 하면 된다 즉 boundary(b-a) + a
        if (b<=a) return a; // b가 a 보다 작거나 같을경우 그대로 반환
        randInt = a+ rand.nextInt(b-a);
        return randInt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 7-3
//        System.out.print("정수 a:");
//        int a= sc.nextInt();
//        System.out.print("정수 b:");
//        int b = sc.nextInt();
//        System.out.print("정수 c:");
//        int c= sc.nextInt();
//        System.out.println("중간값은 "+med(a,b,c)+"입니다.");
//        System.out.println("==========7-3==========\n");

        // 7-4
//        System.out.print("1부터 x까지의 합을 구하자.\nx의 값:");
//        int x= sc.nextInt();
//        System.out.println("1부터 5까지의 합은 "+sumUp(x)+"입니다.");
//        System.out.println("==========7-4==========\n");

        // 7-6
//        System.out.print("몇 월입니까(1~12):");
//        int m = sc.nextInt();
//        printSeason(m);
//        System.out.println("==========7-6==========\n");

        // 7-7
//        System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.\n단수는:");
//        int num = sc.nextInt();
//        putStart(num);
//        System.out.println("==========7-7==========\n");

        // 7-8
        System.out.print("난수를 생성합니다.\n하한값:");
        int z = sc.nextInt();
        System.out.print("상한값:");
        int x = sc.nextInt();
        System.out.println("생성한 난수는 "+random(z,x)+"입니다.");
    }
}
