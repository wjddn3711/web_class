import java.util.Scanner;

public class Some {
    public static void main(String[] args) {
        // if - else if
        /*
         * if (조건식) { 수행 구문 } else if(조건식) }{ 수행 구문 }.... else:{ 수행 구문 } 첫번째 조건식부터 순서대로
         * 평가해서 참인 조건식을 만나면 그 행당 블럭만 수행하고 벗어난다
         * 
         */
        int score = 0;
        char grade = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 점수를 입력하세요:");
        score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("학생의 학점은 " + grade + " 입니다");

    }
}
