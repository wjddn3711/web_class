package web_day12;

public class Child extends Parent{
    void method(){
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}
