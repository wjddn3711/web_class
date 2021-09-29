package web_day13;

public class ZooKeeper {
//    public void feed(Tiger t1){
//        System.out.println("feed apple");
//    }
//    public void feed(Lion l1){
//        System.out.println("feed banana");
//    }
    public void feed(Predator predator){
        System.out.println("feed "+ predator.getFood());
    }
    // tiger lion 각각 predator 인터페이스의 객체이기도 하다
    // 이와 같이 객체가 하나 이상의 자료형 타입을 갖게 되는 특성을 다형성 이라고 한다


    public static void main(String[] args) {
        ZooKeeper k1 = new ZooKeeper();
        Tiger t1 = new Tiger();
        Lion l1 = new Lion();
        Crocodile c1 = new Crocodile();
        k1.feed(c1);
        k1.feed(t1);
        k1.feed(l1);
    }
}
