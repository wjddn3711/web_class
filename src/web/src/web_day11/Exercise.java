package web_day11;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // 6-8
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ",i);
            a[i] = sc.nextInt();
        }
        System.out.print("찾을 숫자:");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(a[i]==target){
                System.out.printf("그 값은 a[%d]에 있습니다.\n",i);
                break;
            }
        }
        System.out.println("\n==========6-8==========\n");
//         6-11
        System.out.print("요소 수:");
        Random rand = new Random();
        int num = sc.nextInt();
        int[] ar = new int[num];
        ar[0] = 1+rand.nextInt(10);
        int k = 1;
        while (true){
            int x = 1+rand.nextInt(9); //1에서 9까지 난수생성
            ar[k]=x;
            if (x==ar[k-1]) continue;
            else k++;
            if (ar[num-1]!=0) break;
        }
        for (int j = 0; j < num; j++) {
            System.out.printf("a[%d] = %d\n",j,ar[j]);
        }
        System.out.println("\n==========6-11==========\n");
//         6-12
        System.out.print("요소 수:");
        int n2 = sc.nextInt();
        int[] ar2 = new int[n2];
        int index=0;
        while (true){
            int x = 1+rand.nextInt(10); //1에서 9까지 난수생성
            ar2[index]=x;
            index ++;
            for (int i = 0; i < n2; i++) {
                if (x==ar2[i]&&i!=index-1) {
                    index--;
                    // 만약 생성된 난수가 기존 배열에 존재하면 다시 입력 받도록
                    break;
                }
            }
            if (index==n2) break;
        }
        for (int j = 0; j < n2; j++) {
            System.out.printf("a[%d] = %d\n",j,ar2[j]);
        }
        System.out.println("\n==========6-12==========\n");

//         6-13
        System.out.print("요소 수:");
        int n3 = sc.nextInt();
        int[] ar3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            System.out.printf("a[%d] = ",i);
            ar3[i] =sc.nextInt();
        }
        int x=0, y=0, temp=0;
        for (int i = 0; i <10; i++) {
            x = rand.nextInt(n3);
            while(true){
                y = rand.nextInt(n3);
                if (y!=x) break;
            }
            temp= ar3[x];
            ar3[x] = ar3[y];
            ar3[y] = temp;
        }
        System.out.println("요소를 섞었습니다");
        for (int i = 0; i < n3; i++) {
            System.out.printf("a[%d] = %d\n",i,ar3[i]);
        }
        System.out.println("\n==========6-13==========\n");

        // 6-14
        System.out.print("요소 수:");
        int n4 = sc.nextInt();
        int[] ar4 = new int[n4];
        int[] b = new int[n4];
        int t = 0;
        for (int i = 0; i < n4; i++) {
            System.out.printf("a[%d] = ",i);
            t =sc.nextInt();
            ar4[i]=t;
            b[n4-1-i] = t;
        }
        System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
        for (int i = 0; i < n4; i++) {
            System.out.printf("b[%d] = %d\n",i,b[i]);
        }
        System.out.println("\n==========6-14==========\n");



    }
}
