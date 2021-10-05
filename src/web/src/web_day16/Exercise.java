package web_day16;


import sun.util.locale.provider.DateFormatProviderImpl;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static int readPlusInt(int n){
        String result = "";
        while ((n%10)>=1){
            int x = n%10;
            n/=10;
            result += x;
        }
        return Integer.parseInt(result);
    }

    public static int sumOf(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public static int minOf(int[] a){
        int minVal = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]<minVal) minVal=a[i];
        }
        return minVal;
    }

    public static int linearSearch(int[] a, int key){
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static int linearSearchR(int[] a, int key) {
        int index = 0;
        for (int i = a.length-1; i >= 0 ; i--) {
            if (a[i]==key) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // 7-9
        Scanner sc = new Scanner(System.in);
//        int n, choice;
//        do{
//            do {
//                System.out.print("양의 정숫값:");
//                n = sc.nextInt();
//            } while (n <= 0);
//            System.out.println("반대로 읽으면 "+readPlusInt(n)+"입니다.");
//            System.out.print("다시 한 번?<Yes...1/No...0>:");
//            choice = sc.nextInt();
//        } while(choice!=0);
//        System.out.println("==========7-9==========\n");

        // 7-10
        Random rand = new Random();
//        System.out.println("암산 훈련!!!");
//        int x,y,z,answer,choice2; // x,y,z 를 3자리 정수값으로 초기화
//        do {
//            x = 100+ rand.nextInt(899);
//            y = 100+ rand.nextInt(899);
//            z = 100+ rand.nextInt(899);
//            int mode = rand.nextInt(4);
//            String practice = "";
//
//            switch (mode){
//                case 0:
//                    practice = String.format("%d + %d + %d =",x,y,z);
//                    answer = x+y+z;
//                    break;
//                case 1:
//                    practice = String.format("%d + %d - %d =",x,y,z);
//                    answer = x+y-z;
//                    break;
//                case 2:
//                    practice = String.format("%d - %d + %d = ",x,y,z);
//                    answer = x-y+z;
//                    break;
//                default:
//                    practice = String.format("%d - %d - %d = ",x,y,z);
//                    answer = x-y-z;
//            }
//            while (true) {
//                System.out.print(practice);
//                int tt = sc.nextInt();
//                if (tt == answer) break;
//                System.out.println("틀렸습니다!");
//            }
//            System.out.print("다시 한번?<Yes...1/No...0>:");
//            choice2 = sc.nextInt();
//        } while(choice2 !=0);
//        System.out.println("==========7-10==========\n");

        // 7- 15
//        System.out.print("요소 수:");
//        int arLen = sc.nextInt();
//        int [] ar = new int[arLen];
//        for (int i = 0; i < arLen; i++) {
//            System.out.printf("x[%d]:",i);
//            ar[i] = sc.nextInt();
//        }
//        System.out.println("모든 요소의 합은 "+sumOf(ar)+"입니다.");
//        System.out.println("==========7-15==========\n");

        // 7-16
//        System.out.print("사람 수는:");
//        int nums = sc.nextInt();
//        int[] arH = new int[nums];
//        int[] arW = new int[nums];
//        for (int i = 0; i < nums; i++) {
//            System.out.printf("%d번의 신장:",i+1);
//            arH[i] = sc.nextInt();
//            System.out.printf("%d번의 체중:",i+1);
//            arW[i] = sc.nextInt();
//        }
//        System.out.printf("가장 키가 작은 사람의 신장:%dcm\n",minOf(arH));
//        System.out.printf("가장 마른 사람의 체중:%dkg\n",minOf(arW));
//        System.out.println("==========7-16==========\n");

        // 7-17
        System.out.print("요소 수:");
        int numbers = sc.nextInt();
        int[] ar2 = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.printf("x[%d]:",i);
            ar2[i] = sc.nextInt();
        }
        System.out.print("찾는 값:");
        int target = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < ar2.length; i++) {
            if (ar2[i]==target) cnt++;
        }
        if(cnt>1){
            System.out.println("해당 값의 요소가 여러 개 존재합니다.");
        }
        System.out.printf("가장 앞에 위치한 값은 x[%d]에 있습니다.\n",linearSearch(ar2,target));
        System.out.printf("가장 뒤에 위치한 값은 x[%d]에 있습니다.\n",linearSearchR(ar2,target));
        System.out.println("==========7-17==========\n");
    }
}
