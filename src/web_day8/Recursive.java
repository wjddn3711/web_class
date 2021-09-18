package web_day8;

public class Recursive {
    // static int fact(int n) {
    // if (n == 1) {
    // return 1;
    // } else {
    // return n * fact(n - 1);
    // }
    // }

    // 재귀 호출 - 매서드 안에서 자기 자신 메서드를 다시 호출
    /*
     * void method() { method() }
     * 
     * void method(int n){ if(n==0) return syso("n") method(n-1); } // 재귀는 비 효율적이다.
     * 재귀 호출에 드는 비용보다 재귀 호출의 간결함이 주는 이득이 충분할 경우에만 사용하자
     */
    public static void main(String[] args) {

        int result = add(1);
        System.out.println(result);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    static int add(int n) {
        if (n == 10) {
            return 10;
        } else {
            return n + add(n + 1);
        }
    }

}
