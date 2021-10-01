package web_day15;

import java.util.ArrayList;

public class Test extends Thread{
//    public void run(){
//        System.out.println("thread run.");
//    }
//    public void stop(){
//        System.out.println("thread stop.");
//    }
//    public void fly(){
//        System.out.println("thread fly");
//    }

//    public static void main(String[] args) {
//        Test t = new Test();
//        t.start();
//        t.toString();
//        t.
////        t.run();
//    }
    int seq;
    public Test(int seq){
        this.seq=seq;
    }
    public void run(){
        System.out.println("thread start.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(this.seq+" thread end.");
    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            Thread t = new Test(i);
//            t.start();
//        }
//        System.out.println("main ends");
//    }
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Test(i);
            t.run();
            threads.add(t);
        }
        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main ends");
    }






}
