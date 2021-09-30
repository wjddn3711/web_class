package web_day13;

import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void signOf(int x){
        if (x>0) System.out.println("signOf(x)는 1입니다.");
        else if (x<0) System.out.println("signOf(x)는 -1입니다.");
        else System.out.println("signOf(x)는 0입니다.");
    }
    public static int min(int q, int w, int e){
        int min = q;
        if (min>w){
            if(w<e) min=w;
            else min=e;
        }
        else{
            if(min>e) min=e;
            else min=q;
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();



        // 6-15
//        String [] month = {"January","February","March","April","May","June",
//                "July","August","September","October","November","December"};
//        int[] checkDup = new int[1]; // 0번째에는 이전 월이 1번째에는 다음월이
//        int choice = 1, mon=0;
//        System.out.println("해당 월의 영어 단어를 입력하시오.\n첫 글자는 대문자," +
//                "나머지는 소문자로 입력하세요.");
//        String answer ="";
//        while (true){
//            while(true){
//                mon = 1+rand.nextInt(12); //1~12까지의 월
//                if (checkDup[0]!=mon) {
//                    // 이전에 출제된 월이 아니라면
//                    checkDup[0] = mon;
//                    break;
//                }
//            }
//            while (true){
//                System.out.printf("%d월:",mon);
//                answer = sc.next(); // 답을 초기화
//                if (answer.equals(month[mon-1])) {
//                    break;
//                }
//                else {
//                    System.out.println("틀렸습니다.");
//                }
//            }
//                    System.out.print("정답입니다. 다시 한번? 1...Yes/0...No:");
//                    choice = sc.nextInt(); // 선택 초기화 1이라면 탈출
//            if (choice==0) break;
//        }
//        System.out.println("==========6-15==========");

        // 6-15
        String[] day = {"monday","tuesday","wednesday","thursday","friday",
        "saturday","sunday"};
        String[] koDay = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
        int[] dupDate = new int[1];
        int choice1 = 1, date=0;
        System.out.println("요일명을 영어 소문자로 입력하시오.");
        String ans = "";
        while (true){
            // 동일 요일을 연속해서 표시하지 않도록
            while(true){
                date = 1+rand.nextInt(7); //1~12까지의 월
                if (dupDate[0]!=date) {
                    // 이전에 출제된 월이 아니라면
                    dupDate[0] = date;
                    break;
                }
            }
            while (true){
                System.out.printf("%s:",koDay[date-1]);
                ans = sc.nextLine(); // 답을 초기화
                if (ans.equals(day[date-1])) break;
                System.out.println("틀렸습니다.");
            }
            System.out.print("정답입니다. 다시 한번? 1...Yes/0...No:");
            choice1 = sc.nextInt(); // 선택 초기화 1이라면 탈출
            if (choice1==0) break;
        }
        System.out.println("==========6-15==========");

        // 6-18
//        int[][] a = new int[4][3];
//        int[][] b= new int[3][4];

        // 7-1
//        System.out.print("정수 x:");
//        int x = sc.nextInt();
//        signOf(x);
//        System.out.println("==========7-1==========");
//
//        // 7-2
//        System.out.print("정수 a:");
//        int a = sc.nextInt();
//        System.out.print("정수 b:");
//        int b = sc.nextInt();
//        System.out.print("정수 c:");
//        int c = sc.nextInt();
//        System.out.println(min(a,b,c));
//        System.out.println("==========7-2==========");

    }
}
