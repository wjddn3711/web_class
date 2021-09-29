package web_day13;

public class Dog extends Animal{
    public void sleep(){
        System.out.println(this.name+" zzzzz");
    }

    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.setName("poppy");
        System.out.println(d1.name);
        d1.sleep();
    }
}
