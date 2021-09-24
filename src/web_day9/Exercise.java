package web_day9;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        // int limit = 10, answer = rand.nextInt(100);
        // System.out.println("숫자 맞추기 게임 시작!\n0부터 99사이의 숫자를 맞추세요.");
        // for (int i = 1; i < limit; i++) {
        // System.out.printf("남은 횟수 %d회, 어떤 숫자일까?:", limit - i);
        // int num = sc.nextInt();
        // if (num == answer) {
        // System.out.println(i + "회만에 맞추었습니다.");
        // break;
        // } else if (num < answer) {
        // System.out.println("더 큰 숫자입니다.");
        // } else {
        // System.out.println("더 작은 숫자입니다.");
        // }
        // }
        // System.out.println("\n==========4-30==========\n");
        // double[] ar = new double[5];
        // for (int i = 0; i < ar.length; i++) {
        // System.out.printf("a[%d]= %.1f\n", i, ar[i]);
        // }
        // System.out.println("\n==========6-1==========\n");

        int[] ar2 = new int[5];
        for (int i = 0; i < ar2.length; i++) {
            System.out.printf("a[%d] = ", i);
            ar2[i] = sc.nextInt();
        }
        System.out.println("\n==========6-2==========\n");

        // double[] ar3 = new double[5];
        // for (int i = 0; i < ar3.length; i++) {
        // ar3[i] = 1.1 * (i + 1);
        // System.out.printf("a[%d]= %.1f\n", i, ar3[i]);
        // }
        // System.out.println("\n==========6-3==========\n");
        // System.out.print("요소 수:");
        // int n = sc.nextInt();
        // int[] ar4 = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.printf("a[%d] = ", i);
        // ar4[i] = sc.nextInt();
        // }
        // System.out.print("a = {");
        // for (int i = 0; i < ar4.length; i++) {
        // if (i == ar4.length - 1)
        // System.out.printf("%d}\n", ar4[i]);
        // else
        // System.out.printf("%d, ", ar4[i]);
        // }
        // System.out.println("\n==========6-6==========\n");

    }
}
